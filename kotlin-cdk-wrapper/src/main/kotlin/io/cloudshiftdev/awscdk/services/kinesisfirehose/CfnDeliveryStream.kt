@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::KinesisFirehose::DeliveryStream` resource specifies an Amazon Kinesis Data Firehose
 * (Kinesis Data Firehose) delivery stream that delivers real-time streaming data to an Amazon Simple
 * Storage Service (Amazon S3), Amazon Redshift, or Amazon Elasticsearch Service (Amazon ES)
 * destination.
 *
 * For more information, see [Creating an Amazon Kinesis Data Firehose Delivery
 * Stream](https://docs.aws.amazon.com/firehose/latest/dev/basic-create.html) in the *Amazon Kinesis
 * Data Firehose Developer Guide* .
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
public open class CfnDeliveryStream internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryStreamProps,
  ) :
      this(software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeliveryStreamProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeliveryStreamProps(props)
  )

  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   */
  public open fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
      unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   */
  public open fun amazonOpenSearchServerlessDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setAmazonOpenSearchServerlessDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   */
  public open
      fun amazonOpenSearchServerlessDestinationConfiguration(`value`: AmazonOpenSearchServerlessDestinationConfigurationProperty) {
    unwrap(this).setAmazonOpenSearchServerlessDestinationConfiguration(`value`.let(AmazonOpenSearchServerlessDestinationConfigurationProperty::unwrap))
  }

  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5915aff60f1d0638bdfbba93b505f7af60bc52a040509a536e5bc8da8cb6e601")
  public open
      fun amazonOpenSearchServerlessDestinationConfiguration(`value`: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      amazonOpenSearchServerlessDestinationConfiguration(AmazonOpenSearchServerlessDestinationConfigurationProperty(`value`))

  /**
   * The destination in Amazon OpenSearch Service.
   */
  public open fun amazonopensearchserviceDestinationConfiguration(): Any? =
      unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

  /**
   * The destination in Amazon OpenSearch Service.
   */
  public open fun amazonopensearchserviceDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setAmazonopensearchserviceDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The destination in Amazon OpenSearch Service.
   */
  public open
      fun amazonopensearchserviceDestinationConfiguration(`value`: AmazonopensearchserviceDestinationConfigurationProperty) {
    unwrap(this).setAmazonopensearchserviceDestinationConfiguration(`value`.let(AmazonopensearchserviceDestinationConfigurationProperty::unwrap))
  }

  /**
   * The destination in Amazon OpenSearch Service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("affac0fd96543f0259c27aabaa403cc003377ad41286e7a11605b10abb98413c")
  public open
      fun amazonopensearchserviceDestinationConfiguration(`value`: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      amazonopensearchserviceDestinationConfiguration(AmazonopensearchserviceDestinationConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the delivery stream, such as
   * `arn:aws:firehose:us-east-2:123456789012:deliverystream/delivery-stream-name` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   */
  public open fun deliveryStreamEncryptionConfigurationInput(): Any? =
      unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   */
  public open fun deliveryStreamEncryptionConfigurationInput(`value`: IResolvable) {
    unwrap(this).setDeliveryStreamEncryptionConfigurationInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   */
  public open
      fun deliveryStreamEncryptionConfigurationInput(`value`: DeliveryStreamEncryptionConfigurationInputProperty) {
    unwrap(this).setDeliveryStreamEncryptionConfigurationInput(`value`.let(DeliveryStreamEncryptionConfigurationInputProperty::unwrap))
  }

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d97c001fdb104637b35834a93311f749d1616ef59ea428fa2f03a567a389c537")
  public open
      fun deliveryStreamEncryptionConfigurationInput(`value`: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
      Unit =
      deliveryStreamEncryptionConfigurationInput(DeliveryStreamEncryptionConfigurationInputProperty(`value`))

  /**
   * The name of the delivery stream.
   */
  public open fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

  /**
   * The name of the delivery stream.
   */
  public open fun deliveryStreamName(`value`: String) {
    unwrap(this).setDeliveryStreamName(`value`)
  }

  /**
   * The delivery stream type.
   *
   * This can be one of the following values:.
   */
  public open fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

  /**
   * The delivery stream type.
   *
   * This can be one of the following values:.
   */
  public open fun deliveryStreamType(`value`: String) {
    unwrap(this).setDeliveryStreamType(`value`)
  }

  /**
   * An Amazon ES destination for the delivery stream.
   */
  public open fun elasticsearchDestinationConfiguration(): Any? =
      unwrap(this).getElasticsearchDestinationConfiguration()

  /**
   * An Amazon ES destination for the delivery stream.
   */
  public open fun elasticsearchDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setElasticsearchDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An Amazon ES destination for the delivery stream.
   */
  public open
      fun elasticsearchDestinationConfiguration(`value`: ElasticsearchDestinationConfigurationProperty) {
    unwrap(this).setElasticsearchDestinationConfiguration(`value`.let(ElasticsearchDestinationConfigurationProperty::unwrap))
  }

  /**
   * An Amazon ES destination for the delivery stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41dc2f36d2a4d49721f6662c6fc1465511d3560e22d6649372fda8b2129f1027")
  public open
      fun elasticsearchDestinationConfiguration(`value`: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      elasticsearchDestinationConfiguration(ElasticsearchDestinationConfigurationProperty(`value`))

  /**
   * An Amazon S3 destination for the delivery stream.
   */
  public open fun extendedS3DestinationConfiguration(): Any? =
      unwrap(this).getExtendedS3DestinationConfiguration()

  /**
   * An Amazon S3 destination for the delivery stream.
   */
  public open fun extendedS3DestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setExtendedS3DestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An Amazon S3 destination for the delivery stream.
   */
  public open
      fun extendedS3DestinationConfiguration(`value`: ExtendedS3DestinationConfigurationProperty) {
    unwrap(this).setExtendedS3DestinationConfiguration(`value`.let(ExtendedS3DestinationConfigurationProperty::unwrap))
  }

  /**
   * An Amazon S3 destination for the delivery stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3250254b74951e4534cc96e8656961d1ad33f390c4ae19922de92a0577a4c5cf")
  public open
      fun extendedS3DestinationConfiguration(`value`: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = extendedS3DestinationConfiguration(ExtendedS3DestinationConfigurationProperty(`value`))

  /**
   * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
   */
  public open fun httpEndpointDestinationConfiguration(): Any? =
      unwrap(this).getHttpEndpointDestinationConfiguration()

  /**
   * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
   */
  public open fun httpEndpointDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setHttpEndpointDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
   */
  public open
      fun httpEndpointDestinationConfiguration(`value`: HttpEndpointDestinationConfigurationProperty) {
    unwrap(this).setHttpEndpointDestinationConfiguration(`value`.let(HttpEndpointDestinationConfigurationProperty::unwrap))
  }

  /**
   * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1127a1e2b30c9ee0de3b6d01c0f51cd4166ed22309696e81146f613d60dfac6")
  public open
      fun httpEndpointDestinationConfiguration(`value`: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      httpEndpointDestinationConfiguration(HttpEndpointDestinationConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * When a Kinesis stream is used as the source for the delivery stream, a
   * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   * containing the Kinesis stream ARN and the role ARN for the source stream.
   */
  public open fun kinesisStreamSourceConfiguration(): Any? =
      unwrap(this).getKinesisStreamSourceConfiguration()

  /**
   * When a Kinesis stream is used as the source for the delivery stream, a
   * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   * containing the Kinesis stream ARN and the role ARN for the source stream.
   */
  public open fun kinesisStreamSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setKinesisStreamSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * When a Kinesis stream is used as the source for the delivery stream, a
   * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   * containing the Kinesis stream ARN and the role ARN for the source stream.
   */
  public open
      fun kinesisStreamSourceConfiguration(`value`: KinesisStreamSourceConfigurationProperty) {
    unwrap(this).setKinesisStreamSourceConfiguration(`value`.let(KinesisStreamSourceConfigurationProperty::unwrap))
  }

  /**
   * When a Kinesis stream is used as the source for the delivery stream, a
   * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   * containing the Kinesis stream ARN and the role ARN for the source stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bec64671a039e7f3d600db5b2deafee114b7c8e96a1fcfbb22df4156cfd7d246")
  public open
      fun kinesisStreamSourceConfiguration(`value`: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
      Unit = kinesisStreamSourceConfiguration(KinesisStreamSourceConfigurationProperty(`value`))

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   */
  public open fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   */
  public open fun mskSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setMskSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   */
  public open fun mskSourceConfiguration(`value`: MSKSourceConfigurationProperty) {
    unwrap(this).setMskSourceConfiguration(`value`.let(MSKSourceConfigurationProperty::unwrap))
  }

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bca8e7b137f0a0fbd4a5462a4adc2507b4bcb66dc4c94ead43a482bd58ce901")
  public open
      fun mskSourceConfiguration(`value`: MSKSourceConfigurationProperty.Builder.() -> Unit): Unit =
      mskSourceConfiguration(MSKSourceConfigurationProperty(`value`))

  /**
   * An Amazon Redshift destination for the delivery stream.
   */
  public open fun redshiftDestinationConfiguration(): Any? =
      unwrap(this).getRedshiftDestinationConfiguration()

  /**
   * An Amazon Redshift destination for the delivery stream.
   */
  public open fun redshiftDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setRedshiftDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An Amazon Redshift destination for the delivery stream.
   */
  public open
      fun redshiftDestinationConfiguration(`value`: RedshiftDestinationConfigurationProperty) {
    unwrap(this).setRedshiftDestinationConfiguration(`value`.let(RedshiftDestinationConfigurationProperty::unwrap))
  }

  /**
   * An Amazon Redshift destination for the delivery stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e417d11ce2a0067772fc8122139fd232a8c8188f3bcfd5df15c67b5007845752")
  public open
      fun redshiftDestinationConfiguration(`value`: RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = redshiftDestinationConfiguration(RedshiftDestinationConfigurationProperty(`value`))

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   */
  public open fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   */
  public open fun s3DestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setS3DestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   */
  public open fun s3DestinationConfiguration(`value`: S3DestinationConfigurationProperty) {
    unwrap(this).setS3DestinationConfiguration(`value`.let(S3DestinationConfigurationProperty::unwrap))
  }

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15cf8a750eb93a46accbc857845d3567e9cc409852bfea7fd2dff5a5f990a6e9")
  public open
      fun s3DestinationConfiguration(`value`: S3DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = s3DestinationConfiguration(S3DestinationConfigurationProperty(`value`))

  /**
   * Configure Snowflake destination.
   */
  public open fun snowflakeDestinationConfiguration(): Any? =
      unwrap(this).getSnowflakeDestinationConfiguration()

  /**
   * Configure Snowflake destination.
   */
  public open fun snowflakeDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setSnowflakeDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configure Snowflake destination.
   */
  public open
      fun snowflakeDestinationConfiguration(`value`: SnowflakeDestinationConfigurationProperty) {
    unwrap(this).setSnowflakeDestinationConfiguration(`value`.let(SnowflakeDestinationConfigurationProperty::unwrap))
  }

  /**
   * Configure Snowflake destination.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("abfbb4a67b1231a5f5ff6a4e3ac8e545473af9b6c88236f592b452affc85ac89")
  public open
      fun snowflakeDestinationConfiguration(`value`: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = snowflakeDestinationConfiguration(SnowflakeDestinationConfigurationProperty(`value`))

  /**
   * The configuration of a destination in Splunk for the delivery stream.
   */
  public open fun splunkDestinationConfiguration(): Any? =
      unwrap(this).getSplunkDestinationConfiguration()

  /**
   * The configuration of a destination in Splunk for the delivery stream.
   */
  public open fun splunkDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setSplunkDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of a destination in Splunk for the delivery stream.
   */
  public open fun splunkDestinationConfiguration(`value`: SplunkDestinationConfigurationProperty) {
    unwrap(this).setSplunkDestinationConfiguration(`value`.let(SplunkDestinationConfigurationProperty::unwrap))
  }

  /**
   * The configuration of a destination in Splunk for the delivery stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c527b6fdd45ed69e81e7fcdb61119b8c6e5e1991b9774c5fc0ee38f22cb08e59")
  public open
      fun splunkDestinationConfiguration(`value`: SplunkDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = splunkDestinationConfiguration(SplunkDestinationConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A set of tags to assign to the delivery stream.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A set of tags to assign to the delivery stream.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A set of tags to assign to the delivery stream.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisfirehose.CfnDeliveryStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable)

    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty)

    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6853de422f2e16dfe8a986fcc9f02e63b77b55179c8bebfbbec5b5200944acd")
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable)

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty)

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0e750dd8298dba0e5c02f301c88e6a2f91f32b1eb4c4d5bf8cd380c5a643229")
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable)

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty)

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab692c19801842492183b9e872222254e095277511bf02e81be652274d244d1")
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit)

    /**
     * The name of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
     * @param deliveryStreamName The name of the delivery stream. 
     */
    public fun deliveryStreamName(deliveryStreamName: String)

    /**
     * The delivery stream type. This can be one of the following values:.
     *
     * * `DirectPut` : Provider applications access the delivery stream directly.
     * * `KinesisStreamAsSource` : The delivery stream uses a Kinesis data stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
     * @param deliveryStreamType The delivery stream type. This can be one of the following values:.
     * 
     */
    public fun deliveryStreamType(deliveryStreamType: String)

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable)

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty)

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e250eef7235cc63f426265344f51a8ff69fcc8cd948c0e67f937d5bdf1245fd")
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit)

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable)

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty)

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("804c0ad62fefcbd3a84762891f680a28e32d801c8adae97f7dc25df681c39728")
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable)

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty)

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02bda40d7d17a3bea2aa4bdc2c92fe46910fdb0919bfd3fc4954f2bc133f5a85")
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable)

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty)

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8ff51ace8046f164b30f7b7c7ac9b9cad0a6405a4a04f198383d16b4f369f2")
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    public fun mskSourceConfiguration(mskSourceConfiguration: IResolvable)

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    public fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty)

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167b672ab608a479965f8b9832f5d781f2ea06250b1edf2687df728d87242969")
    public
        fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty.Builder.() -> Unit)

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable)

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty)

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cb5c9a75ab0d5d3125ae16330f7f4a07f9daa3f09b90f46df915fd8c345a18")
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty.Builder.() -> Unit)

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty)

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef601312d98974061b66bd8152f76623e6f4dd72a5526c35dd1f6c5850f24c0")
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    public fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable)

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty)

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15cbf3df7ca5c2d9edaafbedfcc169f3791bdb7c223e6bb201410f57eb9bb10c")
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable)

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty)

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b63f26c8956fbfe5ba15ca0ae73dd495f67dee4d1673fd29dff176ebbeaef6e")
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the delivery stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     * @param tags A set of tags to assign to the delivery stream. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the delivery stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     * @param tags A set of tags to assign to the delivery stream. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.Builder.create(scope, id)

    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(AmazonOpenSearchServerlessDestinationConfigurationProperty::unwrap))
    }

    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6853de422f2e16dfe8a986fcc9f02e63b77b55179c8bebfbbec5b5200944acd")
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonOpenSearchServerlessDestinationConfiguration(AmazonOpenSearchServerlessDestinationConfigurationProperty(amazonOpenSearchServerlessDestinationConfiguration))

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(AmazonopensearchserviceDestinationConfigurationProperty::unwrap))
    }

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0e750dd8298dba0e5c02f301c88e6a2f91f32b1eb4c4d5bf8cd380c5a643229")
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonopensearchserviceDestinationConfiguration(AmazonopensearchserviceDestinationConfigurationProperty(amazonopensearchserviceDestinationConfiguration))

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(IResolvable::unwrap))
    }

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(DeliveryStreamEncryptionConfigurationInputProperty::unwrap))
    }

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab692c19801842492183b9e872222254e095277511bf02e81be652274d244d1")
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        deliveryStreamEncryptionConfigurationInput(DeliveryStreamEncryptionConfigurationInputProperty(deliveryStreamEncryptionConfigurationInput))

    /**
     * The name of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
     * @param deliveryStreamName The name of the delivery stream. 
     */
    override fun deliveryStreamName(deliveryStreamName: String) {
      cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * The delivery stream type. This can be one of the following values:.
     *
     * * `DirectPut` : Provider applications access the delivery stream directly.
     * * `KinesisStreamAsSource` : The delivery stream uses a Kinesis data stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
     * @param deliveryStreamType The delivery stream type. This can be one of the following values:.
     * 
     */
    override fun deliveryStreamType(deliveryStreamType: String) {
      cdkBuilder.deliveryStreamType(deliveryStreamType)
    }

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(IResolvable::unwrap))
    }

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(ElasticsearchDestinationConfigurationProperty::unwrap))
    }

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
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e250eef7235cc63f426265344f51a8ff69fcc8cd948c0e67f937d5bdf1245fd")
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        elasticsearchDestinationConfiguration(ElasticsearchDestinationConfigurationProperty(elasticsearchDestinationConfiguration))

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(IResolvable::unwrap))
    }

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(ExtendedS3DestinationConfigurationProperty::unwrap))
    }

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
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("804c0ad62fefcbd3a84762891f680a28e32d801c8adae97f7dc25df681c39728")
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        extendedS3DestinationConfiguration(ExtendedS3DestinationConfigurationProperty(extendedS3DestinationConfiguration))

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(HttpEndpointDestinationConfigurationProperty::unwrap))
    }

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02bda40d7d17a3bea2aa4bdc2c92fe46910fdb0919bfd3fc4954f2bc133f5a85")
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        httpEndpointDestinationConfiguration(HttpEndpointDestinationConfigurationProperty(httpEndpointDestinationConfiguration))

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    override fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(KinesisStreamSourceConfigurationProperty::unwrap))
    }

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8ff51ace8046f164b30f7b7c7ac9b9cad0a6405a4a04f198383d16b4f369f2")
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSourceConfiguration(KinesisStreamSourceConfigurationProperty(kinesisStreamSourceConfiguration))

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    override fun mskSourceConfiguration(mskSourceConfiguration: IResolvable) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    override fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(MSKSourceConfigurationProperty::unwrap))
    }

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167b672ab608a479965f8b9832f5d781f2ea06250b1edf2687df728d87242969")
    override
        fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty.Builder.() -> Unit):
        Unit = mskSourceConfiguration(MSKSourceConfigurationProperty(mskSourceConfiguration))

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    override fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(IResolvable::unwrap))
    }

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(RedshiftDestinationConfigurationProperty::unwrap))
    }

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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cb5c9a75ab0d5d3125ae16330f7f4a07f9daa3f09b90f46df915fd8c345a18")
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        redshiftDestinationConfiguration(RedshiftDestinationConfigurationProperty(redshiftDestinationConfiguration))

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable::unwrap))
    }

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(S3DestinationConfigurationProperty::unwrap))
    }

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
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef601312d98974061b66bd8152f76623e6f4dd72a5526c35dd1f6c5850f24c0")
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        s3DestinationConfiguration(S3DestinationConfigurationProperty(s3DestinationConfiguration))

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    override fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(SnowflakeDestinationConfigurationProperty::unwrap))
    }

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     * @param snowflakeDestinationConfiguration Configure Snowflake destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15cbf3df7ca5c2d9edaafbedfcc169f3791bdb7c223e6bb201410f57eb9bb10c")
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        snowflakeDestinationConfiguration(SnowflakeDestinationConfigurationProperty(snowflakeDestinationConfiguration))

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    override fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(SplunkDestinationConfigurationProperty::unwrap))
    }

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b63f26c8956fbfe5ba15ca0ae73dd495f67dee4d1673fd29dff176ebbeaef6e")
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        splunkDestinationConfiguration(SplunkDestinationConfigurationProperty(splunkDestinationConfiguration))

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the delivery stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     * @param tags A set of tags to assign to the delivery stream. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the delivery stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     * @param tags A set of tags to assign to the delivery stream. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliveryStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliveryStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream):
        CfnDeliveryStream = CfnDeliveryStream(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryStream):
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream = wrapped.cdkObject
  }

  /**
   * Specifies the schema to which you want Firehose to configure your data before it writes it to
   * Amazon S3.
   *
   * This parameter is required if `Enabled` is set to true.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SchemaConfigurationProperty schemaConfigurationProperty = SchemaConfigurationProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .region("region")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html)
   */
  public interface SchemaConfigurationProperty {
    /**
     * The ID of the AWS Glue Data Catalog.
     *
     * If you don't supply this, the AWS account ID is used by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * Specifies the name of the AWS Glue database that contains the schema for the output data.
     *
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `DatabaseName` property is required and its value must be
     * specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * If you don't specify an AWS Region, the default is the current Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * The role that Firehose can use to access AWS Glue.
     *
     * This role must be in the same account you use for Firehose. Cross-account roles aren't
     * allowed.
     *
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `RoleARN` property is required and its value must be
     * specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Specifies the AWS Glue table that contains the column information that constitutes your data
     * schema.
     *
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `TableName` property is required and its value must be
     * specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-tablename)
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * Specifies the table version for the output data schema.
     *
     * If you don't specify this version ID, or if you set it to `LATEST` , Firehose uses the most
     * recent version. This means that any updates to the table are automatically picked up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-versionid)
     */
    public fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * A builder for [SchemaConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The ID of the AWS Glue Data Catalog.
       * If you don't supply this, the AWS account ID is used by default.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName Specifies the name of the AWS Glue database that contains the schema
       * for the output data.
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `DatabaseName` property is required and its value must be
       * specified.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param region If you don't specify an AWS Region, the default is the current Region.
       */
      public fun region(region: String)

      /**
       * @param roleArn The role that Firehose can use to access AWS Glue.
       * This role must be in the same account you use for Firehose. Cross-account roles aren't
       * allowed.
       *
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `RoleARN` property is required and its value must be
       * specified.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param tableName Specifies the AWS Glue table that contains the column information that
       * constitutes your data schema.
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `TableName` property is required and its value must be
       * specified.
       */
      public fun tableName(tableName: String)

      /**
       * @param versionId Specifies the table version for the output data schema.
       * If you don't specify this version ID, or if you set it to `LATEST` , Firehose uses the most
       * recent version. This means that any updates to the table are automatically picked up.
       */
      public fun versionId(versionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty.builder()

      /**
       * @param catalogId The ID of the AWS Glue Data Catalog.
       * If you don't supply this, the AWS account ID is used by default.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName Specifies the name of the AWS Glue database that contains the schema
       * for the output data.
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `DatabaseName` property is required and its value must be
       * specified.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param region If you don't specify an AWS Region, the default is the current Region.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param roleArn The role that Firehose can use to access AWS Glue.
       * This role must be in the same account you use for Firehose. Cross-account roles aren't
       * allowed.
       *
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `RoleARN` property is required and its value must be
       * specified.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param tableName Specifies the AWS Glue table that contains the column information that
       * constitutes your data schema.
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `TableName` property is required and its value must be
       * specified.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param versionId Specifies the table version for the output data schema.
       * If you don't specify this version ID, or if you set it to `LATEST` , Firehose uses the most
       * recent version. This means that any updates to the table are automatically picked up.
       */
      override fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty,
    ) : CdkObject(cdkObject), SchemaConfigurationProperty {
      /**
       * The ID of the AWS Glue Data Catalog.
       *
       * If you don't supply this, the AWS account ID is used by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * Specifies the name of the AWS Glue database that contains the schema for the output data.
       *
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `DatabaseName` property is required and its value must be
       * specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * If you don't specify an AWS Region, the default is the current Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * The role that Firehose can use to access AWS Glue.
       *
       * This role must be in the same account you use for Firehose. Cross-account roles aren't
       * allowed.
       *
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `RoleARN` property is required and its value must be
       * specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * Specifies the AWS Glue table that contains the column information that constitutes your
       * data schema.
       *
       *
       * If the `SchemaConfiguration` request parameter is used as part of invoking the
       * `CreateDeliveryStream` API, then the `TableName` property is required and its value must be
       * specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()

      /**
       * Specifies the table version for the output data schema.
       *
       * If you don't specify this version ID, or if you set it to `LATEST` , Firehose uses the most
       * recent version. This means that any updates to the table are automatically picked up.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html#cfn-kinesisfirehose-deliverystream-schemaconfiguration-versionid)
       */
      override fun versionId(): String? = unwrap(this).getVersionId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty):
          SchemaConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SchemaConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty
    }
  }

  /**
   * Indicates the method for setting up document ID.
   *
   * The supported methods are Firehose generated document ID and OpenSearch Service generated
   * document ID.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * DocumentIdOptionsProperty documentIdOptionsProperty = DocumentIdOptionsProperty.builder()
   * .defaultDocumentIdFormat("defaultDocumentIdFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html)
   */
  public interface DocumentIdOptionsProperty {
    /**
     * When the `FIREHOSE_DEFAULT` option is chosen, Firehose generates a unique document ID for
     * each record based on a unique internal identifier.
     *
     * The generated document ID is stable across multiple delivery attempts, which helps prevent
     * the same record from being indexed multiple times with different document IDs.
     *
     * When the `NO_DOCUMENT_ID` option is chosen, Firehose does not include any document IDs in the
     * requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service
     * domain to generate document IDs. In case of multiple delivery attempts, this may cause the same
     * record to be indexed more than once with different document IDs. This option enables write-heavy
     * operations, such as the ingestion of logs and observability data, to consume less resources in
     * the Amazon OpenSearch Service domain, resulting in improved performance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html#cfn-kinesisfirehose-deliverystream-documentidoptions-defaultdocumentidformat)
     */
    public fun defaultDocumentIdFormat(): String

    /**
     * A builder for [DocumentIdOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultDocumentIdFormat When the `FIREHOSE_DEFAULT` option is chosen, Firehose
       * generates a unique document ID for each record based on a unique internal identifier. 
       * The generated document ID is stable across multiple delivery attempts, which helps prevent
       * the same record from being indexed multiple times with different document IDs.
       *
       * When the `NO_DOCUMENT_ID` option is chosen, Firehose does not include any document IDs in
       * the requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch
       * Service domain to generate document IDs. In case of multiple delivery attempts, this may cause
       * the same record to be indexed more than once with different document IDs. This option enables
       * write-heavy operations, such as the ingestion of logs and observability data, to consume less
       * resources in the Amazon OpenSearch Service domain, resulting in improved performance.
       */
      public fun defaultDocumentIdFormat(defaultDocumentIdFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty.builder()

      /**
       * @param defaultDocumentIdFormat When the `FIREHOSE_DEFAULT` option is chosen, Firehose
       * generates a unique document ID for each record based on a unique internal identifier. 
       * The generated document ID is stable across multiple delivery attempts, which helps prevent
       * the same record from being indexed multiple times with different document IDs.
       *
       * When the `NO_DOCUMENT_ID` option is chosen, Firehose does not include any document IDs in
       * the requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch
       * Service domain to generate document IDs. In case of multiple delivery attempts, this may cause
       * the same record to be indexed more than once with different document IDs. This option enables
       * write-heavy operations, such as the ingestion of logs and observability data, to consume less
       * resources in the Amazon OpenSearch Service domain, resulting in improved performance.
       */
      override fun defaultDocumentIdFormat(defaultDocumentIdFormat: String) {
        cdkBuilder.defaultDocumentIdFormat(defaultDocumentIdFormat)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty,
    ) : CdkObject(cdkObject), DocumentIdOptionsProperty {
      /**
       * When the `FIREHOSE_DEFAULT` option is chosen, Firehose generates a unique document ID for
       * each record based on a unique internal identifier.
       *
       * The generated document ID is stable across multiple delivery attempts, which helps prevent
       * the same record from being indexed multiple times with different document IDs.
       *
       * When the `NO_DOCUMENT_ID` option is chosen, Firehose does not include any document IDs in
       * the requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch
       * Service domain to generate document IDs. In case of multiple delivery attempts, this may cause
       * the same record to be indexed more than once with different document IDs. This option enables
       * write-heavy operations, such as the ingestion of logs and observability data, to consume less
       * resources in the Amazon OpenSearch Service domain, resulting in improved performance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html#cfn-kinesisfirehose-deliverystream-documentidoptions-defaultdocumentidformat)
       */
      override fun defaultDocumentIdFormat(): String = unwrap(this).getDefaultDocumentIdFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentIdOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty):
          DocumentIdOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentIdOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentIdOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty
    }
  }

  /**
   * The `ElasticsearchBufferingHints` property type specifies how Amazon Kinesis Data Firehose
   * (Kinesis Data Firehose) buffers incoming data while delivering it to the destination.
   *
   * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the
   * data.
   *
   * ElasticsearchBufferingHints is the property type for the `BufferingHints` property of the
   * [Amazon Kinesis Data Firehose DeliveryStream
   * ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ElasticsearchBufferingHintsProperty elasticsearchBufferingHintsProperty =
   * ElasticsearchBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html)
   */
  public interface ElasticsearchBufferingHintsProperty {
    /**
     * The length of time, in seconds, that Kinesis Data Firehose buffers incoming data before
     * delivering it to the destination.
     *
     * For valid values, see the `IntervalInSeconds` content for the
     * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
     */
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    /**
     * The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming data before
     * delivering it to the destination.
     *
     * For valid values, see the `SizeInMBs` content for the
     * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
     */
    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    /**
     * A builder for [ElasticsearchBufferingHintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
       * incoming data before delivering it to the destination.
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun intervalInSeconds(intervalInSeconds: Number)

      /**
       * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for
       * incoming data before delivering it to the destination.
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.builder()

      /**
       * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
       * incoming data before delivering it to the destination.
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      /**
       * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for
       * incoming data before delivering it to the destination.
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty,
    ) : CdkObject(cdkObject), ElasticsearchBufferingHintsProperty {
      /**
       * The length of time, in seconds, that Kinesis Data Firehose buffers incoming data before
       * delivering it to the destination.
       *
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
       */
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      /**
       * The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming data before
       * delivering it to the destination.
       *
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
       */
      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty):
          ElasticsearchBufferingHintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchBufferingHintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty
    }
  }

  /**
   * The `ElasticsearchDestinationConfiguration` property type specifies an Amazon Elasticsearch
   * Service (Amazon ES) domain that Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data
   * to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ElasticsearchDestinationConfigurationProperty elasticsearchDestinationConfigurationProperty =
   * ElasticsearchDestinationConfigurationProperty.builder()
   * .indexName("indexName")
   * .roleArn("roleArn")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .bufferingHints(ElasticsearchBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .clusterEndpoint("clusterEndpoint")
   * .documentIdOptions(DocumentIdOptionsProperty.builder()
   * .defaultDocumentIdFormat("defaultDocumentIdFormat")
   * .build())
   * .domainArn("domainArn")
   * .indexRotationPeriod("indexRotationPeriod")
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(ElasticsearchRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .typeName("typeName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
   */
  public interface ElasticsearchDestinationConfigurationProperty {
    /**
     * Configures how Kinesis Data Firehose buffers incoming data while delivering it to the Amazon
     * ES domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * The Amazon CloudWatch Logs logging options for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The endpoint to use when communicating with the cluster.
     *
     * Specify either this `ClusterEndpoint` or the `DomainARN` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-clusterendpoint)
     */
    public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    /**
     * Indicates the method for setting up document ID.
     *
     * The supported methods are Firehose generated document ID and OpenSearch Service generated
     * document ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-documentidoptions)
     */
    public fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

    /**
     * The ARN of the Amazon ES domain.
     *
     * The IAM role must have permissions for `DescribeElasticsearchDomain` ,
     * `DescribeElasticsearchDomains` , and `DescribeElasticsearchDomainConfig` after assuming the role
     * specified in *RoleARN* .
     *
     * Specify either `ClusterEndpoint` or `DomainARN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
     */
    public fun domainArn(): String? = unwrap(this).getDomainArn()

    /**
     * The name of the Elasticsearch index to which Kinesis Data Firehose adds data for indexing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
     */
    public fun indexName(): String

    /**
     * The frequency of Elasticsearch index rotation.
     *
     * If you enable index rotation, Kinesis Data Firehose appends a portion of the UTC arrival
     * timestamp to the specified index name, and rotates the appended timestamp accordingly. For more
     * information, see [Index Rotation for the Amazon ES
     * Destination](https://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation)
     * in the *Amazon Kinesis Data Firehose Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
     */
    public fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

    /**
     * The data processing configuration for the Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The retry behavior when Kinesis Data Firehose is unable to deliver data to Amazon ES.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for
     * calling the Amazon ES Configuration API and for indexing documents.
     *
     * For more information, see [Controlling Access with Amazon Kinesis Data
     * Firehose](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The condition under which Kinesis Data Firehose delivers data to Amazon Simple Storage
     * Service (Amazon S3).
     *
     * You can send Amazon S3 all documents (all data) or only the documents that Kinesis Data
     * Firehose could not deliver to the Amazon ES destination. For more information and valid values,
     * see the `S3BackupMode` content for the
     * [ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchDestinationConfiguration.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * The S3 bucket where Kinesis Data Firehose backs up incoming data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * The Elasticsearch type name that Amazon ES adds to documents when indexing data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
     */
    public fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The details of the VPC of the Amazon ES destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [ElasticsearchDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      public fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty)

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e340df446c87b68e1e4db744c5bcad411fd76543fd8ac0099e797242ea40d393")
      public
          fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10a33b53a184502ac926541dc7c0d35cc6f40b520bbe25c32635d17c532d66ce")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param clusterEndpoint The endpoint to use when communicating with the cluster.
       * Specify either this `ClusterEndpoint` or the `DomainARN` field.
       */
      public fun clusterEndpoint(clusterEndpoint: String)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      public fun documentIdOptions(documentIdOptions: IResolvable)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5929d4c5b569128d81d5a2f4fe012a50b5708c0fcb55a4b2b61b98b307a073c6")
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit)

      /**
       * @param domainArn The ARN of the Amazon ES domain.
       * The IAM role must have permissions for `DescribeElasticsearchDomain` ,
       * `DescribeElasticsearchDomains` , and `DescribeElasticsearchDomainConfig` after assuming the
       * role specified in *RoleARN* .
       *
       * Specify either `ClusterEndpoint` or `DomainARN` .
       */
      public fun domainArn(domainArn: String)

      /**
       * @param indexName The name of the Elasticsearch index to which Kinesis Data Firehose adds
       * data for indexing. 
       */
      public fun indexName(indexName: String)

      /**
       * @param indexRotationPeriod The frequency of Elasticsearch index rotation.
       * If you enable index rotation, Kinesis Data Firehose appends a portion of the UTC arrival
       * timestamp to the specified index name, and rotates the appended timestamp accordingly. For
       * more information, see [Index Rotation for the Amazon ES
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      public fun indexRotationPeriod(indexRotationPeriod: String)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b9d8492561b471a963248aeed15022e7b6148dc60f9a15c3b359d3ff6126525")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      public fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty)

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6b3dee5ac7c674196a462de689006c06d8d94e430434c0e18048b01a8631565")
      public fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
       * Firehose for calling the Amazon ES Configuration API and for indexing documents. 
       * For more information, see [Controlling Access with Amazon Kinesis Data
       * Firehose](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html) .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupMode The condition under which Kinesis Data Firehose delivers data to Amazon
       * Simple Storage Service (Amazon S3).
       * You can send Amazon S3 all documents (all data) or only the documents that Kinesis Data
       * Firehose could not deliver to the Amazon ES destination. For more information and valid
       * values, see the `S3BackupMode` content for the
       * [ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchDestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("334e920a445bd1b45df5fceb29dda0b70cf95eb11c35e5d5fa949d75105fba9c")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param typeName The Elasticsearch type name that Amazon ES adds to documents when indexing
       * data.
       */
      public fun typeName(typeName: String)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d81a27050691270e4b42417272ed11988a312b2692cd26fdacc00690c2b7d3")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.builder()

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      override fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(ElasticsearchBufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon ES domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e340df446c87b68e1e4db744c5bcad411fd76543fd8ac0099e797242ea40d393")
      override
          fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(ElasticsearchBufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10a33b53a184502ac926541dc7c0d35cc6f40b520bbe25c32635d17c532d66ce")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param clusterEndpoint The endpoint to use when communicating with the cluster.
       * Specify either this `ClusterEndpoint` or the `DomainARN` field.
       */
      override fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      override fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(IResolvable::unwrap))
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      override fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(DocumentIdOptionsProperty::unwrap))
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5929d4c5b569128d81d5a2f4fe012a50b5708c0fcb55a4b2b61b98b307a073c6")
      override
          fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit):
          Unit = documentIdOptions(DocumentIdOptionsProperty(documentIdOptions))

      /**
       * @param domainArn The ARN of the Amazon ES domain.
       * The IAM role must have permissions for `DescribeElasticsearchDomain` ,
       * `DescribeElasticsearchDomains` , and `DescribeElasticsearchDomainConfig` after assuming the
       * role specified in *RoleARN* .
       *
       * Specify either `ClusterEndpoint` or `DomainARN` .
       */
      override fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
      }

      /**
       * @param indexName The name of the Elasticsearch index to which Kinesis Data Firehose adds
       * data for indexing. 
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param indexRotationPeriod The frequency of Elasticsearch index rotation.
       * If you enable index rotation, Kinesis Data Firehose appends a portion of the UTC arrival
       * timestamp to the specified index name, and rotates the appended timestamp accordingly. For
       * more information, see [Index Rotation for the Amazon ES
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      override fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b9d8492561b471a963248aeed15022e7b6148dc60f9a15c3b359d3ff6126525")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      override fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(ElasticsearchRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
       * to Amazon ES.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6b3dee5ac7c674196a462de689006c06d8d94e430434c0e18048b01a8631565")
      override fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(ElasticsearchRetryOptionsProperty(retryOptions))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
       * Firehose for calling the Amazon ES Configuration API and for indexing documents. 
       * For more information, see [Controlling Access with Amazon Kinesis Data
       * Firehose](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html) .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupMode The condition under which Kinesis Data Firehose delivers data to Amazon
       * Simple Storage Service (Amazon S3).
       * You can send Amazon S3 all documents (all data) or only the documents that Kinesis Data
       * Firehose could not deliver to the Amazon ES destination. For more information and valid
       * values, see the `S3BackupMode` content for the
       * [ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchDestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("334e920a445bd1b45df5fceb29dda0b70cf95eb11c35e5d5fa949d75105fba9c")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      /**
       * @param typeName The Elasticsearch type name that Amazon ES adds to documents when indexing
       * data.
       */
      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon ES destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d81a27050691270e4b42417272ed11988a312b2692cd26fdacc00690c2b7d3")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), ElasticsearchDestinationConfigurationProperty {
      /**
       * Configures how Kinesis Data Firehose buffers incoming data while delivering it to the
       * Amazon ES domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * The Amazon CloudWatch Logs logging options for the delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The endpoint to use when communicating with the cluster.
       *
       * Specify either this `ClusterEndpoint` or the `DomainARN` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-clusterendpoint)
       */
      override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

      /**
       * Indicates the method for setting up document ID.
       *
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-documentidoptions)
       */
      override fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

      /**
       * The ARN of the Amazon ES domain.
       *
       * The IAM role must have permissions for `DescribeElasticsearchDomain` ,
       * `DescribeElasticsearchDomains` , and `DescribeElasticsearchDomainConfig` after assuming the
       * role specified in *RoleARN* .
       *
       * Specify either `ClusterEndpoint` or `DomainARN` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
       */
      override fun domainArn(): String? = unwrap(this).getDomainArn()

      /**
       * The name of the Elasticsearch index to which Kinesis Data Firehose adds data for indexing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The frequency of Elasticsearch index rotation.
       *
       * If you enable index rotation, Kinesis Data Firehose appends a portion of the UTC arrival
       * timestamp to the specified index name, and rotates the appended timestamp accordingly. For
       * more information, see [Index Rotation for the Amazon ES
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
       */
      override fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

      /**
       * The data processing configuration for the Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The retry behavior when Kinesis Data Firehose is unable to deliver data to Amazon ES.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for
       * calling the Amazon ES Configuration API and for indexing documents.
       *
       * For more information, see [Controlling Access with Amazon Kinesis Data
       * Firehose](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The condition under which Kinesis Data Firehose delivers data to Amazon Simple Storage
       * Service (Amazon S3).
       *
       * You can send Amazon S3 all documents (all data) or only the documents that Kinesis Data
       * Firehose could not deliver to the Amazon ES destination. For more information and valid
       * values, see the `S3BackupMode` content for the
       * [ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchDestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * The S3 bucket where Kinesis Data Firehose backs up incoming data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * The Elasticsearch type name that Amazon ES adds to documents when indexing data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
       */
      override fun typeName(): String? = unwrap(this).getTypeName()

      /**
       * The details of the VPC of the Amazon ES destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty):
          ElasticsearchDestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
    }
  }

  /**
   * The `KinesisStreamSourceConfiguration` property type specifies the stream and role Amazon
   * Resource Names (ARNs) for a Kinesis stream used as the source for a delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * KinesisStreamSourceConfigurationProperty kinesisStreamSourceConfigurationProperty =
   * KinesisStreamSourceConfigurationProperty.builder()
   * .kinesisStreamArn("kinesisStreamArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   */
  public interface KinesisStreamSourceConfigurationProperty {
    /**
     * The ARN of the source Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
     */
    public fun kinesisStreamArn(): String

    /**
     * The ARN of the role that provides access to the source Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KinesisStreamSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kinesisStreamArn The ARN of the source Kinesis data stream. 
       */
      public fun kinesisStreamArn(kinesisStreamArn: String)

      /**
       * @param roleArn The ARN of the role that provides access to the source Kinesis data stream. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.builder()

      /**
       * @param kinesisStreamArn The ARN of the source Kinesis data stream. 
       */
      override fun kinesisStreamArn(kinesisStreamArn: String) {
        cdkBuilder.kinesisStreamArn(kinesisStreamArn)
      }

      /**
       * @param roleArn The ARN of the role that provides access to the source Kinesis data stream. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty,
    ) : CdkObject(cdkObject), KinesisStreamSourceConfigurationProperty {
      /**
       * The ARN of the source Kinesis data stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
       */
      override fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

      /**
       * The ARN of the role that provides access to the source Kinesis data stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty):
          KinesisStreamSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSourceConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
    }
  }

  /**
   * Configure a Snowflake VPC.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SnowflakeVpcConfigurationProperty snowflakeVpcConfigurationProperty =
   * SnowflakeVpcConfigurationProperty.builder()
   * .privateLinkVpceId("privateLinkVpceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakevpcconfiguration.html)
   */
  public interface SnowflakeVpcConfigurationProperty {
    /**
     * The VPCE ID for Firehose to privately connect with Snowflake.
     *
     * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see
     * [Amazon PrivateLink &amp;
     * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakevpcconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakevpcconfiguration-privatelinkvpceid)
     */
    public fun privateLinkVpceId(): String

    /**
     * A builder for [SnowflakeVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param privateLinkVpceId The VPCE ID for Firehose to privately connect with Snowflake. 
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      public fun privateLinkVpceId(privateLinkVpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty.builder()

      /**
       * @param privateLinkVpceId The VPCE ID for Firehose to privately connect with Snowflake. 
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      override fun privateLinkVpceId(privateLinkVpceId: String) {
        cdkBuilder.privateLinkVpceId(privateLinkVpceId)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty,
    ) : CdkObject(cdkObject), SnowflakeVpcConfigurationProperty {
      /**
       * The VPCE ID for Firehose to privately connect with Snowflake.
       *
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakevpcconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakevpcconfiguration-privatelinkvpceid)
       */
      override fun privateLinkVpceId(): String = unwrap(this).getPrivateLinkVpceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty):
          SnowflakeVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnowflakeVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeVpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty
    }
  }

  /**
   * The `SplunkDestinationConfiguration` property type specifies the configuration of a destination
   * in Splunk for a Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SplunkDestinationConfigurationProperty splunkDestinationConfigurationProperty =
   * SplunkDestinationConfigurationProperty.builder()
   * .hecEndpoint("hecEndpoint")
   * .hecEndpointType("hecEndpointType")
   * .hecToken("hecToken")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .bufferingHints(SplunkBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .hecAcknowledgmentTimeoutInSeconds(123)
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(SplunkRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html)
   */
  public interface SplunkDestinationConfigurationProperty {
    /**
     * The buffering options.
     *
     * If no value is specified, the default values for Splunk are used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * The Amazon CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The amount of time that Firehose waits to receive an acknowledgment from Splunk after it
     * sends it data.
     *
     * At the end of the timeout period, Firehose either tries to send the data again or considers
     * it an error, based on your retry settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds)
     */
    public fun hecAcknowledgmentTimeoutInSeconds(): Number? =
        unwrap(this).getHecAcknowledgmentTimeoutInSeconds()

    /**
     * The HTTP Event Collector (HEC) endpoint to which Firehose sends your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint)
     */
    public fun hecEndpoint(): String

    /**
     * This type can be either `Raw` or `Event` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype)
     */
    public fun hecEndpointType(): String

    /**
     * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken)
     */
    public fun hecToken(): String

    /**
     * The data processing configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The retry behavior in case Firehose is unable to deliver data to Splunk, or if it doesn't
     * receive an acknowledgment of receipt from Splunk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * Defines how documents should be delivered to Amazon S3.
     *
     * When set to `FailedEventsOnly` , Firehose writes any data that could not be indexed to the
     * configured Amazon S3 destination. When set to `AllEvents` , Firehose delivers all incoming
     * records to Amazon S3, and also writes failed documents to Amazon S3. The default value is
     * `FailedEventsOnly` .
     *
     * You can update this backup mode from `FailedEventsOnly` to `AllEvents` . You can't update it
     * from `AllEvents` to `FailedEventsOnly` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * The configuration for the backup Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * A builder for [SplunkDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      public fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25def6f003540905f3374225e52403efb0d805d8805ec1a33e463075f9addae")
      public fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04fa488be9ab07ebb7d1ee306afe46fec4aa0eb8c592b5b13c85ebfd7546987")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param hecAcknowledgmentTimeoutInSeconds The amount of time that Firehose waits to receive
       * an acknowledgment from Splunk after it sends it data.
       * At the end of the timeout period, Firehose either tries to send the data again or considers
       * it an error, based on your retry settings.
       */
      public fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number)

      /**
       * @param hecEndpoint The HTTP Event Collector (HEC) endpoint to which Firehose sends your
       * data. 
       */
      public fun hecEndpoint(hecEndpoint: String)

      /**
       * @param hecEndpointType This type can be either `Raw` or `Event` . 
       */
      public fun hecEndpointType(hecEndpointType: String)

      /**
       * @param hecToken This is a GUID that you obtain from your Splunk cluster when you create a
       * new HEC endpoint. 
       */
      public fun hecToken(hecToken: String)

      /**
       * @param processingConfiguration The data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration The data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration The data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e395e5d9c1fc9badbd09c50045b9b31c56c5260e0d4cc9c3e596589d4ab99d1a")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      public fun retryOptions(retryOptions: SplunkRetryOptionsProperty)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71f8f02652601f3e606cd73f6578999a420ce7a860cc1cb0de05e8897044a4d2")
      public fun retryOptions(retryOptions: SplunkRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       * When set to `FailedEventsOnly` , Firehose writes any data that could not be indexed to the
       * configured Amazon S3 destination. When set to `AllEvents` , Firehose delivers all incoming
       * records to Amazon S3, and also writes failed documents to Amazon S3. The default value is
       * `FailedEventsOnly` .
       *
       * You can update this backup mode from `FailedEventsOnly` to `AllEvents` . You can't update
       * it from `AllEvents` to `FailedEventsOnly` .
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa50c6dcaba52e45c88391090c23eef3caf9b4e2903b6fd6aa2a89e92abee921")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.builder()

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      override fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(SplunkBufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for Splunk are used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25def6f003540905f3374225e52403efb0d805d8805ec1a33e463075f9addae")
      override fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(SplunkBufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04fa488be9ab07ebb7d1ee306afe46fec4aa0eb8c592b5b13c85ebfd7546987")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param hecAcknowledgmentTimeoutInSeconds The amount of time that Firehose waits to receive
       * an acknowledgment from Splunk after it sends it data.
       * At the end of the timeout period, Firehose either tries to send the data again or considers
       * it an error, based on your retry settings.
       */
      override fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number) {
        cdkBuilder.hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds)
      }

      /**
       * @param hecEndpoint The HTTP Event Collector (HEC) endpoint to which Firehose sends your
       * data. 
       */
      override fun hecEndpoint(hecEndpoint: String) {
        cdkBuilder.hecEndpoint(hecEndpoint)
      }

      /**
       * @param hecEndpointType This type can be either `Raw` or `Event` . 
       */
      override fun hecEndpointType(hecEndpointType: String) {
        cdkBuilder.hecEndpointType(hecEndpointType)
      }

      /**
       * @param hecToken This is a GUID that you obtain from your Splunk cluster when you create a
       * new HEC endpoint. 
       */
      override fun hecToken(hecToken: String) {
        cdkBuilder.hecToken(hecToken)
      }

      /**
       * @param processingConfiguration The data processing configuration.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e395e5d9c1fc9badbd09c50045b9b31c56c5260e0d4cc9c3e596589d4ab99d1a")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      override fun retryOptions(retryOptions: SplunkRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(SplunkRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver data to
       * Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71f8f02652601f3e606cd73f6578999a420ce7a860cc1cb0de05e8897044a4d2")
      override fun retryOptions(retryOptions: SplunkRetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(SplunkRetryOptionsProperty(retryOptions))

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       * When set to `FailedEventsOnly` , Firehose writes any data that could not be indexed to the
       * configured Amazon S3 destination. When set to `AllEvents` , Firehose delivers all incoming
       * records to Amazon S3, and also writes failed documents to Amazon S3. The default value is
       * `FailedEventsOnly` .
       *
       * You can update this backup mode from `FailedEventsOnly` to `AllEvents` . You can't update
       * it from `AllEvents` to `FailedEventsOnly` .
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration The configuration for the backup Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa50c6dcaba52e45c88391090c23eef3caf9b4e2903b6fd6aa2a89e92abee921")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), SplunkDestinationConfigurationProperty {
      /**
       * The buffering options.
       *
       * If no value is specified, the default values for Splunk are used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * The Amazon CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The amount of time that Firehose waits to receive an acknowledgment from Splunk after it
       * sends it data.
       *
       * At the end of the timeout period, Firehose either tries to send the data again or considers
       * it an error, based on your retry settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds)
       */
      override fun hecAcknowledgmentTimeoutInSeconds(): Number? =
          unwrap(this).getHecAcknowledgmentTimeoutInSeconds()

      /**
       * The HTTP Event Collector (HEC) endpoint to which Firehose sends your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint)
       */
      override fun hecEndpoint(): String = unwrap(this).getHecEndpoint()

      /**
       * This type can be either `Raw` or `Event` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype)
       */
      override fun hecEndpointType(): String = unwrap(this).getHecEndpointType()

      /**
       * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken)
       */
      override fun hecToken(): String = unwrap(this).getHecToken()

      /**
       * The data processing configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The retry behavior in case Firehose is unable to deliver data to Splunk, or if it doesn't
       * receive an acknowledgment of receipt from Splunk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * Defines how documents should be delivered to Amazon S3.
       *
       * When set to `FailedEventsOnly` , Firehose writes any data that could not be indexed to the
       * configured Amazon S3 destination. When set to `AllEvents` , Firehose delivers all incoming
       * records to Amazon S3, and also writes failed documents to Amazon S3. The default value is
       * `FailedEventsOnly` .
       *
       * You can update this backup mode from `FailedEventsOnly` to `AllEvents` . You can't update
       * it from `AllEvents` to `FailedEventsOnly` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * The configuration for the backup Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SplunkDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty):
          SplunkDestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SplunkDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty
    }
  }

  /**
   * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the
   * specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt
   * from the specified HTTP endpoint destination.
   *
   * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
   * third-party service providers, including Datadog, MongoDB, and New Relic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * RetryOptionsProperty retryOptionsProperty = RetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-retryoptions.html)
   */
  public interface RetryOptionsProperty {
    /**
     * The total amount of time that Kinesis Data Firehose spends on retries.
     *
     * This duration starts after the initial attempt to send data to the custom destination via
     * HTTPS endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits
     * for acknowledgment from the specified destination after each attempt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-retryoptions.html#cfn-kinesisfirehose-deliverystream-retryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [RetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds The total amount of time that Kinesis Data Firehose spends on
       * retries.
       * This duration starts after the initial attempt to send data to the custom destination via
       * HTTPS endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits
       * for acknowledgment from the specified destination after each attempt.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty.builder()

      /**
       * @param durationInSeconds The total amount of time that Kinesis Data Firehose spends on
       * retries.
       * This duration starts after the initial attempt to send data to the custom destination via
       * HTTPS endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits
       * for acknowledgment from the specified destination after each attempt.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty,
    ) : CdkObject(cdkObject), RetryOptionsProperty {
      /**
       * The total amount of time that Kinesis Data Firehose spends on retries.
       *
       * This duration starts after the initial attempt to send data to the custom destination via
       * HTTPS endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits
       * for acknowledgment from the specified destination after each attempt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-retryoptions.html#cfn-kinesisfirehose-deliverystream-retryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty):
          RetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? RetryOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty
    }
  }

  /**
   * Describes the configuration of the HTTP endpoint to which Kinesis Firehose delivers data.
   *
   * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
   * third-party service providers, including Datadog, MongoDB, and New Relic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * HttpEndpointConfigurationProperty httpEndpointConfigurationProperty =
   * HttpEndpointConfigurationProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .accessKey("accessKey")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html)
   */
  public interface HttpEndpointConfigurationProperty {
    /**
     * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected
     * as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-accesskey)
     */
    public fun accessKey(): String? = unwrap(this).getAccessKey()

    /**
     * The name of the HTTP endpoint selected as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The URL of the HTTP endpoint selected as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-url)
     */
    public fun url(): String

    /**
     * A builder for [HttpEndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessKey The access key required for Kinesis Firehose to authenticate with the HTTP
       * endpoint selected as the destination.
       */
      public fun accessKey(accessKey: String)

      /**
       * @param name The name of the HTTP endpoint selected as the destination.
       */
      public fun name(name: String)

      /**
       * @param url The URL of the HTTP endpoint selected as the destination. 
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.builder()

      /**
       * @param accessKey The access key required for Kinesis Firehose to authenticate with the HTTP
       * endpoint selected as the destination.
       */
      override fun accessKey(accessKey: String) {
        cdkBuilder.accessKey(accessKey)
      }

      /**
       * @param name The name of the HTTP endpoint selected as the destination.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param url The URL of the HTTP endpoint selected as the destination. 
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty,
    ) : CdkObject(cdkObject), HttpEndpointConfigurationProperty {
      /**
       * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint
       * selected as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-accesskey)
       */
      override fun accessKey(): String? = unwrap(this).getAccessKey()

      /**
       * The name of the HTTP endpoint selected as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The URL of the HTTP endpoint selected as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointconfiguration-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty):
          HttpEndpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpEndpointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty
    }
  }

  /**
   * The buffering options.
   *
   * If no value is specified, the default values for Splunk are used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SplunkBufferingHintsProperty splunkBufferingHintsProperty =
   * SplunkBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html)
   */
  public interface SplunkBufferingHintsProperty {
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to
     * the destination.
     *
     * The default value is 60 (1 minute).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html#cfn-kinesisfirehose-deliverystream-splunkbufferinghints-intervalinseconds)
     */
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination.
     *
     * The default value is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html#cfn-kinesisfirehose-deliverystream-splunkbufferinghints-sizeinmbs)
     */
    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    /**
     * A builder for [SplunkBufferingHintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 60 (1 minute).
       */
      public fun intervalInSeconds(intervalInSeconds: Number)

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5.
       */
      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty.builder()

      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 60 (1 minute).
       */
      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5.
       */
      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty,
    ) : CdkObject(cdkObject), SplunkBufferingHintsProperty {
      /**
       * Buffer incoming data for the specified period of time, in seconds, before delivering it to
       * the destination.
       *
       * The default value is 60 (1 minute).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html#cfn-kinesisfirehose-deliverystream-splunkbufferinghints-intervalinseconds)
       */
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      /**
       * Buffer incoming data to the specified size, in MBs, before delivering it to the
       * destination.
       *
       * The default value is 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html#cfn-kinesisfirehose-deliverystream-splunkbufferinghints-sizeinmbs)
       */
      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SplunkBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty):
          SplunkBufferingHintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SplunkBufferingHintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty
    }
  }

  /**
   * A serializer to use for converting data to the ORC format before storing it in Amazon S3.
   *
   * For more information, see [Apache
   * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * OrcSerDeProperty orcSerDeProperty = OrcSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .bloomFilterColumns(List.of("bloomFilterColumns"))
   * .bloomFilterFalsePositiveProbability(123)
   * .compression("compression")
   * .dictionaryKeyThreshold(123)
   * .enablePadding(false)
   * .formatVersion("formatVersion")
   * .paddingTolerance(123)
   * .rowIndexStride(123)
   * .stripeSizeBytes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html)
   */
  public interface OrcSerDeProperty {
    /**
     * The Hadoop Distributed File System (HDFS) block size.
     *
     * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding calculations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes)
     */
    public fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

    /**
     * The column names for which you want Firehose to create bloom filters.
     *
     * The default is `null` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns)
     */
    public fun bloomFilterColumns(): List<String> = unwrap(this).getBloomFilterColumns() ?:
        emptyList()

    /**
     * The Bloom filter false positive probability (FPP).
     *
     * The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is 0,
     * and the maximum is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability)
     */
    public fun bloomFilterFalsePositiveProbability(): Number? =
        unwrap(this).getBloomFilterFalsePositiveProbability()

    /**
     * The compression code to use over data blocks.
     *
     * The default is `SNAPPY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression)
     */
    public fun compression(): String? = unwrap(this).getCompression()

    /**
     * Represents the fraction of the total number of non-null rows.
     *
     * To turn off dictionary encoding, set this fraction to a number that is less than the number
     * of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold)
     */
    public fun dictionaryKeyThreshold(): Number? = unwrap(this).getDictionaryKeyThreshold()

    /**
     * Set this to `true` to indicate that you want stripes to be padded to the HDFS block
     * boundaries.
     *
     * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     * default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding)
     */
    public fun enablePadding(): Any? = unwrap(this).getEnablePadding()

    /**
     * The version of the file to write.
     *
     * The possible values are `V0_11` and `V0_12` . The default is `V0_12` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion)
     */
    public fun formatVersion(): String? = unwrap(this).getFormatVersion()

    /**
     * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction
     * of stripe size.
     *
     * The default value is 0.05, which means 5 percent of stripe size.
     *
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block
     * padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB
     * block. In such a case, if the available size within the block is more than 3.2 MiB, a new,
     * smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block
     * boundaries and causes remote reads within a node-local task.
     *
     * Kinesis Data Firehose ignores this parameter when `EnablePadding` is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance)
     */
    public fun paddingTolerance(): Number? = unwrap(this).getPaddingTolerance()

    /**
     * The number of rows between index entries.
     *
     * The default is 10,000 and the minimum is 1,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride)
     */
    public fun rowIndexStride(): Number? = unwrap(this).getRowIndexStride()

    /**
     * The number of bytes in each stripe.
     *
     * The default is 64 MiB and the minimum is 8 MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes)
     */
    public fun stripeSizeBytes(): Number? = unwrap(this).getStripeSizeBytes()

    /**
     * A builder for [OrcSerDeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       */
      public fun blockSizeBytes(blockSizeBytes: Number)

      /**
       * @param bloomFilterColumns The column names for which you want Firehose to create bloom
       * filters.
       * The default is `null` .
       */
      public fun bloomFilterColumns(bloomFilterColumns: List<String>)

      /**
       * @param bloomFilterColumns The column names for which you want Firehose to create bloom
       * filters.
       * The default is `null` .
       */
      public fun bloomFilterColumns(vararg bloomFilterColumns: String)

      /**
       * @param bloomFilterFalsePositiveProbability The Bloom filter false positive probability
       * (FPP).
       * The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is
       * 0, and the maximum is 1.
       */
      public fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number)

      /**
       * @param compression The compression code to use over data blocks.
       * The default is `SNAPPY` .
       */
      public fun compression(compression: String)

      /**
       * @param dictionaryKeyThreshold Represents the fraction of the total number of non-null rows.
       * To turn off dictionary encoding, set this fraction to a number that is less than the number
       * of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
       */
      public fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number)

      /**
       * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to
       * the HDFS block boundaries.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is `false` .
       */
      public fun enablePadding(enablePadding: Boolean)

      /**
       * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to
       * the HDFS block boundaries.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is `false` .
       */
      public fun enablePadding(enablePadding: IResolvable)

      /**
       * @param formatVersion The version of the file to write.
       * The possible values are `V0_11` and `V0_12` . The default is `V0_12` .
       */
      public fun formatVersion(formatVersion: String)

      /**
       * @param paddingTolerance A number between 0 and 1 that defines the tolerance for block
       * padding as a decimal fraction of stripe size.
       * The default value is 0.05, which means 5 percent of stripe size.
       *
       * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block
       * padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB
       * block. In such a case, if the available size within the block is more than 3.2 MiB, a new,
       * smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block
       * boundaries and causes remote reads within a node-local task.
       *
       * Kinesis Data Firehose ignores this parameter when `EnablePadding` is `false` .
       */
      public fun paddingTolerance(paddingTolerance: Number)

      /**
       * @param rowIndexStride The number of rows between index entries.
       * The default is 10,000 and the minimum is 1,000.
       */
      public fun rowIndexStride(rowIndexStride: Number)

      /**
       * @param stripeSizeBytes The number of bytes in each stripe.
       * The default is 64 MiB and the minimum is 8 MiB.
       */
      public fun stripeSizeBytes(stripeSizeBytes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty.builder()

      /**
       * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       */
      override fun blockSizeBytes(blockSizeBytes: Number) {
        cdkBuilder.blockSizeBytes(blockSizeBytes)
      }

      /**
       * @param bloomFilterColumns The column names for which you want Firehose to create bloom
       * filters.
       * The default is `null` .
       */
      override fun bloomFilterColumns(bloomFilterColumns: List<String>) {
        cdkBuilder.bloomFilterColumns(bloomFilterColumns)
      }

      /**
       * @param bloomFilterColumns The column names for which you want Firehose to create bloom
       * filters.
       * The default is `null` .
       */
      override fun bloomFilterColumns(vararg bloomFilterColumns: String): Unit =
          bloomFilterColumns(bloomFilterColumns.toList())

      /**
       * @param bloomFilterFalsePositiveProbability The Bloom filter false positive probability
       * (FPP).
       * The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is
       * 0, and the maximum is 1.
       */
      override
          fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number) {
        cdkBuilder.bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability)
      }

      /**
       * @param compression The compression code to use over data blocks.
       * The default is `SNAPPY` .
       */
      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      /**
       * @param dictionaryKeyThreshold Represents the fraction of the total number of non-null rows.
       * To turn off dictionary encoding, set this fraction to a number that is less than the number
       * of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
       */
      override fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number) {
        cdkBuilder.dictionaryKeyThreshold(dictionaryKeyThreshold)
      }

      /**
       * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to
       * the HDFS block boundaries.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is `false` .
       */
      override fun enablePadding(enablePadding: Boolean) {
        cdkBuilder.enablePadding(enablePadding)
      }

      /**
       * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to
       * the HDFS block boundaries.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is `false` .
       */
      override fun enablePadding(enablePadding: IResolvable) {
        cdkBuilder.enablePadding(enablePadding.let(IResolvable::unwrap))
      }

      /**
       * @param formatVersion The version of the file to write.
       * The possible values are `V0_11` and `V0_12` . The default is `V0_12` .
       */
      override fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
      }

      /**
       * @param paddingTolerance A number between 0 and 1 that defines the tolerance for block
       * padding as a decimal fraction of stripe size.
       * The default value is 0.05, which means 5 percent of stripe size.
       *
       * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block
       * padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB
       * block. In such a case, if the available size within the block is more than 3.2 MiB, a new,
       * smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block
       * boundaries and causes remote reads within a node-local task.
       *
       * Kinesis Data Firehose ignores this parameter when `EnablePadding` is `false` .
       */
      override fun paddingTolerance(paddingTolerance: Number) {
        cdkBuilder.paddingTolerance(paddingTolerance)
      }

      /**
       * @param rowIndexStride The number of rows between index entries.
       * The default is 10,000 and the minimum is 1,000.
       */
      override fun rowIndexStride(rowIndexStride: Number) {
        cdkBuilder.rowIndexStride(rowIndexStride)
      }

      /**
       * @param stripeSizeBytes The number of bytes in each stripe.
       * The default is 64 MiB and the minimum is 8 MiB.
       */
      override fun stripeSizeBytes(stripeSizeBytes: Number) {
        cdkBuilder.stripeSizeBytes(stripeSizeBytes)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty,
    ) : CdkObject(cdkObject), OrcSerDeProperty {
      /**
       * The Hadoop Distributed File System (HDFS) block size.
       *
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes)
       */
      override fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

      /**
       * The column names for which you want Firehose to create bloom filters.
       *
       * The default is `null` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns)
       */
      override fun bloomFilterColumns(): List<String> = unwrap(this).getBloomFilterColumns() ?:
          emptyList()

      /**
       * The Bloom filter false positive probability (FPP).
       *
       * The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is
       * 0, and the maximum is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability)
       */
      override fun bloomFilterFalsePositiveProbability(): Number? =
          unwrap(this).getBloomFilterFalsePositiveProbability()

      /**
       * The compression code to use over data blocks.
       *
       * The default is `SNAPPY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression)
       */
      override fun compression(): String? = unwrap(this).getCompression()

      /**
       * Represents the fraction of the total number of non-null rows.
       *
       * To turn off dictionary encoding, set this fraction to a number that is less than the number
       * of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold)
       */
      override fun dictionaryKeyThreshold(): Number? = unwrap(this).getDictionaryKeyThreshold()

      /**
       * Set this to `true` to indicate that you want stripes to be padded to the HDFS block
       * boundaries.
       *
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding)
       */
      override fun enablePadding(): Any? = unwrap(this).getEnablePadding()

      /**
       * The version of the file to write.
       *
       * The possible values are `V0_11` and `V0_12` . The default is `V0_12` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion)
       */
      override fun formatVersion(): String? = unwrap(this).getFormatVersion()

      /**
       * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction
       * of stripe size.
       *
       * The default value is 0.05, which means 5 percent of stripe size.
       *
       * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block
       * padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB
       * block. In such a case, if the available size within the block is more than 3.2 MiB, a new,
       * smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block
       * boundaries and causes remote reads within a node-local task.
       *
       * Kinesis Data Firehose ignores this parameter when `EnablePadding` is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance)
       */
      override fun paddingTolerance(): Number? = unwrap(this).getPaddingTolerance()

      /**
       * The number of rows between index entries.
       *
       * The default is 10,000 and the minimum is 1,000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride)
       */
      override fun rowIndexStride(): Number? = unwrap(this).getRowIndexStride()

      /**
       * The number of bytes in each stripe.
       *
       * The default is 64 MiB and the minimum is 8 MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes)
       */
      override fun stripeSizeBytes(): Number? = unwrap(this).getStripeSizeBytes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrcSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty):
          OrcSerDeProperty = CdkObjectWrappers.wrap(cdkObject) as? OrcSerDeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrcSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty
    }
  }

  /**
   * The OpenX SerDe.
   *
   * Used by Firehose for deserializing data, which means converting it from the JSON format in
   * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you
   * can choose, depending on which one offers the functionality you need. The other option is the
   * native Hive / HCatalog JsonSerDe.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * OpenXJsonSerDeProperty openXJsonSerDeProperty = OpenXJsonSerDeProperty.builder()
   * .caseInsensitive(false)
   * .columnToJsonKeyMappings(Map.of(
   * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
   * .convertDotsInJsonKeysToUnderscores(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html)
   */
  public interface OpenXJsonSerDeProperty {
    /**
     * When set to `true` , which is the default, Firehose converts JSON keys to lowercase before
     * deserializing them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive)
     */
    public fun caseInsensitive(): Any? = unwrap(this).getCaseInsensitive()

    /**
     * Maps column names to JSON keys that aren't identical to the column names.
     *
     * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
     * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
     * "timestamp"}` to map this key to a column named `ts` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings)
     */
    public fun columnToJsonKeyMappings(): Any? = unwrap(this).getColumnToJsonKeyMappings()

    /**
     * When set to `true` , specifies that the names of the keys include dots and that you want
     * Firehose to replace them with underscores.
     *
     * This is useful because Apache Hive does not allow dots in column names. For example, if the
     * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
     * this option.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores)
     */
    public fun convertDotsInJsonKeysToUnderscores(): Any? =
        unwrap(this).getConvertDotsInJsonKeysToUnderscores()

    /**
     * A builder for [OpenXJsonSerDeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caseInsensitive When set to `true` , which is the default, Firehose converts JSON
       * keys to lowercase before deserializing them.
       */
      public fun caseInsensitive(caseInsensitive: Boolean)

      /**
       * @param caseInsensitive When set to `true` , which is the default, Firehose converts JSON
       * keys to lowercase before deserializing them.
       */
      public fun caseInsensitive(caseInsensitive: IResolvable)

      /**
       * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
       * column names.
       * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
       * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
       * "timestamp"}` to map this key to a column named `ts` .
       */
      public fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable)

      /**
       * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
       * column names.
       * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
       * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
       * "timestamp"}` to map this key to a column named `ts` .
       */
      public fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>)

      /**
       * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of
       * the keys include dots and that you want Firehose to replace them with underscores.
       * This is useful because Apache Hive does not allow dots in column names. For example, if the
       * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
       * this option.
       *
       * The default is `false` .
       */
      public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean)

      /**
       * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of
       * the keys include dots and that you want Firehose to replace them with underscores.
       * This is useful because Apache Hive does not allow dots in column names. For example, if the
       * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
       * this option.
       *
       * The default is `false` .
       */
      public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty.builder()

      /**
       * @param caseInsensitive When set to `true` , which is the default, Firehose converts JSON
       * keys to lowercase before deserializing them.
       */
      override fun caseInsensitive(caseInsensitive: Boolean) {
        cdkBuilder.caseInsensitive(caseInsensitive)
      }

      /**
       * @param caseInsensitive When set to `true` , which is the default, Firehose converts JSON
       * keys to lowercase before deserializing them.
       */
      override fun caseInsensitive(caseInsensitive: IResolvable) {
        cdkBuilder.caseInsensitive(caseInsensitive.let(IResolvable::unwrap))
      }

      /**
       * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
       * column names.
       * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
       * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
       * "timestamp"}` to map this key to a column named `ts` .
       */
      override fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings.let(IResolvable::unwrap))
      }

      /**
       * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
       * column names.
       * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
       * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
       * "timestamp"}` to map this key to a column named `ts` .
       */
      override fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
      }

      /**
       * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of
       * the keys include dots and that you want Firehose to replace them with underscores.
       * This is useful because Apache Hive does not allow dots in column names. For example, if the
       * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
       * this option.
       *
       * The default is `false` .
       */
      override fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
      }

      /**
       * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of
       * the keys include dots and that you want Firehose to replace them with underscores.
       * This is useful because Apache Hive does not allow dots in column names. For example, if the
       * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
       * this option.
       *
       * The default is `false` .
       */
      override
          fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty,
    ) : CdkObject(cdkObject), OpenXJsonSerDeProperty {
      /**
       * When set to `true` , which is the default, Firehose converts JSON keys to lowercase before
       * deserializing them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive)
       */
      override fun caseInsensitive(): Any? = unwrap(this).getCaseInsensitive()

      /**
       * Maps column names to JSON keys that aren't identical to the column names.
       *
       * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp`
       * is a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
       * "timestamp"}` to map this key to a column named `ts` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings)
       */
      override fun columnToJsonKeyMappings(): Any? = unwrap(this).getColumnToJsonKeyMappings()

      /**
       * When set to `true` , specifies that the names of the keys include dots and that you want
       * Firehose to replace them with underscores.
       *
       * This is useful because Apache Hive does not allow dots in column names. For example, if the
       * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
       * this option.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores)
       */
      override fun convertDotsInJsonKeysToUnderscores(): Any? =
          unwrap(this).getConvertDotsInJsonKeysToUnderscores()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenXJsonSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty):
          OpenXJsonSerDeProperty = CdkObjectWrappers.wrap(cdkObject) as? OpenXJsonSerDeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenXJsonSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty
    }
  }

  /**
   * The details of the VPC of the Amazon ES destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the
     * destination VPC.
     *
     * You can use your existing Kinesis Data Firehose delivery role or you can specify a new role.
     * In either case, make sure that the role trusts the Kinesis Data Firehose service principal and
     * that it grants the following permissions:
     *
     * * `ec2:DescribeVpcs`
     * * `ec2:DescribeVpcAttribute`
     * * `ec2:DescribeSubnets`
     * * `ec2:DescribeSecurityGroups`
     * * `ec2:DescribeNetworkInterfaces`
     * * `ec2:CreateNetworkInterface`
     * * `ec2:CreateNetworkInterfacePermission`
     * * `ec2:DeleteNetworkInterface`
     *
     * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose
     * can't scale out by creating more ENIs when necessary. You might therefore see a degradation in
     * performance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates
     * ENIs in the VPC of the Amazon ES destination.
     *
     * You can use the same security group that the Amazon ES domain uses or different ones. If you
     * specify different security groups here, ensure that they allow outbound HTTPS traffic to the
     * Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group allows
     * HTTPS traffic from the security groups specified here. If you use the same security group for
     * both your delivery stream and the Amazon ES domain, make sure the security group inbound rule
     * allows HTTPS traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in the VPC of the
     * Amazon ES destination.
     *
     * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
     * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
     * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
     * specified here. Do not delete or modify these ENIs.
     *
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up
     * and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
     * number of ENIs to match throughput, ensure that you have sufficient quota. To help you calculate
     * the quota you need, assume that Kinesis Data Firehose can create up to three ENIs for this
     * delivery stream for each of the subnets specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of the IAM role that you want the delivery stream to use to create
       * endpoints in the destination VPC. 
       * You can use your existing Kinesis Data Firehose delivery role or you can specify a new
       * role. In either case, make sure that the role trusts the Kinesis Data Firehose service
       * principal and that it grants the following permissions:
       *
       * * `ec2:DescribeVpcs`
       * * `ec2:DescribeVpcAttribute`
       * * `ec2:DescribeSubnets`
       * * `ec2:DescribeSecurityGroups`
       * * `ec2:DescribeNetworkInterfaces`
       * * `ec2:CreateNetworkInterface`
       * * `ec2:CreateNetworkInterfacePermission`
       * * `ec2:DeleteNetworkInterface`
       *
       * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose
       * can't scale out by creating more ENIs when necessary. You might therefore see a degradation in
       * performance.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param securityGroupIds The IDs of the security groups that you want Kinesis Data Firehose
       * to use when it creates ENIs in the VPC of the Amazon ES destination. 
       * You can use the same security group that the Amazon ES domain uses or different ones. If
       * you specify different security groups here, ensure that they allow outbound HTTPS traffic to
       * the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
       * allows HTTPS traffic from the security groups specified here. If you use the same security
       * group for both your delivery stream and the Amazon ES domain, make sure the security group
       * inbound rule allows HTTPS traffic.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The IDs of the security groups that you want Kinesis Data Firehose
       * to use when it creates ENIs in the VPC of the Amazon ES destination. 
       * You can use the same security group that the Amazon ES domain uses or different ones. If
       * you specify different security groups here, ensure that they allow outbound HTTPS traffic to
       * the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
       * allows HTTPS traffic from the security groups specified here. If you use the same security
       * group for both your delivery stream and the Amazon ES domain, make sure the security group
       * inbound rule allows HTTPS traffic.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in
       * the VPC of the Amazon ES destination. 
       * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
       * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
       * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
       * specified here. Do not delete or modify these ENIs.
       *
       * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales
       * up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
       * number of ENIs to match throughput, ensure that you have sufficient quota. To help you
       * calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs
       * for this delivery stream for each of the subnets specified here.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in
       * the VPC of the Amazon ES destination. 
       * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
       * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
       * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
       * specified here. Do not delete or modify these ENIs.
       *
       * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales
       * up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
       * number of ENIs to match throughput, ensure that you have sufficient quota. To help you
       * calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs
       * for this delivery stream for each of the subnets specified here.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.builder()

      /**
       * @param roleArn The ARN of the IAM role that you want the delivery stream to use to create
       * endpoints in the destination VPC. 
       * You can use your existing Kinesis Data Firehose delivery role or you can specify a new
       * role. In either case, make sure that the role trusts the Kinesis Data Firehose service
       * principal and that it grants the following permissions:
       *
       * * `ec2:DescribeVpcs`
       * * `ec2:DescribeVpcAttribute`
       * * `ec2:DescribeSubnets`
       * * `ec2:DescribeSecurityGroups`
       * * `ec2:DescribeNetworkInterfaces`
       * * `ec2:CreateNetworkInterface`
       * * `ec2:CreateNetworkInterfacePermission`
       * * `ec2:DeleteNetworkInterface`
       *
       * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose
       * can't scale out by creating more ENIs when necessary. You might therefore see a degradation in
       * performance.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param securityGroupIds The IDs of the security groups that you want Kinesis Data Firehose
       * to use when it creates ENIs in the VPC of the Amazon ES destination. 
       * You can use the same security group that the Amazon ES domain uses or different ones. If
       * you specify different security groups here, ensure that they allow outbound HTTPS traffic to
       * the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
       * allows HTTPS traffic from the security groups specified here. If you use the same security
       * group for both your delivery stream and the Amazon ES domain, make sure the security group
       * inbound rule allows HTTPS traffic.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The IDs of the security groups that you want Kinesis Data Firehose
       * to use when it creates ENIs in the VPC of the Amazon ES destination. 
       * You can use the same security group that the Amazon ES domain uses or different ones. If
       * you specify different security groups here, ensure that they allow outbound HTTPS traffic to
       * the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
       * allows HTTPS traffic from the security groups specified here. If you use the same security
       * group for both your delivery stream and the Amazon ES domain, make sure the security group
       * inbound rule allows HTTPS traffic.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in
       * the VPC of the Amazon ES destination. 
       * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
       * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
       * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
       * specified here. Do not delete or modify these ENIs.
       *
       * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales
       * up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
       * number of ENIs to match throughput, ensure that you have sufficient quota. To help you
       * calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs
       * for this delivery stream for each of the subnets specified here.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in
       * the VPC of the Amazon ES destination. 
       * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
       * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
       * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
       * specified here. Do not delete or modify these ENIs.
       *
       * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales
       * up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
       * number of ENIs to match throughput, ensure that you have sufficient quota. To help you
       * calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs
       * for this delivery stream for each of the subnets specified here.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      /**
       * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the
       * destination VPC.
       *
       * You can use your existing Kinesis Data Firehose delivery role or you can specify a new
       * role. In either case, make sure that the role trusts the Kinesis Data Firehose service
       * principal and that it grants the following permissions:
       *
       * * `ec2:DescribeVpcs`
       * * `ec2:DescribeVpcAttribute`
       * * `ec2:DescribeSubnets`
       * * `ec2:DescribeSecurityGroups`
       * * `ec2:DescribeNetworkInterfaces`
       * * `ec2:CreateNetworkInterface`
       * * `ec2:CreateNetworkInterfacePermission`
       * * `ec2:DeleteNetworkInterface`
       *
       * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose
       * can't scale out by creating more ENIs when necessary. You might therefore see a degradation in
       * performance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates
       * ENIs in the VPC of the Amazon ES destination.
       *
       * You can use the same security group that the Amazon ES domain uses or different ones. If
       * you specify different security groups here, ensure that they allow outbound HTTPS traffic to
       * the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
       * allows HTTPS traffic from the security groups specified here. If you use the same security
       * group for both your delivery stream and the Amazon ES domain, make sure the security group
       * inbound rule allows HTTPS traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in the VPC of the
       * Amazon ES destination.
       *
       * Make sure that the routing tables and inbound and outbound rules allow traffic to flow from
       * the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
       * endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are
       * specified here. Do not delete or modify these ENIs.
       *
       * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales
       * up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the
       * number of ENIs to match throughput, ensure that you have sufficient quota. To help you
       * calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs
       * for this delivery stream for each of the subnets specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html#cfn-kinesisfirehose-deliverystream-vpcconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty):
          VpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty
    }
  }

  /**
   * The `ElasticsearchRetryOptions` property type configures the retry behavior for when Amazon
   * Kinesis Data Firehose (Kinesis Data Firehose) can't deliver data to Amazon Elasticsearch Service
   * (Amazon ES).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ElasticsearchRetryOptionsProperty elasticsearchRetryOptionsProperty =
   * ElasticsearchRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html)
   */
  public interface ElasticsearchRetryOptionsProperty {
    /**
     * After an initial failure to deliver to Amazon ES, the total amount of time during which
     * Kinesis Data Firehose re-attempts delivery (including the first attempt).
     *
     * If Kinesis Data Firehose can't deliver the data within the specified time, it writes the data
     * to the backup S3 bucket. For valid values, see the `DurationInSeconds` content for the
     * [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [ElasticsearchRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds After an initial failure to deliver to Amazon ES, the total amount
       * of time during which Kinesis Data Firehose re-attempts delivery (including the first attempt).
       * If Kinesis Data Firehose can't deliver the data within the specified time, it writes the
       * data to the backup S3 bucket. For valid values, see the `DurationInSeconds` content for the
       * [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds After an initial failure to deliver to Amazon ES, the total amount
       * of time during which Kinesis Data Firehose re-attempts delivery (including the first attempt).
       * If Kinesis Data Firehose can't deliver the data within the specified time, it writes the
       * data to the backup S3 bucket. For valid values, see the `DurationInSeconds` content for the
       * [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty,
    ) : CdkObject(cdkObject), ElasticsearchRetryOptionsProperty {
      /**
       * After an initial failure to deliver to Amazon ES, the total amount of time during which
       * Kinesis Data Firehose re-attempts delivery (including the first attempt).
       *
       * If Kinesis Data Firehose can't deliver the data within the specified time, it writes the
       * data to the backup S3 bucket. For valid values, see the `DurationInSeconds` content for the
       * [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty):
          ElasticsearchRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty
    }
  }

  /**
   * The `Processor` property specifies a data processor for an Amazon Kinesis Data Firehose
   * delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ProcessorProperty processorProperty = ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html)
   */
  public interface ProcessorProperty {
    /**
     * The processor parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The type of processor.
     *
     * Valid values: `Lambda` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
     */
    public fun type(): String

    /**
     * A builder for [ProcessorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters The processor parameters.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The processor parameters.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters The processor parameters.
       */
      public fun parameters(vararg parameters: Any)

      /**
       * @param type The type of processor. 
       * Valid values: `Lambda` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.builder()

      /**
       * @param parameters The processor parameters.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters The processor parameters.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters The processor parameters.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      /**
       * @param type The type of processor. 
       * Valid values: `Lambda` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty,
    ) : CdkObject(cdkObject), ProcessorProperty {
      /**
       * The processor parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The type of processor.
       *
       * Valid values: `Lambda` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty):
          ProcessorProperty = CdkObjectWrappers.wrap(cdkObject) as? ProcessorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty
    }
  }

  /**
   * Optionally configure a Snowflake role.
   *
   * Otherwise the default user role will be used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SnowflakeRoleConfigurationProperty snowflakeRoleConfigurationProperty =
   * SnowflakeRoleConfigurationProperty.builder()
   * .enabled(false)
   * .snowflakeRole("snowflakeRole")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html)
   */
  public interface SnowflakeRoleConfigurationProperty {
    /**
     * Enable Snowflake role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakeroleconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The Snowflake role you wish to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakeroleconfiguration-snowflakerole)
     */
    public fun snowflakeRole(): String? = unwrap(this).getSnowflakeRole()

    /**
     * A builder for [SnowflakeRoleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enable Snowflake role.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enable Snowflake role.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param snowflakeRole The Snowflake role you wish to configure.
       */
      public fun snowflakeRole(snowflakeRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty.builder()

      /**
       * @param enabled Enable Snowflake role.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enable Snowflake role.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param snowflakeRole The Snowflake role you wish to configure.
       */
      override fun snowflakeRole(snowflakeRole: String) {
        cdkBuilder.snowflakeRole(snowflakeRole)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty,
    ) : CdkObject(cdkObject), SnowflakeRoleConfigurationProperty {
      /**
       * Enable Snowflake role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakeroleconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The Snowflake role you wish to configure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakeroleconfiguration-snowflakerole)
       */
      override fun snowflakeRole(): String? = unwrap(this).getSnowflakeRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeRoleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty):
          SnowflakeRoleConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnowflakeRoleConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeRoleConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty
    }
  }

  /**
   * Describes the configuration of a destination in Amazon OpenSearch Service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonopensearchserviceDestinationConfigurationProperty
   * amazonopensearchserviceDestinationConfigurationProperty =
   * AmazonopensearchserviceDestinationConfigurationProperty.builder()
   * .indexName("indexName")
   * .roleArn("roleArn")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .bufferingHints(AmazonopensearchserviceBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .clusterEndpoint("clusterEndpoint")
   * .documentIdOptions(DocumentIdOptionsProperty.builder()
   * .defaultDocumentIdFormat("defaultDocumentIdFormat")
   * .build())
   * .domainArn("domainArn")
   * .indexRotationPeriod("indexRotationPeriod")
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(AmazonopensearchserviceRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .typeName("typeName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html)
   */
  public interface AmazonopensearchserviceDestinationConfigurationProperty {
    /**
     * The buffering options.
     *
     * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * Describes the Amazon CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The endpoint to use when communicating with the cluster.
     *
     * Specify either this ClusterEndpoint or the DomainARN field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-clusterendpoint)
     */
    public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    /**
     * Indicates the method for setting up document ID.
     *
     * The supported methods are Firehose generated document ID and OpenSearch Service generated
     * document ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-documentidoptions)
     */
    public fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

    /**
     * The ARN of the Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-domainarn)
     */
    public fun domainArn(): String? = unwrap(this).getDomainArn()

    /**
     * The Amazon OpenSearch Service index name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-indexname)
     */
    public fun indexName(): String

    /**
     * The Amazon OpenSearch Service index rotation period.
     *
     * Index rotation appends a timestamp to the IndexName to facilitate the expiration of old data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-indexrotationperiod)
     */
    public fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

    /**
     * Describes a data processing configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon
     * OpenSearch Service.
     *
     * The default value is 300 (5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for
     * calling the Amazon OpenSearch Service Configuration API and for indexing documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * Defines how documents should be delivered to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * Describes the configuration of a destination in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * The Amazon OpenSearch Service type name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-typename)
     */
    public fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The details of the VPC of the Amazon OpenSearch Service destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [AmazonopensearchserviceDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      public fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89c7cac5caea6077a6d3afe95c17a6914cfc69f98c077a91f9274521054ff81")
      public
          fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0480543c5b31704c8985256dcb75739e4a49b3aecf8cc480932506aa9c7560cc")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param clusterEndpoint The endpoint to use when communicating with the cluster.
       * Specify either this ClusterEndpoint or the DomainARN field.
       */
      public fun clusterEndpoint(clusterEndpoint: String)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      public fun documentIdOptions(documentIdOptions: IResolvable)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty)

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02068fbba14d0c23ec9989b0831c0bec7802371f7e334303e5d723e9d2cc206c")
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit)

      /**
       * @param domainArn The ARN of the Amazon OpenSearch Service domain.
       */
      public fun domainArn(domainArn: String)

      /**
       * @param indexName The Amazon OpenSearch Service index name. 
       */
      public fun indexName(indexName: String)

      /**
       * @param indexRotationPeriod The Amazon OpenSearch Service index rotation period.
       * Index rotation appends a timestamp to the IndexName to facilitate the expiration of old
       * data.
       */
      public fun indexRotationPeriod(indexRotationPeriod: String)

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f815b97b0ea3b87059c8de3ca7b4f2c53ed8b1fc5d2dd5e42221899c8566ab")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      public fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty)

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54cc6f9702ca24e1db84ff65e28dcf95334f41b5478662da12a8d4b96bed1803")
      public
          fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
       * Firehose for calling the Amazon OpenSearch Service Configuration API and for indexing
       * documents. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6319aa65986b2481919ad9a91034af8e3e076f0e69b4646cd3b6271ed91d9748")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param typeName The Amazon OpenSearch Service type name.
       */
      public fun typeName(typeName: String)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("179632889a6656e9eb630e8e460068ded8cf2952111ad805fa353be523234b25")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.builder()

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      override fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(AmazonopensearchserviceBufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89c7cac5caea6077a6d3afe95c17a6914cfc69f98c077a91f9274521054ff81")
      override
          fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(AmazonopensearchserviceBufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0480543c5b31704c8985256dcb75739e4a49b3aecf8cc480932506aa9c7560cc")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param clusterEndpoint The endpoint to use when communicating with the cluster.
       * Specify either this ClusterEndpoint or the DomainARN field.
       */
      override fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      override fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(IResolvable::unwrap))
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      override fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(DocumentIdOptionsProperty::unwrap))
      }

      /**
       * @param documentIdOptions Indicates the method for setting up document ID.
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02068fbba14d0c23ec9989b0831c0bec7802371f7e334303e5d723e9d2cc206c")
      override
          fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit):
          Unit = documentIdOptions(DocumentIdOptionsProperty(documentIdOptions))

      /**
       * @param domainArn The ARN of the Amazon OpenSearch Service domain.
       */
      override fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
      }

      /**
       * @param indexName The Amazon OpenSearch Service index name. 
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param indexRotationPeriod The Amazon OpenSearch Service index rotation period.
       * Index rotation appends a timestamp to the IndexName to facilitate the expiration of old
       * data.
       */
      override fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
      }

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration Describes a data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f815b97b0ea3b87059c8de3ca7b4f2c53ed8b1fc5d2dd5e42221899c8566ab")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      override fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(AmazonopensearchserviceRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
       * documents to Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54cc6f9702ca24e1db84ff65e28dcf95334f41b5478662da12a8d4b96bed1803")
      override
          fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(AmazonopensearchserviceRetryOptionsProperty(retryOptions))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
       * Firehose for calling the Amazon OpenSearch Service Configuration API and for indexing
       * documents. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6319aa65986b2481919ad9a91034af8e3e076f0e69b4646cd3b6271ed91d9748")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      /**
       * @param typeName The Amazon OpenSearch Service type name.
       */
      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("179632889a6656e9eb630e8e460068ded8cf2952111ad805fa353be523234b25")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), AmazonopensearchserviceDestinationConfigurationProperty {
      /**
       * The buffering options.
       *
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * Describes the Amazon CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The endpoint to use when communicating with the cluster.
       *
       * Specify either this ClusterEndpoint or the DomainARN field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-clusterendpoint)
       */
      override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

      /**
       * Indicates the method for setting up document ID.
       *
       * The supported methods are Firehose generated document ID and OpenSearch Service generated
       * document ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-documentidoptions)
       */
      override fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

      /**
       * The ARN of the Amazon OpenSearch Service domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-domainarn)
       */
      override fun domainArn(): String? = unwrap(this).getDomainArn()

      /**
       * The Amazon OpenSearch Service index name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The Amazon OpenSearch Service index rotation period.
       *
       * Index rotation appends a timestamp to the IndexName to facilitate the expiration of old
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-indexrotationperiod)
       */
      override fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

      /**
       * Describes a data processing configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon
       * OpenSearch Service.
       *
       * The default value is 300 (5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for
       * calling the Amazon OpenSearch Service Configuration API and for indexing documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Defines how documents should be delivered to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * Describes the configuration of a destination in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * The Amazon OpenSearch Service type name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-typename)
       */
      override fun typeName(): String? = unwrap(this).getTypeName()

      /**
       * The details of the VPC of the Amazon OpenSearch Service destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty):
          AmazonopensearchserviceDestinationConfigurationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          AmazonopensearchserviceDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
    }
  }

  /**
   * Configures retry behavior in case Firehose is unable to deliver documents to Amazon Redshift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * RedshiftRetryOptionsProperty redshiftRetryOptionsProperty =
   * RedshiftRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html)
   */
  public interface RedshiftRetryOptionsProperty {
    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the
     * initial request and including the first attempt.
     *
     * The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of
     * `DurationInSeconds` is 0 (zero) or if the first delivery attempt takes longer than the current
     * value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [RedshiftRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds The length of time during which Firehose retries delivery after a
       * failure, starting from the initial request and including the first attempt.
       * The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of
       * `DurationInSeconds` is 0 (zero) or if the first delivery attempt takes longer than the current
       * value.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds The length of time during which Firehose retries delivery after a
       * failure, starting from the initial request and including the first attempt.
       * The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of
       * `DurationInSeconds` is 0 (zero) or if the first delivery attempt takes longer than the current
       * value.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty,
    ) : CdkObject(cdkObject), RedshiftRetryOptionsProperty {
      /**
       * The length of time during which Firehose retries delivery after a failure, starting from
       * the initial request and including the first attempt.
       *
       * The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of
       * `DurationInSeconds` is 0 (zero) or if the first delivery attempt takes longer than the current
       * value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty):
          RedshiftRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty
    }
  }

  /**
   * A serializer to use for converting data to the Parquet format before storing it in Amazon S3.
   *
   * For more information, see [Apache
   * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ParquetSerDeProperty parquetSerDeProperty = ParquetSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .compression("compression")
   * .enableDictionaryCompression(false)
   * .maxPaddingBytes(123)
   * .pageSizeBytes(123)
   * .writerVersion("writerVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html)
   */
  public interface ParquetSerDeProperty {
    /**
     * The Hadoop Distributed File System (HDFS) block size.
     *
     * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding calculations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes)
     */
    public fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

    /**
     * The compression code to use over data blocks.
     *
     * The possible values are `UNCOMPRESSED` , `SNAPPY` , and `GZIP` , with the default being
     * `SNAPPY` . Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is
     * more important than speed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression)
     */
    public fun compression(): String? = unwrap(this).getCompression()

    /**
     * Indicates whether to enable dictionary compression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression)
     */
    public fun enableDictionaryCompression(): Any? = unwrap(this).getEnableDictionaryCompression()

    /**
     * The maximum amount of padding to apply.
     *
     * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     * default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes)
     */
    public fun maxPaddingBytes(): Number? = unwrap(this).getMaxPaddingBytes()

    /**
     * The Parquet page size.
     *
     * Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of
     * compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes)
     */
    public fun pageSizeBytes(): Number? = unwrap(this).getPageSizeBytes()

    /**
     * Indicates the version of row format to output.
     *
     * The possible values are `V1` and `V2` . The default is `V1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion)
     */
    public fun writerVersion(): String? = unwrap(this).getWriterVersion()

    /**
     * A builder for [ParquetSerDeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       */
      public fun blockSizeBytes(blockSizeBytes: Number)

      /**
       * @param compression The compression code to use over data blocks.
       * The possible values are `UNCOMPRESSED` , `SNAPPY` , and `GZIP` , with the default being
       * `SNAPPY` . Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is
       * more important than speed.
       */
      public fun compression(compression: String)

      /**
       * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
       */
      public fun enableDictionaryCompression(enableDictionaryCompression: Boolean)

      /**
       * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
       */
      public fun enableDictionaryCompression(enableDictionaryCompression: IResolvable)

      /**
       * @param maxPaddingBytes The maximum amount of padding to apply.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 0.
       */
      public fun maxPaddingBytes(maxPaddingBytes: Number)

      /**
       * @param pageSizeBytes The Parquet page size.
       * Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
       * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
       */
      public fun pageSizeBytes(pageSizeBytes: Number)

      /**
       * @param writerVersion Indicates the version of row format to output.
       * The possible values are `V1` and `V2` . The default is `V1` .
       */
      public fun writerVersion(writerVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty.builder()

      /**
       * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       */
      override fun blockSizeBytes(blockSizeBytes: Number) {
        cdkBuilder.blockSizeBytes(blockSizeBytes)
      }

      /**
       * @param compression The compression code to use over data blocks.
       * The possible values are `UNCOMPRESSED` , `SNAPPY` , and `GZIP` , with the default being
       * `SNAPPY` . Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is
       * more important than speed.
       */
      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      /**
       * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
       */
      override fun enableDictionaryCompression(enableDictionaryCompression: Boolean) {
        cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
      }

      /**
       * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
       */
      override fun enableDictionaryCompression(enableDictionaryCompression: IResolvable) {
        cdkBuilder.enableDictionaryCompression(enableDictionaryCompression.let(IResolvable::unwrap))
      }

      /**
       * @param maxPaddingBytes The maximum amount of padding to apply.
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 0.
       */
      override fun maxPaddingBytes(maxPaddingBytes: Number) {
        cdkBuilder.maxPaddingBytes(maxPaddingBytes)
      }

      /**
       * @param pageSizeBytes The Parquet page size.
       * Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
       * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
       */
      override fun pageSizeBytes(pageSizeBytes: Number) {
        cdkBuilder.pageSizeBytes(pageSizeBytes)
      }

      /**
       * @param writerVersion Indicates the version of row format to output.
       * The possible values are `V1` and `V2` . The default is `V1` .
       */
      override fun writerVersion(writerVersion: String) {
        cdkBuilder.writerVersion(writerVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty,
    ) : CdkObject(cdkObject), ParquetSerDeProperty {
      /**
       * The Hadoop Distributed File System (HDFS) block size.
       *
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 256 MiB and the minimum is 64 MiB. Firehose uses this value for padding
       * calculations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes)
       */
      override fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

      /**
       * The compression code to use over data blocks.
       *
       * The possible values are `UNCOMPRESSED` , `SNAPPY` , and `GZIP` , with the default being
       * `SNAPPY` . Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is
       * more important than speed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression)
       */
      override fun compression(): String? = unwrap(this).getCompression()

      /**
       * Indicates whether to enable dictionary compression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression)
       */
      override fun enableDictionaryCompression(): Any? =
          unwrap(this).getEnableDictionaryCompression()

      /**
       * The maximum amount of padding to apply.
       *
       * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
       * default is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes)
       */
      override fun maxPaddingBytes(): Number? = unwrap(this).getMaxPaddingBytes()

      /**
       * The Parquet page size.
       *
       * Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
       * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes)
       */
      override fun pageSizeBytes(): Number? = unwrap(this).getPageSizeBytes()

      /**
       * Indicates the version of row format to output.
       *
       * The possible values are `V1` and `V2` . The default is `V1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion)
       */
      override fun writerVersion(): String? = unwrap(this).getWriterVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParquetSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty):
          ParquetSerDeProperty = CdkObjectWrappers.wrap(cdkObject) as? ParquetSerDeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParquetSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty
    }
  }

  /**
   * The authentication configuration of the Amazon MSK cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AuthenticationConfigurationProperty authenticationConfigurationProperty =
   * AuthenticationConfigurationProperty.builder()
   * .connectivity("connectivity")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html)
   */
  public interface AuthenticationConfigurationProperty {
    /**
     * The type of connectivity used to access the Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html#cfn-kinesisfirehose-deliverystream-authenticationconfiguration-connectivity)
     */
    public fun connectivity(): String

    /**
     * The ARN of the role used to access the Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html#cfn-kinesisfirehose-deliverystream-authenticationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [AuthenticationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectivity The type of connectivity used to access the Amazon MSK cluster. 
       */
      public fun connectivity(connectivity: String)

      /**
       * @param roleArn The ARN of the role used to access the Amazon MSK cluster. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty.builder()

      /**
       * @param connectivity The type of connectivity used to access the Amazon MSK cluster. 
       */
      override fun connectivity(connectivity: String) {
        cdkBuilder.connectivity(connectivity)
      }

      /**
       * @param roleArn The ARN of the role used to access the Amazon MSK cluster. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject), AuthenticationConfigurationProperty {
      /**
       * The type of connectivity used to access the Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html#cfn-kinesisfirehose-deliverystream-authenticationconfiguration-connectivity)
       */
      override fun connectivity(): String = unwrap(this).getConnectivity()

      /**
       * The ARN of the role used to access the Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html#cfn-kinesisfirehose-deliverystream-authenticationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthenticationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty
    }
  }

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * MSKSourceConfigurationProperty mSKSourceConfigurationProperty =
   * MSKSourceConfigurationProperty.builder()
   * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
   * .connectivity("connectivity")
   * .roleArn("roleArn")
   * .build())
   * .mskClusterArn("mskClusterArn")
   * .topicName("topicName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html)
   */
  public interface MSKSourceConfigurationProperty {
    /**
     * The authentication configuration of the Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any

    /**
     * The ARN of the Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-mskclusterarn)
     */
    public fun mskClusterArn(): String

    /**
     * The topic name within the Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-topicname)
     */
    public fun topicName(): String

    /**
     * A builder for [MSKSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty)

      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a009abd1f8243e28dde7de4258e4bac1917c47952371575f57756fad31e8f105")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param mskClusterArn The ARN of the Amazon MSK cluster. 
       */
      public fun mskClusterArn(mskClusterArn: String)

      /**
       * @param topicName The topic name within the Amazon MSK cluster. 
       */
      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty.builder()

      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication configuration of the Amazon MSK
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a009abd1f8243e28dde7de4258e4bac1917c47952371575f57756fad31e8f105")
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

      /**
       * @param mskClusterArn The ARN of the Amazon MSK cluster. 
       */
      override fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
      }

      /**
       * @param topicName The topic name within the Amazon MSK cluster. 
       */
      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty,
    ) : CdkObject(cdkObject), MSKSourceConfigurationProperty {
      /**
       * The authentication configuration of the Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * The ARN of the Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-mskclusterarn)
       */
      override fun mskClusterArn(): String = unwrap(this).getMskClusterArn()

      /**
       * The topic name within the Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration-topicname)
       */
      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MSKSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty):
          MSKSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MSKSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MSKSourceConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty
    }
  }

  /**
   * Configure Snowflake destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SnowflakeDestinationConfigurationProperty snowflakeDestinationConfigurationProperty =
   * SnowflakeDestinationConfigurationProperty.builder()
   * .accountUrl("accountUrl")
   * .database("database")
   * .privateKey("privateKey")
   * .roleArn("roleArn")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * .schema("schema")
   * .table("table")
   * .user("user")
   * // the properties below are optional
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .contentColumnName("contentColumnName")
   * .dataLoadingOption("dataLoadingOption")
   * .keyPassphrase("keyPassphrase")
   * .metaDataColumnName("metaDataColumnName")
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(SnowflakeRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .snowflakeRoleConfiguration(SnowflakeRoleConfigurationProperty.builder()
   * .enabled(false)
   * .snowflakeRole("snowflakeRole")
   * .build())
   * .snowflakeVpcConfiguration(SnowflakeVpcConfigurationProperty.builder()
   * .privateLinkVpceId("privateLinkVpceId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html)
   */
  public interface SnowflakeDestinationConfigurationProperty {
    /**
     * URL for accessing your Snowflake account.
     *
     * This URL must include your [account
     * identifier](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-account-identifier)
     * . Note that the protocol (https://) and port number are optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-accounturl)
     */
    public fun accountUrl(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The name of the record content column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-contentcolumnname)
     */
    public fun contentColumnName(): String? = unwrap(this).getContentColumnName()

    /**
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload
     * where content is mapped to a record content column and source metadata is mapped to a record
     * metadata column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-dataloadingoption)
     */
    public fun dataLoadingOption(): String? = unwrap(this).getDataLoadingOption()

    /**
     * All data in Snowflake is maintained in databases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-database)
     */
    public fun database(): String

    /**
     * Passphrase to decrypt the private key when the key is encrypted.
     *
     * For information, see [Using Key Pair Authentication &amp; Key
     * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-keypassphrase)
     */
    public fun keyPassphrase(): String? = unwrap(this).getKeyPassphrase()

    /**
     * The name of the record metadata column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-metadatacolumnname)
     */
    public fun metaDataColumnName(): String? = unwrap(this).getMetaDataColumnName()

    /**
     * The private key used to encrypt your Snowflake client.
     *
     * For information, see [Using Key Pair Authentication &amp; Key
     * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-privatekey)
     */
    public fun privateKey(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * The Amazon Resource Name (ARN) of the Snowflake role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * Choose an S3 backup mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * Each database consists of one or more schemas, which are logical groupings of database
     * objects, such as tables and views.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-schema)
     */
    public fun schema(): String

    /**
     * Optionally configure a Snowflake role.
     *
     * Otherwise the default user role will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-snowflakeroleconfiguration)
     */
    public fun snowflakeRoleConfiguration(): Any? = unwrap(this).getSnowflakeRoleConfiguration()

    /**
     * The VPCE ID for Firehose to privately connect with Snowflake.
     *
     * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see
     * [Amazon PrivateLink &amp;
     * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-snowflakevpcconfiguration)
     */
    public fun snowflakeVpcConfiguration(): Any? = unwrap(this).getSnowflakeVpcConfiguration()

    /**
     * All data in Snowflake is stored in database tables, logically structured as collections of
     * columns and rows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-table)
     */
    public fun table(): String

    /**
     * User login name for the Snowflake account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-user)
     */
    public fun user(): String

    /**
     * A builder for [SnowflakeDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountUrl URL for accessing your Snowflake account. 
       * This URL must include your [account
       * identifier](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-account-identifier)
       * . Note that the protocol (https://) and port number are optional.
       */
      public fun accountUrl(accountUrl: String)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("170277a56d71d5888a1fa0c19bc90f2fb7fcf005ec215173246f019a5b967f23")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param contentColumnName The name of the record content column.
       */
      public fun contentColumnName(contentColumnName: String)

      /**
       * @param dataLoadingOption Choose to load JSON keys mapped to table column names or choose to
       * split the JSON payload where content is mapped to a record content column and source metadata
       * is mapped to a record metadata column.
       */
      public fun dataLoadingOption(dataLoadingOption: String)

      /**
       * @param database All data in Snowflake is maintained in databases. 
       */
      public fun database(database: String)

      /**
       * @param keyPassphrase Passphrase to decrypt the private key when the key is encrypted.
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       */
      public fun keyPassphrase(keyPassphrase: String)

      /**
       * @param metaDataColumnName The name of the record metadata column.
       */
      public fun metaDataColumnName(metaDataColumnName: String)

      /**
       * @param privateKey The private key used to encrypt your Snowflake client. 
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       */
      public fun privateKey(privateKey: String)

      /**
       * @param processingConfiguration the value to be set.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration the value to be set.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b7c9eba4d19077ec65fc84e44e03de2e061dd971541a78967a3eb994b65cfc")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      public fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty)

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95f2330e3e5338c6ffe7bd1a73525ae96d392e0dfb3479e1adc537d86f3da813")
      public fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the Snowflake role. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupMode Choose an S3 backup mode.
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration the value to be set. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration the value to be set. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80cdc5e0777f30389d371b9c606800ce9acc5ddce5043eb2fa0979d38bea4c38")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param schema Each database consists of one or more schemas, which are logical groupings of
       * database objects, such as tables and views. 
       */
      public fun schema(schema: String)

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      public fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: IResolvable)

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      public
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty)

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("200e025cb87cbf9d6960af9286d74d3371aca4a7b342a4ed533869277c728ef8")
      public
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty.Builder.() -> Unit)

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      public fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: IResolvable)

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      public
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty)

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f1bf2038b878cbf77e526aac4338f21f8c4dd056bf19a9c87bef4f478c1dc7b")
      public
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty.Builder.() -> Unit)

      /**
       * @param table All data in Snowflake is stored in database tables, logically structured as
       * collections of columns and rows. 
       */
      public fun table(table: String)

      /**
       * @param user User login name for the Snowflake account. 
       */
      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.builder()

      /**
       * @param accountUrl URL for accessing your Snowflake account. 
       * This URL must include your [account
       * identifier](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-account-identifier)
       * . Note that the protocol (https://) and port number are optional.
       */
      override fun accountUrl(accountUrl: String) {
        cdkBuilder.accountUrl(accountUrl)
      }

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("170277a56d71d5888a1fa0c19bc90f2fb7fcf005ec215173246f019a5b967f23")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param contentColumnName The name of the record content column.
       */
      override fun contentColumnName(contentColumnName: String) {
        cdkBuilder.contentColumnName(contentColumnName)
      }

      /**
       * @param dataLoadingOption Choose to load JSON keys mapped to table column names or choose to
       * split the JSON payload where content is mapped to a record content column and source metadata
       * is mapped to a record metadata column.
       */
      override fun dataLoadingOption(dataLoadingOption: String) {
        cdkBuilder.dataLoadingOption(dataLoadingOption)
      }

      /**
       * @param database All data in Snowflake is maintained in databases. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param keyPassphrase Passphrase to decrypt the private key when the key is encrypted.
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       */
      override fun keyPassphrase(keyPassphrase: String) {
        cdkBuilder.keyPassphrase(keyPassphrase)
      }

      /**
       * @param metaDataColumnName The name of the record metadata column.
       */
      override fun metaDataColumnName(metaDataColumnName: String) {
        cdkBuilder.metaDataColumnName(metaDataColumnName)
      }

      /**
       * @param privateKey The private key used to encrypt your Snowflake client. 
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       */
      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b7c9eba4d19077ec65fc84e44e03de2e061dd971541a78967a3eb994b65cfc")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      override fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(SnowflakeRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The time period where Firehose will retry sending data to the chosen
       * HTTP endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95f2330e3e5338c6ffe7bd1a73525ae96d392e0dfb3479e1adc537d86f3da813")
      override fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(SnowflakeRetryOptionsProperty(retryOptions))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the Snowflake role. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupMode Choose an S3 backup mode.
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80cdc5e0777f30389d371b9c606800ce9acc5ddce5043eb2fa0979d38bea4c38")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      /**
       * @param schema Each database consists of one or more schemas, which are logical groupings of
       * database objects, such as tables and views. 
       */
      override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      override fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: IResolvable) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      override
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration.let(SnowflakeRoleConfigurationProperty::unwrap))
      }

      /**
       * @param snowflakeRoleConfiguration Optionally configure a Snowflake role.
       * Otherwise the default user role will be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("200e025cb87cbf9d6960af9286d74d3371aca4a7b342a4ed533869277c728ef8")
      override
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty.Builder.() -> Unit):
          Unit =
          snowflakeRoleConfiguration(SnowflakeRoleConfigurationProperty(snowflakeRoleConfiguration))

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      override fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: IResolvable) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      override
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration.let(SnowflakeVpcConfigurationProperty::unwrap))
      }

      /**
       * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
       * Snowflake.
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f1bf2038b878cbf77e526aac4338f21f8c4dd056bf19a9c87bef4f478c1dc7b")
      override
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty.Builder.() -> Unit):
          Unit =
          snowflakeVpcConfiguration(SnowflakeVpcConfigurationProperty(snowflakeVpcConfiguration))

      /**
       * @param table All data in Snowflake is stored in database tables, logically structured as
       * collections of columns and rows. 
       */
      override fun table(table: String) {
        cdkBuilder.table(table)
      }

      /**
       * @param user User login name for the Snowflake account. 
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), SnowflakeDestinationConfigurationProperty {
      /**
       * URL for accessing your Snowflake account.
       *
       * This URL must include your [account
       * identifier](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-account-identifier)
       * . Note that the protocol (https://) and port number are optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-accounturl)
       */
      override fun accountUrl(): String = unwrap(this).getAccountUrl()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The name of the record content column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-contentcolumnname)
       */
      override fun contentColumnName(): String? = unwrap(this).getContentColumnName()

      /**
       * Choose to load JSON keys mapped to table column names or choose to split the JSON payload
       * where content is mapped to a record content column and source metadata is mapped to a record
       * metadata column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-dataloadingoption)
       */
      override fun dataLoadingOption(): String? = unwrap(this).getDataLoadingOption()

      /**
       * All data in Snowflake is maintained in databases.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Passphrase to decrypt the private key when the key is encrypted.
       *
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-keypassphrase)
       */
      override fun keyPassphrase(): String? = unwrap(this).getKeyPassphrase()

      /**
       * The name of the record metadata column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-metadatacolumnname)
       */
      override fun metaDataColumnName(): String? = unwrap(this).getMetaDataColumnName()

      /**
       * The private key used to encrypt your Snowflake client.
       *
       * For information, see [Using Key Pair Authentication &amp; Key
       * Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-privatekey)
       */
      override fun privateKey(): String = unwrap(this).getPrivateKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * The Amazon Resource Name (ARN) of the Snowflake role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Choose an S3 backup mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * Each database consists of one or more schemas, which are logical groupings of database
       * objects, such as tables and views.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-schema)
       */
      override fun schema(): String = unwrap(this).getSchema()

      /**
       * Optionally configure a Snowflake role.
       *
       * Otherwise the default user role will be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-snowflakeroleconfiguration)
       */
      override fun snowflakeRoleConfiguration(): Any? = unwrap(this).getSnowflakeRoleConfiguration()

      /**
       * The VPCE ID for Firehose to privately connect with Snowflake.
       *
       * The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information,
       * see [Amazon PrivateLink &amp;
       * Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-snowflakevpcconfiguration)
       */
      override fun snowflakeVpcConfiguration(): Any? = unwrap(this).getSnowflakeVpcConfiguration()

      /**
       * All data in Snowflake is stored in database tables, logically structured as collections of
       * columns and rows.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-table)
       */
      override fun table(): String = unwrap(this).getTable()

      /**
       * User login name for the Snowflake account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration-user)
       */
      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty):
          SnowflakeDestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnowflakeDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty
    }
  }

  /**
   * Describes the buffering to perform before delivering data to the Amazon OpenSearch Service
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonopensearchserviceBufferingHintsProperty amazonopensearchserviceBufferingHintsProperty =
   * AmazonopensearchserviceBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html)
   */
  public interface AmazonopensearchserviceBufferingHintsProperty {
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to
     * the destination.
     *
     * The default value is 300 (5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints-intervalinseconds)
     */
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination.
     *
     * The default value is 5. We recommend setting this parameter to a value greater than the
     * amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you
     * typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints-sizeinmbs)
     */
    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    /**
     * A builder for [AmazonopensearchserviceBufferingHintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 300 (5 minutes).
       */
      public fun intervalInSeconds(intervalInSeconds: Number)

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5. We recommend setting this parameter to a value greater than the
       * amount of data you typically ingest into the delivery stream in 10 seconds. For example, if
       * you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
       */
      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.builder()

      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 300 (5 minutes).
       */
      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5. We recommend setting this parameter to a value greater than the
       * amount of data you typically ingest into the delivery stream in 10 seconds. For example, if
       * you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
       */
      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty,
    ) : CdkObject(cdkObject), AmazonopensearchserviceBufferingHintsProperty {
      /**
       * Buffer incoming data for the specified period of time, in seconds, before delivering it to
       * the destination.
       *
       * The default value is 300 (5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints-intervalinseconds)
       */
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      /**
       * Buffer incoming data to the specified size, in MBs, before delivering it to the
       * destination.
       *
       * The default value is 5. We recommend setting this parameter to a value greater than the
       * amount of data you typically ingest into the delivery stream in 10 seconds. For example, if
       * you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints-sizeinmbs)
       */
      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty):
          AmazonopensearchserviceBufferingHintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmazonopensearchserviceBufferingHintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
    }
  }

  /**
   * The configuration of the HTTP endpoint request.
   *
   * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
   * third-party service providers, including Datadog, MongoDB, and New Relic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * HttpEndpointRequestConfigurationProperty httpEndpointRequestConfigurationProperty =
   * HttpEndpointRequestConfigurationProperty.builder()
   * .commonAttributes(List.of(HttpEndpointCommonAttributeProperty.builder()
   * .attributeName("attributeName")
   * .attributeValue("attributeValue")
   * .build()))
   * .contentEncoding("contentEncoding")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html)
   */
  public interface HttpEndpointRequestConfigurationProperty {
    /**
     * Describes the metadata sent to the HTTP endpoint destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointrequestconfiguration-commonattributes)
     */
    public fun commonAttributes(): Any? = unwrap(this).getCommonAttributes()

    /**
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before
     * sending the request to the destination.
     *
     * For more information, see Content-Encoding in MDN Web Docs, the official Mozilla
     * documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointrequestconfiguration-contentencoding)
     */
    public fun contentEncoding(): String? = unwrap(this).getContentEncoding()

    /**
     * A builder for [HttpEndpointRequestConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      public fun commonAttributes(commonAttributes: IResolvable)

      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      public fun commonAttributes(commonAttributes: List<Any>)

      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      public fun commonAttributes(vararg commonAttributes: Any)

      /**
       * @param contentEncoding Kinesis Data Firehose uses the content encoding to compress the body
       * of a request before sending the request to the destination.
       * For more information, see Content-Encoding in MDN Web Docs, the official Mozilla
       * documentation.
       */
      public fun contentEncoding(contentEncoding: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.builder()

      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      override fun commonAttributes(commonAttributes: IResolvable) {
        cdkBuilder.commonAttributes(commonAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      override fun commonAttributes(commonAttributes: List<Any>) {
        cdkBuilder.commonAttributes(commonAttributes)
      }

      /**
       * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination.
       */
      override fun commonAttributes(vararg commonAttributes: Any): Unit =
          commonAttributes(commonAttributes.toList())

      /**
       * @param contentEncoding Kinesis Data Firehose uses the content encoding to compress the body
       * of a request before sending the request to the destination.
       * For more information, see Content-Encoding in MDN Web Docs, the official Mozilla
       * documentation.
       */
      override fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty,
    ) : CdkObject(cdkObject), HttpEndpointRequestConfigurationProperty {
      /**
       * Describes the metadata sent to the HTTP endpoint destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointrequestconfiguration-commonattributes)
       */
      override fun commonAttributes(): Any? = unwrap(this).getCommonAttributes()

      /**
       * Kinesis Data Firehose uses the content encoding to compress the body of a request before
       * sending the request to the destination.
       *
       * For more information, see Content-Encoding in MDN Web Docs, the official Mozilla
       * documentation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointrequestconfiguration-contentencoding)
       */
      override fun contentEncoding(): String? = unwrap(this).getContentEncoding()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointRequestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty):
          HttpEndpointRequestConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpEndpointRequestConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointRequestConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
    }
  }

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
   * S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html)
   */
  public interface S3DestinationConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket to send data to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * Configures how Kinesis Data Firehose buffers incoming data while delivering it to the Amazon
     * S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * The CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The type of compression that Kinesis Data Firehose uses to compress the data that it delivers
     * to the Amazon S3 bucket.
     *
     * For valid values, see the `CompressionFormat` content for the
     * [S3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_S3DestinationConfiguration.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
     */
    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    /**
     * Configures Amazon Simple Storage Service (Amazon S3) server-side encryption.
     *
     * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that it
     * delivers to your Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them
     * to S3.
     *
     * This prefix appears immediately following the bucket name. For information about how to
     * specify this prefix, see [Custom Prefixes for Amazon S3
     * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-erroroutputprefix)
     */
    public fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

    /**
     * A prefix that Kinesis Data Firehose adds to the files that it delivers to the Amazon S3
     * bucket.
     *
     * The prefix helps you identify the files that Kinesis Data Firehose delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The ARN of an AWS Identity and Access Management (IAM) role that grants Kinesis Data Firehose
     * access to your Amazon S3 bucket and AWS KMS (if you enable data encryption).
     *
     * For more information, see [Grant Kinesis Data Firehose Access to an Amazon S3
     * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3)
     * in the *Amazon Kinesis Data Firehose Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [S3DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket to send data to. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ca41090aa09a13ec5426865590ddd3f8b1e82a068acd483ca57d70c28240945")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0d0cd231850b2f6d2f8a9fe62d93558b0f6160910001b5d45539a4dd0579ed6")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param compressionFormat The type of compression that Kinesis Data Firehose uses to
       * compress the data that it delivers to the Amazon S3 bucket.
       * For valid values, see the `CompressionFormat` content for the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_S3DestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun compressionFormat(compressionFormat: String)

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640a3a95b3147b90f2305f6a8b387a89a87a516f000595d840a59627a444f789")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
       * records before writing them to S3.
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       */
      public fun errorOutputPrefix(errorOutputPrefix: String)

      /**
       * @param prefix A prefix that Kinesis Data Firehose adds to the files that it delivers to the
       * Amazon S3 bucket.
       * The prefix helps you identify the files that Kinesis Data Firehose delivered.
       */
      public fun prefix(prefix: String)

      /**
       * @param roleArn The ARN of an AWS Identity and Access Management (IAM) role that grants
       * Kinesis Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data
       * encryption). 
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon S3
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket to send data to. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
       * delivering it to the Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ca41090aa09a13ec5426865590ddd3f8b1e82a068acd483ca57d70c28240945")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0d0cd231850b2f6d2f8a9fe62d93558b0f6160910001b5d45539a4dd0579ed6")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param compressionFormat The type of compression that Kinesis Data Firehose uses to
       * compress the data that it delivers to the Amazon S3 bucket.
       * For valid values, see the `CompressionFormat` content for the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_S3DestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3)
       * server-side encryption.
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640a3a95b3147b90f2305f6a8b387a89a87a516f000595d840a59627a444f789")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
       * records before writing them to S3.
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       */
      override fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
      }

      /**
       * @param prefix A prefix that Kinesis Data Firehose adds to the files that it delivers to the
       * Amazon S3 bucket.
       * The prefix helps you identify the files that Kinesis Data Firehose delivered.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param roleArn The ARN of an AWS Identity and Access Management (IAM) role that grants
       * Kinesis Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data
       * encryption). 
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon S3
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), S3DestinationConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 bucket to send data to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * Configures how Kinesis Data Firehose buffers incoming data while delivering it to the
       * Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * The CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The type of compression that Kinesis Data Firehose uses to compress the data that it
       * delivers to the Amazon S3 bucket.
       *
       * For valid values, see the `CompressionFormat` content for the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_S3DestinationConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
       */
      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      /**
       * Configures Amazon Simple Storage Service (Amazon S3) server-side encryption.
       *
       * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that
       * it delivers to your Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      /**
       * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing
       * them to S3.
       *
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-erroroutputprefix)
       */
      override fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

      /**
       * A prefix that Kinesis Data Firehose adds to the files that it delivers to the Amazon S3
       * bucket.
       *
       * The prefix helps you identify the files that Kinesis Data Firehose delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The ARN of an AWS Identity and Access Management (IAM) role that grants Kinesis Data
       * Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data encryption).
       *
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon S3
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3DestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
    }
  }

  /**
   * Describes the buffering to perform before delivering data to the Serverless offering for Amazon
   * OpenSearch Service destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonOpenSearchServerlessBufferingHintsProperty
   * amazonOpenSearchServerlessBufferingHintsProperty =
   * AmazonOpenSearchServerlessBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html)
   */
  public interface AmazonOpenSearchServerlessBufferingHintsProperty {
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to
     * the destination.
     *
     * The default value is 300 (5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints-intervalinseconds)
     */
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination.
     *
     * The default value is 5.
     *
     * We recommend setting this parameter to a value greater than the amount of data you typically
     * ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1
     * MB/sec, the value should be 10 MB or higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints-sizeinmbs)
     */
    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    /**
     * A builder for [AmazonOpenSearchServerlessBufferingHintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 300 (5 minutes).
       */
      public fun intervalInSeconds(intervalInSeconds: Number)

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5.
       *
       * We recommend setting this parameter to a value greater than the amount of data you
       * typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest
       * data at 1 MB/sec, the value should be 10 MB or higher.
       */
      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.builder()

      /**
       * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
       * before delivering it to the destination.
       * The default value is 300 (5 minutes).
       */
      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      /**
       * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it
       * to the destination.
       * The default value is 5.
       *
       * We recommend setting this parameter to a value greater than the amount of data you
       * typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest
       * data at 1 MB/sec, the value should be 10 MB or higher.
       */
      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty,
    ) : CdkObject(cdkObject), AmazonOpenSearchServerlessBufferingHintsProperty {
      /**
       * Buffer incoming data for the specified period of time, in seconds, before delivering it to
       * the destination.
       *
       * The default value is 300 (5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints-intervalinseconds)
       */
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      /**
       * Buffer incoming data to the specified size, in MBs, before delivering it to the
       * destination.
       *
       * The default value is 5.
       *
       * We recommend setting this parameter to a value greater than the amount of data you
       * typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest
       * data at 1 MB/sec, the value should be 10 MB or higher.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints-sizeinmbs)
       */
      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty):
          AmazonOpenSearchServerlessBufferingHintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmazonOpenSearchServerlessBufferingHintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
    }
  }

  /**
   * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to
   * Amazon OpenSearch Service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonopensearchserviceRetryOptionsProperty amazonopensearchserviceRetryOptionsProperty =
   * AmazonopensearchserviceRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions.html)
   */
  public interface AmazonopensearchserviceRetryOptionsProperty {
    /**
     * After an initial failure to deliver to Amazon OpenSearch Service, the total amount of time
     * during which Kinesis Data Firehose retries delivery (including the first attempt).
     *
     * After this time has elapsed, the failed documents are written to Amazon S3. Default value is
     * 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [AmazonopensearchserviceRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds After an initial failure to deliver to Amazon OpenSearch Service,
       * the total amount of time during which Kinesis Data Firehose retries delivery (including the
       * first attempt).
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds After an initial failure to deliver to Amazon OpenSearch Service,
       * the total amount of time during which Kinesis Data Firehose retries delivery (including the
       * first attempt).
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty,
    ) : CdkObject(cdkObject), AmazonopensearchserviceRetryOptionsProperty {
      /**
       * After an initial failure to deliver to Amazon OpenSearch Service, the total amount of time
       * during which Kinesis Data Firehose retries delivery (including the first attempt).
       *
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty):
          AmazonopensearchserviceRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmazonopensearchserviceRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
    }
  }

  /**
   * The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON.
   *
   * Kinesis Data Firehose then serializes the data to its final format using the `Serializer` .
   * Kinesis Data Firehose supports two types of deserializers: the [Apache Hive JSON
   * SerDe](https://docs.aws.amazon.com/https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON)
   * and the [OpenX JSON SerDe](https://docs.aws.amazon.com/https://github.com/rcongiu/Hive-JSON-Serde)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * DeserializerProperty deserializerProperty = DeserializerProperty.builder()
   * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
   * .timestampFormats(List.of("timestampFormats"))
   * .build())
   * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
   * .caseInsensitive(false)
   * .columnToJsonKeyMappings(Map.of(
   * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
   * .convertDotsInJsonKeysToUnderscores(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html)
   */
  public interface DeserializerProperty {
    /**
     * The native Hive / HCatalog JsonSerDe.
     *
     * Used by Firehose for deserializing data, which means converting it from the JSON format in
     * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
     * you can choose, depending on which one offers the functionality you need. The other option is
     * the OpenX SerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html#cfn-kinesisfirehose-deliverystream-deserializer-hivejsonserde)
     */
    public fun hiveJsonSerDe(): Any? = unwrap(this).getHiveJsonSerDe()

    /**
     * The OpenX SerDe.
     *
     * Used by Firehose for deserializing data, which means converting it from the JSON format in
     * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
     * you can choose, depending on which one offers the functionality you need. The other option is
     * the native Hive / HCatalog JsonSerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html#cfn-kinesisfirehose-deliverystream-deserializer-openxjsonserde)
     */
    public fun openXJsonSerDe(): Any? = unwrap(this).getOpenXJsonSerDe()

    /**
     * A builder for [DeserializerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      public fun hiveJsonSerDe(hiveJsonSerDe: IResolvable)

      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      public fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty)

      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ea33b2c029a95c087850deaf83c4f3e4a5fdbdff139ee9977885b798807ce2d")
      public fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty.Builder.() -> Unit)

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      public fun openXJsonSerDe(openXJsonSerDe: IResolvable)

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      public fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty)

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e0b536a1bcf046899c4f672537af31dd8b8a1add133e9cf60bc6036aa85bde")
      public fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty.builder()

      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      override fun hiveJsonSerDe(hiveJsonSerDe: IResolvable) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe.let(IResolvable::unwrap))
      }

      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      override fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe.let(HiveJsonSerDeProperty::unwrap))
      }

      /**
       * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ea33b2c029a95c087850deaf83c4f3e4a5fdbdff139ee9977885b798807ce2d")
      override fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty.Builder.() -> Unit): Unit =
          hiveJsonSerDe(HiveJsonSerDeProperty(hiveJsonSerDe))

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      override fun openXJsonSerDe(openXJsonSerDe: IResolvable) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe.let(IResolvable::unwrap))
      }

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      override fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe.let(OpenXJsonSerDeProperty::unwrap))
      }

      /**
       * @param openXJsonSerDe The OpenX SerDe.
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e0b536a1bcf046899c4f672537af31dd8b8a1add133e9cf60bc6036aa85bde")
      override fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty.Builder.() -> Unit): Unit =
          openXJsonSerDe(OpenXJsonSerDeProperty(openXJsonSerDe))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty,
    ) : CdkObject(cdkObject), DeserializerProperty {
      /**
       * The native Hive / HCatalog JsonSerDe.
       *
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the OpenX SerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html#cfn-kinesisfirehose-deliverystream-deserializer-hivejsonserde)
       */
      override fun hiveJsonSerDe(): Any? = unwrap(this).getHiveJsonSerDe()

      /**
       * The OpenX SerDe.
       *
       * Used by Firehose for deserializing data, which means converting it from the JSON format in
       * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
       * you can choose, depending on which one offers the functionality you need. The other option is
       * the native Hive / HCatalog JsonSerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html#cfn-kinesisfirehose-deliverystream-deserializer-openxjsonserde)
       */
      override fun openXJsonSerDe(): Any? = unwrap(this).getOpenXJsonSerDe()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeserializerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty):
          DeserializerProperty = CdkObjectWrappers.wrap(cdkObject) as? DeserializerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeserializerProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty
    }
  }

  /**
   * The serializer that you want Firehose to use to convert data to the target format before
   * writing it to Amazon S3.
   *
   * Firehose supports two types of serializers: the [ORC
   * SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html)
   * and the [Parquet
   * SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SerializerProperty serializerProperty = SerializerProperty.builder()
   * .orcSerDe(OrcSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .bloomFilterColumns(List.of("bloomFilterColumns"))
   * .bloomFilterFalsePositiveProbability(123)
   * .compression("compression")
   * .dictionaryKeyThreshold(123)
   * .enablePadding(false)
   * .formatVersion("formatVersion")
   * .paddingTolerance(123)
   * .rowIndexStride(123)
   * .stripeSizeBytes(123)
   * .build())
   * .parquetSerDe(ParquetSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .compression("compression")
   * .enableDictionaryCompression(false)
   * .maxPaddingBytes(123)
   * .pageSizeBytes(123)
   * .writerVersion("writerVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html)
   */
  public interface SerializerProperty {
    /**
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3.
     *
     * For more information, see [Apache
     * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html#cfn-kinesisfirehose-deliverystream-serializer-orcserde)
     */
    public fun orcSerDe(): Any? = unwrap(this).getOrcSerDe()

    /**
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3.
     *
     * For more information, see [Apache
     * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html#cfn-kinesisfirehose-deliverystream-serializer-parquetserde)
     */
    public fun parquetSerDe(): Any? = unwrap(this).getParquetSerDe()

    /**
     * A builder for [SerializerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      public fun orcSerDe(orcSerDe: IResolvable)

      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      public fun orcSerDe(orcSerDe: OrcSerDeProperty)

      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d783f896de9fcee687d32c744d0e49bce185d90b1b7e3b7cfd4f23ccb4e53da2")
      public fun orcSerDe(orcSerDe: OrcSerDeProperty.Builder.() -> Unit)

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      public fun parquetSerDe(parquetSerDe: IResolvable)

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      public fun parquetSerDe(parquetSerDe: ParquetSerDeProperty)

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("953e85fd9f4dd15c7294aa43c03da0cfc0e1f6e7e39d451bb5c5cb6bb68a84b0")
      public fun parquetSerDe(parquetSerDe: ParquetSerDeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty.builder()

      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      override fun orcSerDe(orcSerDe: IResolvable) {
        cdkBuilder.orcSerDe(orcSerDe.let(IResolvable::unwrap))
      }

      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      override fun orcSerDe(orcSerDe: OrcSerDeProperty) {
        cdkBuilder.orcSerDe(orcSerDe.let(OrcSerDeProperty::unwrap))
      }

      /**
       * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
       * in Amazon S3.
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d783f896de9fcee687d32c744d0e49bce185d90b1b7e3b7cfd4f23ccb4e53da2")
      override fun orcSerDe(orcSerDe: OrcSerDeProperty.Builder.() -> Unit): Unit =
          orcSerDe(OrcSerDeProperty(orcSerDe))

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      override fun parquetSerDe(parquetSerDe: IResolvable) {
        cdkBuilder.parquetSerDe(parquetSerDe.let(IResolvable::unwrap))
      }

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      override fun parquetSerDe(parquetSerDe: ParquetSerDeProperty) {
        cdkBuilder.parquetSerDe(parquetSerDe.let(ParquetSerDeProperty::unwrap))
      }

      /**
       * @param parquetSerDe A serializer to use for converting data to the Parquet format before
       * storing it in Amazon S3.
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("953e85fd9f4dd15c7294aa43c03da0cfc0e1f6e7e39d451bb5c5cb6bb68a84b0")
      override fun parquetSerDe(parquetSerDe: ParquetSerDeProperty.Builder.() -> Unit): Unit =
          parquetSerDe(ParquetSerDeProperty(parquetSerDe))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty,
    ) : CdkObject(cdkObject), SerializerProperty {
      /**
       * A serializer to use for converting data to the ORC format before storing it in Amazon S3.
       *
       * For more information, see [Apache
       * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html#cfn-kinesisfirehose-deliverystream-serializer-orcserde)
       */
      override fun orcSerDe(): Any? = unwrap(this).getOrcSerDe()

      /**
       * A serializer to use for converting data to the Parquet format before storing it in Amazon
       * S3.
       *
       * For more information, see [Apache
       * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html#cfn-kinesisfirehose-deliverystream-serializer-parquetserde)
       */
      override fun parquetSerDe(): Any? = unwrap(this).getParquetSerDe()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SerializerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty):
          SerializerProperty = CdkObjectWrappers.wrap(cdkObject) as? SerializerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerializerProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty
    }
  }

  /**
   * The `CloudWatchLoggingOptions` property type specifies Amazon CloudWatch Logs (CloudWatch Logs)
   * logging options that Amazon Kinesis Data Firehose (Kinesis Data Firehose) uses for the delivery
   * stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * CloudWatchLoggingOptionsProperty cloudWatchLoggingOptionsProperty =
   * CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html)
   */
  public interface CloudWatchLoggingOptionsProperty {
    /**
     * Indicates whether CloudWatch Logs logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The name of the CloudWatch Logs log group that contains the log stream that Kinesis Data
     * Firehose will use.
     *
     * Conditional. If you enable logging, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The name of the CloudWatch Logs log stream that Kinesis Data Firehose uses to send logs about
     * data delivery.
     *
     * Conditional. If you enable logging, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
     */
    public fun logStreamName(): String? = unwrap(this).getLogStreamName()

    /**
     * A builder for [CloudWatchLoggingOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether CloudWatch Logs logging is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether CloudWatch Logs logging is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logGroupName The name of the CloudWatch Logs log group that contains the log stream
       * that Kinesis Data Firehose will use.
       * Conditional. If you enable logging, you must specify this property.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logStreamName The name of the CloudWatch Logs log stream that Kinesis Data Firehose
       * uses to send logs about data delivery.
       * Conditional. If you enable logging, you must specify this property.
       */
      public fun logStreamName(logStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.builder()

      /**
       * @param enabled Indicates whether CloudWatch Logs logging is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether CloudWatch Logs logging is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logGroupName The name of the CloudWatch Logs log group that contains the log stream
       * that Kinesis Data Firehose will use.
       * Conditional. If you enable logging, you must specify this property.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logStreamName The name of the CloudWatch Logs log stream that Kinesis Data Firehose
       * uses to send logs about data delivery.
       * Conditional. If you enable logging, you must specify this property.
       */
      override fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty,
    ) : CdkObject(cdkObject), CloudWatchLoggingOptionsProperty {
      /**
       * Indicates whether CloudWatch Logs logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The name of the CloudWatch Logs log group that contains the log stream that Kinesis Data
       * Firehose will use.
       *
       * Conditional. If you enable logging, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * The name of the CloudWatch Logs log stream that Kinesis Data Firehose uses to send logs
       * about data delivery.
       *
       * Conditional. If you enable logging, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
       */
      override fun logStreamName(): String? = unwrap(this).getLogStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty):
          CloudWatchLoggingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLoggingOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    }
  }

  /**
   * Specifies the deserializer you want to use to convert the format of the input data.
   *
   * This parameter is required if `Enabled` is set to true.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * InputFormatConfigurationProperty inputFormatConfigurationProperty =
   * InputFormatConfigurationProperty.builder()
   * .deserializer(DeserializerProperty.builder()
   * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
   * .timestampFormats(List.of("timestampFormats"))
   * .build())
   * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
   * .caseInsensitive(false)
   * .columnToJsonKeyMappings(Map.of(
   * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
   * .convertDotsInJsonKeysToUnderscores(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html)
   */
  public interface InputFormatConfigurationProperty {
    /**
     * Specifies which deserializer to use.
     *
     * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
     * non-null, the server rejects the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html#cfn-kinesisfirehose-deliverystream-inputformatconfiguration-deserializer)
     */
    public fun deserializer(): Any? = unwrap(this).getDeserializer()

    /**
     * A builder for [InputFormatConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      public fun deserializer(deserializer: IResolvable)

      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      public fun deserializer(deserializer: DeserializerProperty)

      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23ec1039d99303312bdb2fc16a73f2a2e373ead331e31a481f326503b95ca673")
      public fun deserializer(deserializer: DeserializerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty.builder()

      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      override fun deserializer(deserializer: IResolvable) {
        cdkBuilder.deserializer(deserializer.let(IResolvable::unwrap))
      }

      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      override fun deserializer(deserializer: DeserializerProperty) {
        cdkBuilder.deserializer(deserializer.let(DeserializerProperty::unwrap))
      }

      /**
       * @param deserializer Specifies which deserializer to use.
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23ec1039d99303312bdb2fc16a73f2a2e373ead331e31a481f326503b95ca673")
      override fun deserializer(deserializer: DeserializerProperty.Builder.() -> Unit): Unit =
          deserializer(DeserializerProperty(deserializer))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty,
    ) : CdkObject(cdkObject), InputFormatConfigurationProperty {
      /**
       * Specifies which deserializer to use.
       *
       * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are
       * non-null, the server rejects the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html#cfn-kinesisfirehose-deliverystream-inputformatconfiguration-deserializer)
       */
      override fun deserializer(): Any? = unwrap(this).getDeserializer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty):
          InputFormatConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputFormatConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFormatConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty
    }
  }

  /**
   * Configures retry behavior in case Firehose is unable to deliver documents to the Serverless
   * offering for Amazon OpenSearch Service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonOpenSearchServerlessRetryOptionsProperty amazonOpenSearchServerlessRetryOptionsProperty =
   * AmazonOpenSearchServerlessRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html)
   */
  public interface AmazonOpenSearchServerlessRetryOptionsProperty {
    /**
     * After an initial failure to deliver to the Serverless offering for Amazon OpenSearch Service,
     * the total amount of time during which Firehose retries delivery (including the first attempt).
     *
     * After this time has elapsed, the failed documents are written to Amazon S3. Default value is
     * 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [AmazonOpenSearchServerlessRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds After an initial failure to deliver to the Serverless offering for
       * Amazon OpenSearch Service, the total amount of time during which Firehose retries delivery
       * (including the first attempt).
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds After an initial failure to deliver to the Serverless offering for
       * Amazon OpenSearch Service, the total amount of time during which Firehose retries delivery
       * (including the first attempt).
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty,
    ) : CdkObject(cdkObject), AmazonOpenSearchServerlessRetryOptionsProperty {
      /**
       * After an initial failure to deliver to the Serverless offering for Amazon OpenSearch
       * Service, the total amount of time during which Firehose retries delivery (including the first
       * attempt).
       *
       * After this time has elapsed, the failed documents are written to Amazon S3. Default value
       * is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty):
          AmazonOpenSearchServerlessRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmazonOpenSearchServerlessRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
    }
  }

  /**
   * Describes the metadata that's delivered to the specified HTTP endpoint destination.
   *
   * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
   * third-party service providers, including Datadog, MongoDB, and New Relic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * HttpEndpointCommonAttributeProperty httpEndpointCommonAttributeProperty =
   * HttpEndpointCommonAttributeProperty.builder()
   * .attributeName("attributeName")
   * .attributeValue("attributeValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html)
   */
  public interface HttpEndpointCommonAttributeProperty {
    /**
     * The name of the HTTP endpoint common attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html#cfn-kinesisfirehose-deliverystream-httpendpointcommonattribute-attributename)
     */
    public fun attributeName(): String

    /**
     * The value of the HTTP endpoint common attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html#cfn-kinesisfirehose-deliverystream-httpendpointcommonattribute-attributevalue)
     */
    public fun attributeValue(): String

    /**
     * A builder for [HttpEndpointCommonAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of the HTTP endpoint common attribute. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param attributeValue The value of the HTTP endpoint common attribute. 
       */
      public fun attributeValue(attributeValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder()

      /**
       * @param attributeName The name of the HTTP endpoint common attribute. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param attributeValue The value of the HTTP endpoint common attribute. 
       */
      override fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty,
    ) : CdkObject(cdkObject), HttpEndpointCommonAttributeProperty {
      /**
       * The name of the HTTP endpoint common attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html#cfn-kinesisfirehose-deliverystream-httpendpointcommonattribute-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The value of the HTTP endpoint common attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html#cfn-kinesisfirehose-deliverystream-httpendpointcommonattribute-attributevalue)
       */
      override fun attributeValue(): String = unwrap(this).getAttributeValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointCommonAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty):
          HttpEndpointCommonAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpEndpointCommonAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointCommonAttributeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty
    }
  }

  /**
   * Describes the configuration of the HTTP endpoint destination.
   *
   * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
   * third-party service providers, including Datadog, MongoDB, and New Relic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * HttpEndpointDestinationConfigurationProperty httpEndpointDestinationConfigurationProperty =
   * HttpEndpointDestinationConfigurationProperty.builder()
   * .endpointConfiguration(HttpEndpointConfigurationProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .accessKey("accessKey")
   * .name("name")
   * .build())
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .requestConfiguration(HttpEndpointRequestConfigurationProperty.builder()
   * .commonAttributes(List.of(HttpEndpointCommonAttributeProperty.builder()
   * .attributeName("attributeName")
   * .attributeValue("attributeValue")
   * .build()))
   * .contentEncoding("contentEncoding")
   * .build())
   * .retryOptions(RetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .roleArn("roleArn")
   * .s3BackupMode("s3BackupMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html)
   */
  public interface HttpEndpointDestinationConfigurationProperty {
    /**
     * The buffering options that can be used before data is delivered to the specified destination.
     *
     * Kinesis Data Firehose treats these options as hints, and it might choose to use more optimal
     * values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you specify a
     * value for one of them, you must also provide a value for the other.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * Describes the Amazon CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The configuration of the HTTP endpoint selected as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-endpointconfiguration)
     */
    public fun endpointConfiguration(): Any

    /**
     * Describes the data processing configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The configuration of the request sent to the HTTP endpoint specified as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-requestconfiguration)
     */
    public fun requestConfiguration(): Any? = unwrap(this).getRequestConfiguration()

    /**
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the
     * specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt
     * from the specified HTTP endpoint destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream
     * needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to
     * the HTTP endpoint destination.
     *
     * You can back up all documents (AllData) or only the documents that Kinesis Data Firehose
     * could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * Describes the configuration of a destination in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * A builder for [HttpEndpointDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1a13f33fd5f6df119c0b45ed202ee628910f8d4777c13ecb1a927549fcbeaef")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccdba24c0ec57c435f7fe3732f10b7a42aafaf6bcb6d7405711e1a3bde676be7")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      public fun endpointConfiguration(endpointConfiguration: IResolvable)

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      public fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty)

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0764ae9bfb42ba183e70fd8c675c00e81b4ebe3ad0ddd795dc13dabb1a6ebe8")
      public
          fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty.Builder.() -> Unit)

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df44256b8689bc61dd24b653a7d54973be448b61c7011b67dce39b8578c1b475")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      public fun requestConfiguration(requestConfiguration: IResolvable)

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      public
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty)

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("997e41975a88698fdf9438071100b9f58f63b2e3f38260225dc0e978312a56b4")
      public
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      public fun retryOptions(retryOptions: RetryOptionsProperty)

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("559085756a6e15b1b81c15bfdd751099d912b10160f7c17b843f69e7ef17b819")
      public fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn Kinesis Data Firehose uses this IAM role for all the permissions that the
       * delivery stream needs.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupMode Describes the S3 bucket backup options for the data that Kinesis Data
       * Firehose delivers to the HTTP endpoint destination.
       * You can back up all documents (AllData) or only the documents that Kinesis Data Firehose
       * could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3028a43c60af828f00c40d725e2fe11ad07370d61b25c36f3684653b96bfcdd7")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder()

      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints The buffering options that can be used before data is delivered to
       * the specified destination.
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1a13f33fd5f6df119c0b45ed202ee628910f8d4777c13ecb1a927549fcbeaef")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
       * delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccdba24c0ec57c435f7fe3732f10b7a42aafaf6bcb6d7405711e1a3bde676be7")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      override fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      override fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty) {
        cdkBuilder.endpointConfiguration(endpointConfiguration.let(HttpEndpointConfigurationProperty::unwrap))
      }

      /**
       * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
       * destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0764ae9bfb42ba183e70fd8c675c00e81b4ebe3ad0ddd795dc13dabb1a6ebe8")
      override
          fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty.Builder.() -> Unit):
          Unit = endpointConfiguration(HttpEndpointConfigurationProperty(endpointConfiguration))

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration Describes the data processing configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df44256b8689bc61dd24b653a7d54973be448b61c7011b67dce39b8578c1b475")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      override fun requestConfiguration(requestConfiguration: IResolvable) {
        cdkBuilder.requestConfiguration(requestConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      override
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty) {
        cdkBuilder.requestConfiguration(requestConfiguration.let(HttpEndpointRequestConfigurationProperty::unwrap))
      }

      /**
       * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
       * specified as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("997e41975a88698fdf9438071100b9f58f63b2e3f38260225dc0e978312a56b4")
      override
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty.Builder.() -> Unit):
          Unit =
          requestConfiguration(HttpEndpointRequestConfigurationProperty(requestConfiguration))

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      override fun retryOptions(retryOptions: RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
       * acknowledgment of receipt from the specified HTTP endpoint destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("559085756a6e15b1b81c15bfdd751099d912b10160f7c17b843f69e7ef17b819")
      override fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(RetryOptionsProperty(retryOptions))

      /**
       * @param roleArn Kinesis Data Firehose uses this IAM role for all the permissions that the
       * delivery stream needs.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupMode Describes the S3 bucket backup options for the data that Kinesis Data
       * Firehose delivers to the HTTP endpoint destination.
       * You can back up all documents (AllData) or only the documents that Kinesis Data Firehose
       * could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3028a43c60af828f00c40d725e2fe11ad07370d61b25c36f3684653b96bfcdd7")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), HttpEndpointDestinationConfigurationProperty {
      /**
       * The buffering options that can be used before data is delivered to the specified
       * destination.
       *
       * Kinesis Data Firehose treats these options as hints, and it might choose to use more
       * optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you
       * specify a value for one of them, you must also provide a value for the other.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * Describes the Amazon CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The configuration of the HTTP endpoint selected as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-endpointconfiguration)
       */
      override fun endpointConfiguration(): Any = unwrap(this).getEndpointConfiguration()

      /**
       * Describes the data processing configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The configuration of the request sent to the HTTP endpoint specified as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-requestconfiguration)
       */
      override fun requestConfiguration(): Any? = unwrap(this).getRequestConfiguration()

      /**
       * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the
       * specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of
       * receipt from the specified HTTP endpoint destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream
       * needs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to
       * the HTTP endpoint destination.
       *
       * You can back up all documents (AllData) or only the documents that Kinesis Data Firehose
       * could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * Describes the configuration of a destination in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty):
          HttpEndpointDestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpEndpointDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
    }
  }

  /**
   * The native Hive / HCatalog JsonSerDe.
   *
   * Used by Firehose for deserializing data, which means converting it from the JSON format in
   * preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you
   * can choose, depending on which one offers the functionality you need. The other option is the
   * OpenX SerDe.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * HiveJsonSerDeProperty hiveJsonSerDeProperty = HiveJsonSerDeProperty.builder()
   * .timestampFormats(List.of("timestampFormats"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html)
   */
  public interface HiveJsonSerDeProperty {
    /**
     * Indicates how you want Firehose to parse the date and timestamps that may be present in your
     * input data JSON.
     *
     * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
     * format strings. For more information, see [Class
     * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
     * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If you
     * don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats)
     */
    public fun timestampFormats(): List<String> = unwrap(this).getTimestampFormats() ?: emptyList()

    /**
     * A builder for [HiveJsonSerDeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timestampFormats Indicates how you want Firehose to parse the date and timestamps
       * that may be present in your input data JSON.
       * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
       * format strings. For more information, see [Class
       * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
       * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
       * you don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
       */
      public fun timestampFormats(timestampFormats: List<String>)

      /**
       * @param timestampFormats Indicates how you want Firehose to parse the date and timestamps
       * that may be present in your input data JSON.
       * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
       * format strings. For more information, see [Class
       * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
       * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
       * you don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
       */
      public fun timestampFormats(vararg timestampFormats: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.builder()

      /**
       * @param timestampFormats Indicates how you want Firehose to parse the date and timestamps
       * that may be present in your input data JSON.
       * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
       * format strings. For more information, see [Class
       * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
       * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
       * you don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
       */
      override fun timestampFormats(timestampFormats: List<String>) {
        cdkBuilder.timestampFormats(timestampFormats)
      }

      /**
       * @param timestampFormats Indicates how you want Firehose to parse the date and timestamps
       * that may be present in your input data JSON.
       * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
       * format strings. For more information, see [Class
       * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
       * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
       * you don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
       */
      override fun timestampFormats(vararg timestampFormats: String): Unit =
          timestampFormats(timestampFormats.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty,
    ) : CdkObject(cdkObject), HiveJsonSerDeProperty {
      /**
       * Indicates how you want Firehose to parse the date and timestamps that may be present in
       * your input data JSON.
       *
       * To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
       * format strings. For more information, see [Class
       * DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
       * . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
       * you don't specify a format, Firehose uses `java.sql.Timestamp::valueOf` by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats)
       */
      override fun timestampFormats(): List<String> = unwrap(this).getTimestampFormats() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HiveJsonSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty):
          HiveJsonSerDeProperty = CdkObjectWrappers.wrap(cdkObject) as? HiveJsonSerDeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HiveJsonSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty
    }
  }

  /**
   * The `ExtendedS3DestinationConfiguration` property type configures an Amazon S3 destination for
   * an Amazon Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ExtendedS3DestinationConfigurationProperty extendedS3DestinationConfigurationProperty =
   * ExtendedS3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .customTimeZone("customTimeZone")
   * .dataFormatConversionConfiguration(DataFormatConversionConfigurationProperty.builder()
   * .enabled(false)
   * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
   * .deserializer(DeserializerProperty.builder()
   * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
   * .timestampFormats(List.of("timestampFormats"))
   * .build())
   * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
   * .caseInsensitive(false)
   * .columnToJsonKeyMappings(Map.of(
   * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
   * .convertDotsInJsonKeysToUnderscores(false)
   * .build())
   * .build())
   * .build())
   * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
   * .serializer(SerializerProperty.builder()
   * .orcSerDe(OrcSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .bloomFilterColumns(List.of("bloomFilterColumns"))
   * .bloomFilterFalsePositiveProbability(123)
   * .compression("compression")
   * .dictionaryKeyThreshold(123)
   * .enablePadding(false)
   * .formatVersion("formatVersion")
   * .paddingTolerance(123)
   * .rowIndexStride(123)
   * .stripeSizeBytes(123)
   * .build())
   * .parquetSerDe(ParquetSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .compression("compression")
   * .enableDictionaryCompression(false)
   * .maxPaddingBytes(123)
   * .pageSizeBytes(123)
   * .writerVersion("writerVersion")
   * .build())
   * .build())
   * .build())
   * .schemaConfiguration(SchemaConfigurationProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .region("region")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * .versionId("versionId")
   * .build())
   * .build())
   * .dynamicPartitioningConfiguration(DynamicPartitioningConfigurationProperty.builder()
   * .enabled(false)
   * .retryOptions(RetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .fileExtension("fileExtension")
   * .prefix("prefix")
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html)
   */
  public interface ExtendedS3DestinationConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     *
     * For constraints, see
     * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     * in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The buffering option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * The Amazon CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The compression format.
     *
     * If no value is specified, the default is `UNCOMPRESSED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
     */
    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    /**
     * The time zone you prefer.
     *
     * UTC is the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-customtimezone)
     */
    public fun customTimeZone(): String? = unwrap(this).getCustomTimeZone()

    /**
     * The serializer, deserializer, and schema for converting data from the JSON format to the
     * Parquet or ORC format before writing it to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-dataformatconversionconfiguration)
     */
    public fun dataFormatConversionConfiguration(): Any? =
        unwrap(this).getDataFormatConversionConfiguration()

    /**
     * The configuration of the dynamic partitioning mechanism that creates targeted data sets from
     * the streaming data by partitioning it based on partition keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-dynamicpartitioningconfiguration)
     */
    public fun dynamicPartitioningConfiguration(): Any? =
        unwrap(this).getDynamicPartitioningConfiguration()

    /**
     * The encryption configuration for the Kinesis Data Firehose delivery stream.
     *
     * The default value is `NoEncryption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them
     * to S3.
     *
     * This prefix appears immediately following the bucket name. For information about how to
     * specify this prefix, see [Custom Prefixes for Amazon S3
     * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix)
     */
    public fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

    /**
     * Specify a file extension.
     *
     * It will override the default file extension
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-fileextension)
     */
    public fun fileExtension(): String? = unwrap(this).getFileExtension()

    /**
     * The `YYYY/MM/DD/HH` time format prefix is automatically used for delivered Amazon S3 files.
     *
     * For more information, see
     * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     * in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The data processing configuration for the Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the AWS credentials.
     *
     * For constraints, see
     * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     * in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The configuration for backup in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
     */
    public fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

    /**
     * The Amazon S3 backup mode.
     *
     * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
     * disabled. If backup is enabled, you can't update the delivery stream to disable it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * A builder for [ExtendedS3DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. 
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param bufferingHints The buffering option.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints The buffering option.
       */
      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      /**
       * @param bufferingHints The buffering option.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76ed7dcfa53f225c44bbfb337353d8351f222239d3db30f3b5c5fd9254fe7561")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aaf1d827e086a90ccbe61dae63485c39ab22db86dae0ac0592a4ee2c1262c711")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param compressionFormat The compression format.
       * If no value is specified, the default is `UNCOMPRESSED` .
       */
      public fun compressionFormat(compressionFormat: String)

      /**
       * @param customTimeZone The time zone you prefer.
       * UTC is the default.
       */
      public fun customTimeZone(customTimeZone: String)

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      public fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable)

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      public
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty)

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcd2b258d463c407842d1fc46593e9bb1abbf394cacd7d25a49da3f02d6a8a")
      public
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      public fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable)

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      public
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty)

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("893f7631d9f20ab8a66513fad134896ba742af22fd769461cf30b85d42e82985")
      public
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty.Builder.() -> Unit)

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5d173a1b0584d4adbb2d31b81347141312686f87cb6155670e61726e2bbb2c")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
       * records before writing them to S3.
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       */
      public fun errorOutputPrefix(errorOutputPrefix: String)

      /**
       * @param fileExtension Specify a file extension.
       * It will override the default file extension
       */
      public fun fileExtension(fileExtension: String)

      /**
       * @param prefix The `YYYY/MM/DD/HH` time format prefix is automatically used for delivered
       * Amazon S3 files.
       * For more information, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun prefix(prefix: String)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a710cd8228354ceb6f3cae2c0decf839f8c2b86f00e8ec1ddb508272af2f7fb2")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the AWS credentials. 
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      public fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c024b93d3ac730d3df10eb56e1d65de2e17df9c07c47791f82caff1a2658e2")
      public
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3BackupMode The Amazon S3 backup mode.
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       */
      public fun s3BackupMode(s3BackupMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. 
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param bufferingHints The buffering option.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints The buffering option.
       */
      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints The buffering option.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76ed7dcfa53f225c44bbfb337353d8351f222239d3db30f3b5c5fd9254fe7561")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
       * stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aaf1d827e086a90ccbe61dae63485c39ab22db86dae0ac0592a4ee2c1262c711")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param compressionFormat The compression format.
       * If no value is specified, the default is `UNCOMPRESSED` .
       */
      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      /**
       * @param customTimeZone The time zone you prefer.
       * UTC is the default.
       */
      override fun customTimeZone(customTimeZone: String) {
        cdkBuilder.customTimeZone(customTimeZone)
      }

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration.let(DataFormatConversionConfigurationProperty::unwrap))
      }

      /**
       * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
       * converting data from the JSON format to the Parquet or ORC format before writing it to Amazon
       * S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcd2b258d463c407842d1fc46593e9bb1abbf394cacd7d25a49da3f02d6a8a")
      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty.Builder.() -> Unit):
          Unit =
          dataFormatConversionConfiguration(DataFormatConversionConfigurationProperty(dataFormatConversionConfiguration))

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      override fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      override
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration.let(DynamicPartitioningConfigurationProperty::unwrap))
      }

      /**
       * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
       * mechanism that creates targeted data sets from the streaming data by partitioning it based on
       * partition keys.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("893f7631d9f20ab8a66513fad134896ba742af22fd769461cf30b85d42e82985")
      override
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty.Builder.() -> Unit):
          Unit =
          dynamicPartitioningConfiguration(DynamicPartitioningConfigurationProperty(dynamicPartitioningConfiguration))

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
       * delivery stream.
       * The default value is `NoEncryption` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5d173a1b0584d4adbb2d31b81347141312686f87cb6155670e61726e2bbb2c")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
       * records before writing them to S3.
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       */
      override fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
      }

      /**
       * @param fileExtension Specify a file extension.
       * It will override the default file extension
       */
      override fun fileExtension(fileExtension: String) {
        cdkBuilder.fileExtension(fileExtension)
      }

      /**
       * @param prefix The `YYYY/MM/DD/HH` time format prefix is automatically used for delivered
       * Amazon S3 files.
       * For more information, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a710cd8228354ceb6f3cae2c0decf839f8c2b86f00e8ec1ddb508272af2f7fb2")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the AWS credentials. 
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      override fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c024b93d3ac730d3df10eb56e1d65de2e17df9c07c47791f82caff1a2658e2")
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3BackupConfiguration(S3DestinationConfigurationProperty(s3BackupConfiguration))

      /**
       * @param s3BackupMode The Amazon S3 backup mode.
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), ExtendedS3DestinationConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
       *
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The buffering option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * The Amazon CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The compression format.
       *
       * If no value is specified, the default is `UNCOMPRESSED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
       */
      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      /**
       * The time zone you prefer.
       *
       * UTC is the default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-customtimezone)
       */
      override fun customTimeZone(): String? = unwrap(this).getCustomTimeZone()

      /**
       * The serializer, deserializer, and schema for converting data from the JSON format to the
       * Parquet or ORC format before writing it to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-dataformatconversionconfiguration)
       */
      override fun dataFormatConversionConfiguration(): Any? =
          unwrap(this).getDataFormatConversionConfiguration()

      /**
       * The configuration of the dynamic partitioning mechanism that creates targeted data sets
       * from the streaming data by partitioning it based on partition keys.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-dynamicpartitioningconfiguration)
       */
      override fun dynamicPartitioningConfiguration(): Any? =
          unwrap(this).getDynamicPartitioningConfiguration()

      /**
       * The encryption configuration for the Kinesis Data Firehose delivery stream.
       *
       * The default value is `NoEncryption` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      /**
       * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing
       * them to S3.
       *
       * This prefix appears immediately following the bucket name. For information about how to
       * specify this prefix, see [Custom Prefixes for Amazon S3
       * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix)
       */
      override fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

      /**
       * Specify a file extension.
       *
       * It will override the default file extension
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-fileextension)
       */
      override fun fileExtension(): String? = unwrap(this).getFileExtension()

      /**
       * The `YYYY/MM/DD/HH` time format prefix is automatically used for delivered Amazon S3 files.
       *
       * For more information, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The data processing configuration for the Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The Amazon Resource Name (ARN) of the AWS credentials.
       *
       * For constraints, see
       * [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
       * in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The configuration for backup in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
       */
      override fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

      /**
       * The Amazon S3 backup mode.
       *
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExtendedS3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty):
          ExtendedS3DestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExtendedS3DestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtendedS3DestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
    }
  }

  /**
   * The `ProcessorParameter` property specifies a processor parameter in a data processor for an
   * Amazon Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ProcessorParameterProperty processorParameterProperty = ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html)
   */
  public interface ProcessorParameterProperty {
    /**
     * The name of the parameter.
     *
     * Currently the following default values are supported: 3 for `NumberOfRetries` and 60 for the
     * `BufferIntervalInSeconds` . The `BufferSizeInMBs` ranges between 0.2 MB and up to 3MB. The
     * default buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default
     * buffering hint is 256 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
     */
    public fun parameterName(): String

    /**
     * The parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ProcessorParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName The name of the parameter. 
       * Currently the following default values are supported: 3 for `NumberOfRetries` and 60 for
       * the `BufferIntervalInSeconds` . The `BufferSizeInMBs` ranges between 0.2 MB and up to 3MB. The
       * default buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default
       * buffering hint is 256 KB.
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The parameter value. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.builder()

      /**
       * @param parameterName The name of the parameter. 
       * Currently the following default values are supported: 3 for `NumberOfRetries` and 60 for
       * the `BufferIntervalInSeconds` . The `BufferSizeInMBs` ranges between 0.2 MB and up to 3MB. The
       * default buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default
       * buffering hint is 256 KB.
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The parameter value. 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty,
    ) : CdkObject(cdkObject), ProcessorParameterProperty {
      /**
       * The name of the parameter.
       *
       * Currently the following default values are supported: 3 for `NumberOfRetries` and 60 for
       * the `BufferIntervalInSeconds` . The `BufferSizeInMBs` ranges between 0.2 MB and up to 3MB. The
       * default buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default
       * buffering hint is 256 KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * The parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty):
          ProcessorParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProcessorParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorParameterProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty
    }
  }

  /**
   * The `CopyCommand` property type configures the Amazon Redshift `COPY` command that Amazon
   * Kinesis Data Firehose (Kinesis Data Firehose) uses to load data into an Amazon Redshift cluster
   * from an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * CopyCommandProperty copyCommandProperty = CopyCommandProperty.builder()
   * .dataTableName("dataTableName")
   * // the properties below are optional
   * .copyOptions("copyOptions")
   * .dataTableColumns("dataTableColumns")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html)
   */
  public interface CopyCommandProperty {
    /**
     * Parameters to use with the Amazon Redshift `COPY` command.
     *
     * For examples, see the `CopyOptions` content for the
     * [CopyCommand](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
     */
    public fun copyOptions(): String? = unwrap(this).getCopyOptions()

    /**
     * A comma-separated list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
     */
    public fun dataTableColumns(): String? = unwrap(this).getDataTableColumns()

    /**
     * The name of the target table.
     *
     * The table must already exist in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
     */
    public fun dataTableName(): String

    /**
     * A builder for [CopyCommandProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyOptions Parameters to use with the Amazon Redshift `COPY` command.
       * For examples, see the `CopyOptions` content for the
       * [CopyCommand](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun copyOptions(copyOptions: String)

      /**
       * @param dataTableColumns A comma-separated list of column names.
       */
      public fun dataTableColumns(dataTableColumns: String)

      /**
       * @param dataTableName The name of the target table. 
       * The table must already exist in the database.
       */
      public fun dataTableName(dataTableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.builder()

      /**
       * @param copyOptions Parameters to use with the Amazon Redshift `COPY` command.
       * For examples, see the `CopyOptions` content for the
       * [CopyCommand](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun copyOptions(copyOptions: String) {
        cdkBuilder.copyOptions(copyOptions)
      }

      /**
       * @param dataTableColumns A comma-separated list of column names.
       */
      override fun dataTableColumns(dataTableColumns: String) {
        cdkBuilder.dataTableColumns(dataTableColumns)
      }

      /**
       * @param dataTableName The name of the target table. 
       * The table must already exist in the database.
       */
      override fun dataTableName(dataTableName: String) {
        cdkBuilder.dataTableName(dataTableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty,
    ) : CdkObject(cdkObject), CopyCommandProperty {
      /**
       * Parameters to use with the Amazon Redshift `COPY` command.
       *
       * For examples, see the `CopyOptions` content for the
       * [CopyCommand](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
       */
      override fun copyOptions(): String? = unwrap(this).getCopyOptions()

      /**
       * A comma-separated list of column names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
       */
      override fun dataTableColumns(): String? = unwrap(this).getDataTableColumns()

      /**
       * The name of the target table.
       *
       * The table must already exist in the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
       */
      override fun dataTableName(): String = unwrap(this).getDataTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyCommandProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty):
          CopyCommandProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyCommandProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyCommandProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty
    }
  }

  /**
   * The `EncryptionConfiguration` property type specifies the encryption settings that Amazon
   * Kinesis Data Firehose (Kinesis Data Firehose) uses when delivering data to Amazon Simple Storage
   * Service (Amazon S3).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The AWS Key Management Service ( AWS KMS) encryption key that Amazon S3 uses to encrypt your
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
     */
    public fun kmsEncryptionConfig(): Any? = unwrap(this).getKmsEncryptionConfig()

    /**
     * Disables encryption.
     *
     * For valid values, see the `NoEncryptionConfig` content for the
     * [EncryptionConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_EncryptionConfiguration.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
     */
    public fun noEncryptionConfig(): String? = unwrap(this).getNoEncryptionConfig()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable)

      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      public fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty)

      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7557a7e60b43e91e5493722a7945cc9887eae4f02f8cf3a0845a00addc3549b4")
      public
          fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty.Builder.() -> Unit)

      /**
       * @param noEncryptionConfig Disables encryption.
       * For valid values, see the `NoEncryptionConfig` content for the
       * [EncryptionConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_EncryptionConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun noEncryptionConfig(noEncryptionConfig: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      override fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      override fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(KMSEncryptionConfigProperty::unwrap))
      }

      /**
       * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that
       * Amazon S3 uses to encrypt your data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7557a7e60b43e91e5493722a7945cc9887eae4f02f8cf3a0845a00addc3549b4")
      override
          fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty.Builder.() -> Unit):
          Unit = kmsEncryptionConfig(KMSEncryptionConfigProperty(kmsEncryptionConfig))

      /**
       * @param noEncryptionConfig Disables encryption.
       * For valid values, see the `NoEncryptionConfig` content for the
       * [EncryptionConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_EncryptionConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun noEncryptionConfig(noEncryptionConfig: String) {
        cdkBuilder.noEncryptionConfig(noEncryptionConfig)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The AWS Key Management Service ( AWS KMS) encryption key that Amazon S3 uses to encrypt
       * your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
       */
      override fun kmsEncryptionConfig(): Any? = unwrap(this).getKmsEncryptionConfig()

      /**
       * Disables encryption.
       *
       * For valid values, see the `NoEncryptionConfig` content for the
       * [EncryptionConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_EncryptionConfiguration.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
       */
      override fun noEncryptionConfig(): String? = unwrap(this).getNoEncryptionConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
    }
  }

  /**
   * The `SplunkRetryOptions` property type specifies retry behavior in case Kinesis Data Firehose
   * is unable to deliver documents to Splunk or if it doesn't receive an acknowledgment from Splunk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SplunkRetryOptionsProperty splunkRetryOptionsProperty = SplunkRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html)
   */
  public interface SplunkRetryOptionsProperty {
    /**
     * The total amount of time that Firehose spends on retries.
     *
     * This duration starts after the initial attempt to send data to Splunk fails. It doesn't
     * include the periods during which Firehose waits for acknowledgment from Splunk after each
     * attempt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [SplunkRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds The total amount of time that Firehose spends on retries.
       * This duration starts after the initial attempt to send data to Splunk fails. It doesn't
       * include the periods during which Firehose waits for acknowledgment from Splunk after each
       * attempt.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds The total amount of time that Firehose spends on retries.
       * This duration starts after the initial attempt to send data to Splunk fails. It doesn't
       * include the periods during which Firehose waits for acknowledgment from Splunk after each
       * attempt.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty,
    ) : CdkObject(cdkObject), SplunkRetryOptionsProperty {
      /**
       * The total amount of time that Firehose spends on retries.
       *
       * This duration starts after the initial attempt to send data to Splunk fails. It doesn't
       * include the periods during which Firehose waits for acknowledgment from Splunk after each
       * attempt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SplunkRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty):
          SplunkRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SplunkRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
    }
  }

  /**
   * The `ProcessingConfiguration` property configures data processing for an Amazon Kinesis Data
   * Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * ProcessingConfigurationProperty processingConfigurationProperty =
   * ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html)
   */
  public interface ProcessingConfigurationProperty {
    /**
     * Indicates whether data processing is enabled (true) or disabled (false).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The data processors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
     */
    public fun processors(): Any? = unwrap(this).getProcessors()

    /**
     * A builder for [ProcessingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param processors The data processors.
       */
      public fun processors(processors: IResolvable)

      /**
       * @param processors The data processors.
       */
      public fun processors(processors: List<Any>)

      /**
       * @param processors The data processors.
       */
      public fun processors(vararg processors: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.builder()

      /**
       * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param processors The data processors.
       */
      override fun processors(processors: IResolvable) {
        cdkBuilder.processors(processors.let(IResolvable::unwrap))
      }

      /**
       * @param processors The data processors.
       */
      override fun processors(processors: List<Any>) {
        cdkBuilder.processors(processors)
      }

      /**
       * @param processors The data processors.
       */
      override fun processors(vararg processors: Any): Unit = processors(processors.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty,
    ) : CdkObject(cdkObject), ProcessingConfigurationProperty {
      /**
       * Indicates whether data processing is enabled (true) or disabled (false).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The data processors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
       */
      override fun processors(): Any? = unwrap(this).getProcessors()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty):
          ProcessingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProcessingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
    }
  }

  /**
   * The `BufferingHints` property type specifies how Amazon Kinesis Data Firehose (Kinesis Data
   * Firehose) buffers incoming data before delivering it to the destination.
   *
   * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * BufferingHintsProperty bufferingHintsProperty = BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html)
   */
  public interface BufferingHintsProperty {
    /**
     * The length of time, in seconds, that Kinesis Data Firehose buffers incoming data before
     * delivering it to the destination.
     *
     * For valid values, see the `IntervalInSeconds` content for the
     * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
     */
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    /**
     * The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming data before
     * delivering it to the destination.
     *
     * For valid values, see the `SizeInMBs` content for the
     * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     * data type in the *Amazon Kinesis Data Firehose API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
     */
    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    /**
     * A builder for [BufferingHintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
       * incoming data before delivering it to the destination.
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun intervalInSeconds(intervalInSeconds: Number)

      /**
       * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for
       * incoming data before delivering it to the destination.
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.builder()

      /**
       * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
       * incoming data before delivering it to the destination.
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      /**
       * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for
       * incoming data before delivering it to the destination.
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       */
      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty,
    ) : CdkObject(cdkObject), BufferingHintsProperty {
      /**
       * The length of time, in seconds, that Kinesis Data Firehose buffers incoming data before
       * delivering it to the destination.
       *
       * For valid values, see the `IntervalInSeconds` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
       */
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      /**
       * The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming data before
       * delivering it to the destination.
       *
       * For valid values, see the `SizeInMBs` content for the
       * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
       * data type in the *Amazon Kinesis Data Firehose API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
       */
      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty):
          BufferingHintsProperty = CdkObjectWrappers.wrap(cdkObject) as? BufferingHintsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty
    }
  }

  /**
   * Specify how long Firehose retries sending data to the New Relic HTTP endpoint.
   *
   * After sending data, Firehose first waits for an acknowledgment from the HTTP endpoint. If an
   * error occurs or the acknowledgment doesn’t arrive within the acknowledgment timeout period,
   * Firehose starts the retry duration counter. It keeps retrying until the retry duration expires.
   * After that, Firehose considers it a data delivery failure and backs up the data to your Amazon S3
   * bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
   * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the
   * HTTP endpoint. Even if the retry duration expires, Firehose still waits for the acknowledgment
   * until it receives it or the acknowledgement timeout period is reached. If the acknowledgment times
   * out, Firehose determines whether there's time left in the retry counter. If there is time left, it
   * retries again and repeats the logic until it receives an acknowledgment or determines that the
   * retry time has expired. If you don't want Firehose to retry sending data, set this value to 0.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * SnowflakeRetryOptionsProperty snowflakeRetryOptionsProperty =
   * SnowflakeRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeretryoptions.html)
   */
  public interface SnowflakeRetryOptionsProperty {
    /**
     * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeretryoptions.html#cfn-kinesisfirehose-deliverystream-snowflakeretryoptions-durationinseconds)
     */
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    /**
     * A builder for [SnowflakeRetryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds the time period where Firehose will retry sending data to the
       * chosen HTTP endpoint.
       */
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty.builder()

      /**
       * @param durationInSeconds the time period where Firehose will retry sending data to the
       * chosen HTTP endpoint.
       */
      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty,
    ) : CdkObject(cdkObject), SnowflakeRetryOptionsProperty {
      /**
       * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeretryoptions.html#cfn-kinesisfirehose-deliverystream-snowflakeretryoptions-durationinseconds)
       */
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnowflakeRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty):
          SnowflakeRetryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnowflakeRetryOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty
    }
  }

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * DeliveryStreamEncryptionConfigurationInputProperty
   * deliveryStreamEncryptionConfigurationInputProperty =
   * DeliveryStreamEncryptionConfigurationInputProperty.builder()
   * .keyType("keyType")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html)
   */
  public interface DeliveryStreamEncryptionConfigurationInputProperty {
    /**
     * If you set `KeyType` to `CUSTOMER_MANAGED_CMK` , you must specify the Amazon Resource Name
     * (ARN) of the CMK.
     *
     * If you set `KeyType` to `AWS _OWNED_CMK` , Firehose uses a service-account CMK.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * Indicates the type of customer master key (CMK) to use for encryption.
     *
     * The default setting is `AWS_OWNED_CMK` . For more information about CMKs, see [Customer
     * Master Keys
     * (CMKs)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys) .
     *
     * You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams.
     *
     *
     * To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support
     * asymmetric CMKs. For information about symmetric and asymmetric CMKs, see [About Symmetric and
     * Asymmetric CMKs](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html)
     * in the AWS Key Management Service developer guide.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [DeliveryStreamEncryptionConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn If you set `KeyType` to `CUSTOMER_MANAGED_CMK` , you must specify the Amazon
       * Resource Name (ARN) of the CMK.
       * If you set `KeyType` to `AWS _OWNED_CMK` , Firehose uses a service-account CMK.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param keyType Indicates the type of customer master key (CMK) to use for encryption. 
       * The default setting is `AWS_OWNED_CMK` . For more information about CMKs, see [Customer
       * Master Keys
       * (CMKs)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys) .
       *
       * You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams.
       *
       *
       * To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support
       * asymmetric CMKs. For information about symmetric and asymmetric CMKs, see [About Symmetric and
       * Asymmetric
       * CMKs](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html) in the
       * AWS Key Management Service developer guide.
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.builder()

      /**
       * @param keyArn If you set `KeyType` to `CUSTOMER_MANAGED_CMK` , you must specify the Amazon
       * Resource Name (ARN) of the CMK.
       * If you set `KeyType` to `AWS _OWNED_CMK` , Firehose uses a service-account CMK.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param keyType Indicates the type of customer master key (CMK) to use for encryption. 
       * The default setting is `AWS_OWNED_CMK` . For more information about CMKs, see [Customer
       * Master Keys
       * (CMKs)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys) .
       *
       * You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams.
       *
       *
       * To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support
       * asymmetric CMKs. For information about symmetric and asymmetric CMKs, see [About Symmetric and
       * Asymmetric
       * CMKs](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html) in the
       * AWS Key Management Service developer guide.
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty,
    ) : CdkObject(cdkObject), DeliveryStreamEncryptionConfigurationInputProperty {
      /**
       * If you set `KeyType` to `CUSTOMER_MANAGED_CMK` , you must specify the Amazon Resource Name
       * (ARN) of the CMK.
       *
       * If you set `KeyType` to `AWS _OWNED_CMK` , Firehose uses a service-account CMK.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * Indicates the type of customer master key (CMK) to use for encryption.
       *
       * The default setting is `AWS_OWNED_CMK` . For more information about CMKs, see [Customer
       * Master Keys
       * (CMKs)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys) .
       *
       * You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams.
       *
       *
       * To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support
       * asymmetric CMKs. For information about symmetric and asymmetric CMKs, see [About Symmetric and
       * Asymmetric
       * CMKs](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html) in the
       * AWS Key Management Service developer guide.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput-keytype)
       */
      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeliveryStreamEncryptionConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty):
          DeliveryStreamEncryptionConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeliveryStreamEncryptionConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryStreamEncryptionConfigurationInputProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
    }
  }

  /**
   * The `RedshiftDestinationConfiguration` property type specifies an Amazon Redshift cluster to
   * which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * RedshiftDestinationConfigurationProperty redshiftDestinationConfigurationProperty =
   * RedshiftDestinationConfigurationProperty.builder()
   * .clusterJdbcurl("clusterJdbcurl")
   * .copyCommand(CopyCommandProperty.builder()
   * .dataTableName("dataTableName")
   * // the properties below are optional
   * .copyOptions("copyOptions")
   * .dataTableColumns("dataTableColumns")
   * .build())
   * .password("password")
   * .roleArn("roleArn")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * .username("username")
   * // the properties below are optional
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(RedshiftRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html)
   */
  public interface RedshiftDestinationConfigurationProperty {
    /**
     * The CloudWatch logging options for your delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The connection string that Kinesis Data Firehose uses to connect to the Amazon Redshift
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
     */
    public fun clusterJdbcurl(): String

    /**
     * Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose uses to load data
     * into the cluster from the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
     */
    public fun copyCommand(): Any

    /**
     * The password for the Amazon Redshift user that you specified in the `Username` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
     */
    public fun password(): String

    /**
     * The data processing configuration for the Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The retry behavior in case Firehose is unable to deliver documents to Amazon Redshift.
     *
     * Default value is 3600 (60 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that grants Kinesis Data
     * Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data encryption).
     *
     * For more information, see [Grant Kinesis Data Firehose Access to an Amazon Redshift
     * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-rs)
     * in the *Amazon Kinesis Data Firehose Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The configuration for backup in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupconfiguration)
     */
    public fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

    /**
     * The Amazon S3 backup mode.
     *
     * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
     * disabled. If backup is enabled, you can't update the delivery stream to disable it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * The S3 bucket where Kinesis Data Firehose first delivers data.
     *
     * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
     * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
     * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * The Amazon Redshift user that has permission to access the Amazon Redshift cluster.
     *
     * This user must have `INSERT` privileges for copying data from the Amazon S3 bucket to the
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
     */
    public fun username(): String

    /**
     * A builder for [RedshiftDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45ef4423662114d977ecc3114c7802625a877da0c62692f1467c0d79e3a2ddac")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param clusterJdbcurl The connection string that Kinesis Data Firehose uses to connect to
       * the Amazon Redshift cluster. 
       */
      public fun clusterJdbcurl(clusterJdbcurl: String)

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      public fun copyCommand(copyCommand: IResolvable)

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      public fun copyCommand(copyCommand: CopyCommandProperty)

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d2ef5f2291d07a9512a3ff24555b5f91c228a87a4ae9a1b79a43f5f4485d2a3")
      public fun copyCommand(copyCommand: CopyCommandProperty.Builder.() -> Unit)

      /**
       * @param password The password for the Amazon Redshift user that you specified in the
       * `Username` property. 
       */
      public fun password(password: String)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c2f921f49d7736ae64ab395b6ef401195e0ac58e53ca5e9a1d20c29ec9c679")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      public fun retryOptions(retryOptions: RedshiftRetryOptionsProperty)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77b9a2c545114228f3d9ae0d91705b4701ea2de7e29d7d742a34ca79f340ab0")
      public fun retryOptions(retryOptions: RedshiftRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that grants
       * Kinesis Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data
       * encryption). 
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon Redshift
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-rs)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      public fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty)

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76f495a1f6c03576e673bcb8e356998d035f673113fceb47e468570787f93feb")
      public
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3BackupMode The Amazon S3 backup mode.
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180c65a4b7e2398bf76a2db60147c8ea87bb6d69a8be2d7c4a62846c15d24e55")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param username The Amazon Redshift user that has permission to access the Amazon Redshift
       * cluster. 
       * This user must have `INSERT` privileges for copying data from the Amazon S3 bucket to the
       * cluster.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.builder()

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45ef4423662114d977ecc3114c7802625a877da0c62692f1467c0d79e3a2ddac")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param clusterJdbcurl The connection string that Kinesis Data Firehose uses to connect to
       * the Amazon Redshift cluster. 
       */
      override fun clusterJdbcurl(clusterJdbcurl: String) {
        cdkBuilder.clusterJdbcurl(clusterJdbcurl)
      }

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      override fun copyCommand(copyCommand: IResolvable) {
        cdkBuilder.copyCommand(copyCommand.let(IResolvable::unwrap))
      }

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      override fun copyCommand(copyCommand: CopyCommandProperty) {
        cdkBuilder.copyCommand(copyCommand.let(CopyCommandProperty::unwrap))
      }

      /**
       * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
       * uses to load data into the cluster from the Amazon S3 bucket. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d2ef5f2291d07a9512a3ff24555b5f91c228a87a4ae9a1b79a43f5f4485d2a3")
      override fun copyCommand(copyCommand: CopyCommandProperty.Builder.() -> Unit): Unit =
          copyCommand(CopyCommandProperty(copyCommand))

      /**
       * @param password The password for the Amazon Redshift user that you specified in the
       * `Username` property. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration The data processing configuration for the Kinesis Data
       * Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c2f921f49d7736ae64ab395b6ef401195e0ac58e53ca5e9a1d20c29ec9c679")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      override fun retryOptions(retryOptions: RedshiftRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RedshiftRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * Amazon Redshift.
       * Default value is 3600 (60 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77b9a2c545114228f3d9ae0d91705b4701ea2de7e29d7d742a34ca79f340ab0")
      override fun retryOptions(retryOptions: RedshiftRetryOptionsProperty.Builder.() -> Unit): Unit
          = retryOptions(RedshiftRetryOptionsProperty(retryOptions))

      /**
       * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that grants
       * Kinesis Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data
       * encryption). 
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon Redshift
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-rs)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      override fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3BackupConfiguration The configuration for backup in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76f495a1f6c03576e673bcb8e356998d035f673113fceb47e468570787f93feb")
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3BackupConfiguration(S3DestinationConfigurationProperty(s3BackupConfiguration))

      /**
       * @param s3BackupMode The Amazon S3 backup mode.
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. 
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180c65a4b7e2398bf76a2db60147c8ea87bb6d69a8be2d7c4a62846c15d24e55")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      /**
       * @param username The Amazon Redshift user that has permission to access the Amazon Redshift
       * cluster. 
       * This user must have `INSERT` privileges for copying data from the Amazon S3 bucket to the
       * cluster.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), RedshiftDestinationConfigurationProperty {
      /**
       * The CloudWatch logging options for your delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The connection string that Kinesis Data Firehose uses to connect to the Amazon Redshift
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
       */
      override fun clusterJdbcurl(): String = unwrap(this).getClusterJdbcurl()

      /**
       * Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose uses to load data
       * into the cluster from the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
       */
      override fun copyCommand(): Any = unwrap(this).getCopyCommand()

      /**
       * The password for the Amazon Redshift user that you specified in the `Username` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The data processing configuration for the Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The retry behavior in case Firehose is unable to deliver documents to Amazon Redshift.
       *
       * Default value is 3600 (60 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * The ARN of the AWS Identity and Access Management (IAM) role that grants Kinesis Data
       * Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data encryption).
       *
       * For more information, see [Grant Kinesis Data Firehose Access to an Amazon Redshift
       * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-rs)
       * in the *Amazon Kinesis Data Firehose Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The configuration for backup in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupconfiguration)
       */
      override fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

      /**
       * The Amazon S3 backup mode.
       *
       * After you create a delivery stream, you can update it to enable Amazon S3 backup if it is
       * disabled. If backup is enabled, you can't update the delivery stream to disable it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * The S3 bucket where Kinesis Data Firehose first delivers data.
       *
       * After the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the
       * data into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
       * specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * The Amazon Redshift user that has permission to access the Amazon Redshift cluster.
       *
       * This user must have `INSERT` privileges for copying data from the Amazon S3 bucket to the
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty):
          RedshiftDestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
    }
  }

  /**
   * The `DynamicPartitioningConfiguration` property type specifies the configuration of the dynamic
   * partitioning mechanism that creates targeted data sets from the streaming data by partitioning it
   * based on partition keys.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * DynamicPartitioningConfigurationProperty dynamicPartitioningConfigurationProperty =
   * DynamicPartitioningConfigurationProperty.builder()
   * .enabled(false)
   * .retryOptions(RetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html)
   */
  public interface DynamicPartitioningConfigurationProperty {
    /**
     * Specifies whether dynamic partitioning is enabled for this Kinesis Data Firehose delivery
     * stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html#cfn-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specifies the retry behavior in case Kinesis Data Firehose is unable to deliver data to an
     * Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html#cfn-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * A builder for [DynamicPartitioningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
       * Firehose delivery stream.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
       * Firehose delivery stream.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      public fun retryOptions(retryOptions: RetryOptionsProperty)

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3695b89866f4eda2f073df2c3303fefb131630b8d3779f0b3e202e4fb0c6e")
      public fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder()

      /**
       * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
       * Firehose delivery stream.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
       * Firehose delivery stream.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      override fun retryOptions(retryOptions: RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
       * deliver data to an Amazon S3 prefix.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3695b89866f4eda2f073df2c3303fefb131630b8d3779f0b3e202e4fb0c6e")
      override fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(RetryOptionsProperty(retryOptions))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty,
    ) : CdkObject(cdkObject), DynamicPartitioningConfigurationProperty {
      /**
       * Specifies whether dynamic partitioning is enabled for this Kinesis Data Firehose delivery
       * stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html#cfn-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Specifies the retry behavior in case Kinesis Data Firehose is unable to deliver data to an
       * Amazon S3 prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html#cfn-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynamicPartitioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty):
          DynamicPartitioningConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DynamicPartitioningConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicPartitioningConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty
    }
  }

  /**
   * The `KMSEncryptionConfig` property type specifies the AWS Key Management Service ( AWS KMS)
   * encryption key that Amazon Simple Storage Service (Amazon S3) uses to encrypt data delivered by
   * the Amazon Kinesis Data Firehose (Kinesis Data Firehose) stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * KMSEncryptionConfigProperty kMSEncryptionConfigProperty = KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html)
   */
  public interface KMSEncryptionConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS encryption key that Amazon S3 uses to encrypt
     * data delivered by the Kinesis Data Firehose stream.
     *
     * The key must belong to the same region as the destination S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
     */
    public fun awskmsKeyArn(): String

    /**
     * A builder for [KMSEncryptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awskmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS encryption key that
       * Amazon S3 uses to encrypt data delivered by the Kinesis Data Firehose stream. 
       * The key must belong to the same region as the destination S3 bucket.
       */
      public fun awskmsKeyArn(awskmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.builder()

      /**
       * @param awskmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS encryption key that
       * Amazon S3 uses to encrypt data delivered by the Kinesis Data Firehose stream. 
       * The key must belong to the same region as the destination S3 bucket.
       */
      override fun awskmsKeyArn(awskmsKeyArn: String) {
        cdkBuilder.awskmsKeyArn(awskmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty,
    ) : CdkObject(cdkObject), KMSEncryptionConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS KMS encryption key that Amazon S3 uses to encrypt
       * data delivered by the Kinesis Data Firehose stream.
       *
       * The key must belong to the same region as the destination S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
       */
      override fun awskmsKeyArn(): String = unwrap(this).getAwskmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KMSEncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty):
          KMSEncryptionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KMSEncryptionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KMSEncryptionConfigProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
    }
  }

  /**
   * Specifies the serializer that you want Firehose to use to convert the format of your data
   * before it writes it to Amazon S3.
   *
   * This parameter is required if `Enabled` is set to true.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * OutputFormatConfigurationProperty outputFormatConfigurationProperty =
   * OutputFormatConfigurationProperty.builder()
   * .serializer(SerializerProperty.builder()
   * .orcSerDe(OrcSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .bloomFilterColumns(List.of("bloomFilterColumns"))
   * .bloomFilterFalsePositiveProbability(123)
   * .compression("compression")
   * .dictionaryKeyThreshold(123)
   * .enablePadding(false)
   * .formatVersion("formatVersion")
   * .paddingTolerance(123)
   * .rowIndexStride(123)
   * .stripeSizeBytes(123)
   * .build())
   * .parquetSerDe(ParquetSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .compression("compression")
   * .enableDictionaryCompression(false)
   * .maxPaddingBytes(123)
   * .pageSizeBytes(123)
   * .writerVersion("writerVersion")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html)
   */
  public interface OutputFormatConfigurationProperty {
    /**
     * Specifies which serializer to use.
     *
     * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
     * rejects the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html#cfn-kinesisfirehose-deliverystream-outputformatconfiguration-serializer)
     */
    public fun serializer(): Any? = unwrap(this).getSerializer()

    /**
     * A builder for [OutputFormatConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      public fun serializer(serializer: IResolvable)

      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      public fun serializer(serializer: SerializerProperty)

      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ef4373c5cefbf7b5d68af38d5da0d60c3f2bb67b3fd7c9f10a0c0f75fdef9e")
      public fun serializer(serializer: SerializerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty.builder()

      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      override fun serializer(serializer: IResolvable) {
        cdkBuilder.serializer(serializer.let(IResolvable::unwrap))
      }

      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      override fun serializer(serializer: SerializerProperty) {
        cdkBuilder.serializer(serializer.let(SerializerProperty::unwrap))
      }

      /**
       * @param serializer Specifies which serializer to use.
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ef4373c5cefbf7b5d68af38d5da0d60c3f2bb67b3fd7c9f10a0c0f75fdef9e")
      override fun serializer(serializer: SerializerProperty.Builder.() -> Unit): Unit =
          serializer(SerializerProperty(serializer))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty,
    ) : CdkObject(cdkObject), OutputFormatConfigurationProperty {
      /**
       * Specifies which serializer to use.
       *
       * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
       * rejects the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html#cfn-kinesisfirehose-deliverystream-outputformatconfiguration-serializer)
       */
      override fun serializer(): Any? = unwrap(this).getSerializer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OutputFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty):
          OutputFormatConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OutputFormatConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFormatConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty
    }
  }

  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * AmazonOpenSearchServerlessDestinationConfigurationProperty
   * amazonOpenSearchServerlessDestinationConfigurationProperty =
   * AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()
   * .indexName("indexName")
   * .roleArn("roleArn")
   * .s3Configuration(S3DestinationConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .bufferingHints(BufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .compressionFormat("compressionFormat")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
   * .awskmsKeyArn("awskmsKeyArn")
   * .build())
   * .noEncryptionConfig("noEncryptionConfig")
   * .build())
   * .errorOutputPrefix("errorOutputPrefix")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .bufferingHints(AmazonOpenSearchServerlessBufferingHintsProperty.builder()
   * .intervalInSeconds(123)
   * .sizeInMBs(123)
   * .build())
   * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
   * .enabled(false)
   * .logGroupName("logGroupName")
   * .logStreamName("logStreamName")
   * .build())
   * .collectionEndpoint("collectionEndpoint")
   * .processingConfiguration(ProcessingConfigurationProperty.builder()
   * .enabled(false)
   * .processors(List.of(ProcessorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(List.of(ProcessorParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .build())
   * .retryOptions(AmazonOpenSearchServerlessRetryOptionsProperty.builder()
   * .durationInSeconds(123)
   * .build())
   * .s3BackupMode("s3BackupMode")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html)
   */
  public interface AmazonOpenSearchServerlessDestinationConfigurationProperty {
    /**
     * The buffering options.
     *
     * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-bufferinghints)
     */
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-cloudwatchloggingoptions)
     */
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    /**
     * The endpoint to use when communicating with the collection in the Serverless offering for
     * Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-collectionendpoint)
     */
    public fun collectionEndpoint(): String? = unwrap(this).getCollectionEndpoint()

    /**
     * The Serverless offering for Amazon OpenSearch Service index name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-indexname)
     */
    public fun indexName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-processingconfiguration)
     */
    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    /**
     * The retry behavior in case Firehose is unable to deliver documents to the Serverless offering
     * for Amazon OpenSearch Service.
     *
     * The default value is 300 (5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-retryoptions)
     */
    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the
     * Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * Defines how documents should be delivered to Amazon S3.
     *
     * When it is set to FailedDocumentsOnly, Firehose writes any documents that could not be
     * indexed to the configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended
     * to the key prefix. When set to AllDocuments, Firehose delivers all incoming records to Amazon
     * S3, and also writes failed documents with AmazonOpenSearchService-failed/ appended to the
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-s3backupmode)
     */
    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [AmazonOpenSearchServerlessDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      public fun bufferingHints(bufferingHints: IResolvable)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      public fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty)

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d856ab156b753ed34b97d707610833958654efb99b63689d310e18ca5cc6583")
      public
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c1f70b9d28fa71684e73fc02e4379e2f8d35cf0d80bc3aebfd45885bc13a0a")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      /**
       * @param collectionEndpoint The endpoint to use when communicating with the collection in the
       * Serverless offering for Amazon OpenSearch Service.
       */
      public fun collectionEndpoint(collectionEndpoint: String)

      /**
       * @param indexName The Serverless offering for Amazon OpenSearch Service index name. 
       */
      public fun indexName(indexName: String)

      /**
       * @param processingConfiguration the value to be set.
       */
      public fun processingConfiguration(processingConfiguration: IResolvable)

      /**
       * @param processingConfiguration the value to be set.
       */
      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      /**
       * @param processingConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b53401fcfe636bcf5972a097267d944d66bb96777d24d33b9b0fed827b4a222")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      public fun retryOptions(retryOptions: IResolvable)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      public fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty)

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24baa8be39905e54321fc8fe03cede3cf6b3711a56985984f0822b7c0919c876")
      public
          fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for
       * calling the Serverless offering for Amazon OpenSearch Service Configuration API and for
       * indexing documents. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       * When it is set to FailedDocumentsOnly, Firehose writes any documents that could not be
       * indexed to the configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended
       * to the key prefix. When set to AllDocuments, Firehose delivers all incoming records to Amazon
       * S3, and also writes failed documents with AmazonOpenSearchService-failed/ appended to the
       * prefix.
       */
      public fun s3BackupMode(s3BackupMode: String)

      /**
       * @param s3Configuration the value to be set. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration the value to be set. 
       */
      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      /**
       * @param s3Configuration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347f6c226c18b5f3ec5857d7d02259e43bca74bdb689e2865aee76411fc20f45")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param vpcConfiguration the value to be set.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration the value to be set.
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca89cda108d01b6b82ba5abf1a018f9b6d7b1a6b6ea409e8c8f0af1c4b528b01")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      override
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(AmazonOpenSearchServerlessBufferingHintsProperty::unwrap))
      }

      /**
       * @param bufferingHints The buffering options.
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d856ab156b753ed34b97d707610833958654efb99b63689d310e18ca5cc6583")
      override
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(AmazonOpenSearchServerlessBufferingHintsProperty(bufferingHints))

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c1f70b9d28fa71684e73fc02e4379e2f8d35cf0d80bc3aebfd45885bc13a0a")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      /**
       * @param collectionEndpoint The endpoint to use when communicating with the collection in the
       * Serverless offering for Amazon OpenSearch Service.
       */
      override fun collectionEndpoint(collectionEndpoint: String) {
        cdkBuilder.collectionEndpoint(collectionEndpoint)
      }

      /**
       * @param indexName The Serverless offering for Amazon OpenSearch Service index name. 
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param processingConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b53401fcfe636bcf5972a097267d944d66bb96777d24d33b9b0fed827b4a222")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      override fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(AmazonOpenSearchServerlessRetryOptionsProperty::unwrap))
      }

      /**
       * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
       * the Serverless offering for Amazon OpenSearch Service.
       * The default value is 300 (5 minutes).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24baa8be39905e54321fc8fe03cede3cf6b3711a56985984f0822b7c0919c876")
      override
          fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(AmazonOpenSearchServerlessRetryOptionsProperty(retryOptions))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for
       * calling the Serverless offering for Amazon OpenSearch Service Configuration API and for
       * indexing documents. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BackupMode Defines how documents should be delivered to Amazon S3.
       * When it is set to FailedDocumentsOnly, Firehose writes any documents that could not be
       * indexed to the configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended
       * to the key prefix. When set to AllDocuments, Firehose delivers all incoming records to Amazon
       * S3, and also writes failed documents with AmazonOpenSearchService-failed/ appended to the
       * prefix.
       */
      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347f6c226c18b5f3ec5857d7d02259e43bca74bdb689e2865aee76411fc20f45")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      /**
       * @param vpcConfiguration the value to be set.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration the value to be set.
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca89cda108d01b6b82ba5abf1a018f9b6d7b1a6b6ea409e8c8f0af1c4b528b01")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), AmazonOpenSearchServerlessDestinationConfigurationProperty {
      /**
       * The buffering options.
       *
       * If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-bufferinghints)
       */
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-cloudwatchloggingoptions)
       */
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      /**
       * The endpoint to use when communicating with the collection in the Serverless offering for
       * Amazon OpenSearch Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-collectionendpoint)
       */
      override fun collectionEndpoint(): String? = unwrap(this).getCollectionEndpoint()

      /**
       * The Serverless offering for Amazon OpenSearch Service index name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-processingconfiguration)
       */
      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      /**
       * The retry behavior in case Firehose is unable to deliver documents to the Serverless
       * offering for Amazon OpenSearch Service.
       *
       * The default value is 300 (5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-retryoptions)
       */
      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      /**
       * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the
       * Serverless offering for Amazon OpenSearch Service Configuration API and for indexing
       * documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Defines how documents should be delivered to Amazon S3.
       *
       * When it is set to FailedDocumentsOnly, Firehose writes any documents that could not be
       * indexed to the configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended
       * to the key prefix. When set to AllDocuments, Firehose delivers all incoming records to Amazon
       * S3, and also writes failed documents with AmazonOpenSearchService-failed/ appended to the
       * prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-s3backupmode)
       */
      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty):
          AmazonOpenSearchServerlessDestinationConfigurationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          AmazonOpenSearchServerlessDestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
    }
  }

  /**
   * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the
   * Parquet or ORC format before writing it to Amazon S3.
   *
   * Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the
   * column information from the AWS Glue table, to deserialize your input data from JSON and then
   * serialize it to the Parquet or ORC format. For more information, see [Kinesis Data Firehose Record
   * Format Conversion](https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
   * DataFormatConversionConfigurationProperty dataFormatConversionConfigurationProperty =
   * DataFormatConversionConfigurationProperty.builder()
   * .enabled(false)
   * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
   * .deserializer(DeserializerProperty.builder()
   * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
   * .timestampFormats(List.of("timestampFormats"))
   * .build())
   * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
   * .caseInsensitive(false)
   * .columnToJsonKeyMappings(Map.of(
   * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
   * .convertDotsInJsonKeysToUnderscores(false)
   * .build())
   * .build())
   * .build())
   * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
   * .serializer(SerializerProperty.builder()
   * .orcSerDe(OrcSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .bloomFilterColumns(List.of("bloomFilterColumns"))
   * .bloomFilterFalsePositiveProbability(123)
   * .compression("compression")
   * .dictionaryKeyThreshold(123)
   * .enablePadding(false)
   * .formatVersion("formatVersion")
   * .paddingTolerance(123)
   * .rowIndexStride(123)
   * .stripeSizeBytes(123)
   * .build())
   * .parquetSerDe(ParquetSerDeProperty.builder()
   * .blockSizeBytes(123)
   * .compression("compression")
   * .enableDictionaryCompression(false)
   * .maxPaddingBytes(123)
   * .pageSizeBytes(123)
   * .writerVersion("writerVersion")
   * .build())
   * .build())
   * .build())
   * .schemaConfiguration(SchemaConfigurationProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .region("region")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * .versionId("versionId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html)
   */
  public interface DataFormatConversionConfigurationProperty {
    /**
     * Defaults to `true` .
     *
     * Set it to `false` if you want to disable format conversion while preserving the configuration
     * details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specifies the deserializer that you want Firehose to use to convert the format of your data
     * from JSON.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-inputformatconfiguration)
     */
    public fun inputFormatConfiguration(): Any? = unwrap(this).getInputFormatConfiguration()

    /**
     * Specifies the serializer that you want Firehose to use to convert the format of your data to
     * the Parquet or ORC format.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-outputformatconfiguration)
     */
    public fun outputFormatConfiguration(): Any? = unwrap(this).getOutputFormatConfiguration()

    /**
     * Specifies the AWS Glue Data Catalog table that contains the column information.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-schemaconfiguration)
     */
    public fun schemaConfiguration(): Any? = unwrap(this).getSchemaConfiguration()

    /**
     * A builder for [DataFormatConversionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Defaults to `true` .
       * Set it to `false` if you want to disable format conversion while preserving the
       * configuration details.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Defaults to `true` .
       * Set it to `false` if you want to disable format conversion while preserving the
       * configuration details.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      public fun inputFormatConfiguration(inputFormatConfiguration: IResolvable)

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      public
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty)

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc2b0ec3231b0412fd064bcb2115b381da4a8ed0566f7661555da38c36ee7bdb")
      public
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty.Builder.() -> Unit)

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      public fun outputFormatConfiguration(outputFormatConfiguration: IResolvable)

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      public
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty)

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ef4d026eb2d120e4a2efe591bb453b2bb5a3bfc49c0a4fd805eea0f00d12af5")
      public
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty.Builder.() -> Unit)

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      public fun schemaConfiguration(schemaConfiguration: IResolvable)

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      public fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty)

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9d477f488e9dd4fe6c57ca7eaafa8455b6007569ef7569de70804f8c647fdd5")
      public
          fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder()

      /**
       * @param enabled Defaults to `true` .
       * Set it to `false` if you want to disable format conversion while preserving the
       * configuration details.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Defaults to `true` .
       * Set it to `false` if you want to disable format conversion while preserving the
       * configuration details.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      override fun inputFormatConfiguration(inputFormatConfiguration: IResolvable) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      override
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration.let(InputFormatConfigurationProperty::unwrap))
      }

      /**
       * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
       * convert the format of your data from JSON.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc2b0ec3231b0412fd064bcb2115b381da4a8ed0566f7661555da38c36ee7bdb")
      override
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputFormatConfiguration(InputFormatConfigurationProperty(inputFormatConfiguration))

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      override fun outputFormatConfiguration(outputFormatConfiguration: IResolvable) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      override
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration.let(OutputFormatConfigurationProperty::unwrap))
      }

      /**
       * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
       * convert the format of your data to the Parquet or ORC format.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ef4d026eb2d120e4a2efe591bb453b2bb5a3bfc49c0a4fd805eea0f00d12af5")
      override
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty.Builder.() -> Unit):
          Unit =
          outputFormatConfiguration(OutputFormatConfigurationProperty(outputFormatConfiguration))

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      override fun schemaConfiguration(schemaConfiguration: IResolvable) {
        cdkBuilder.schemaConfiguration(schemaConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      override fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty) {
        cdkBuilder.schemaConfiguration(schemaConfiguration.let(SchemaConfigurationProperty::unwrap))
      }

      /**
       * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the
       * column information.
       * This parameter is required if `Enabled` is set to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9d477f488e9dd4fe6c57ca7eaafa8455b6007569ef7569de70804f8c647fdd5")
      override
          fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty.Builder.() -> Unit):
          Unit = schemaConfiguration(SchemaConfigurationProperty(schemaConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty,
    ) : CdkObject(cdkObject), DataFormatConversionConfigurationProperty {
      /**
       * Defaults to `true` .
       *
       * Set it to `false` if you want to disable format conversion while preserving the
       * configuration details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Specifies the deserializer that you want Firehose to use to convert the format of your data
       * from JSON.
       *
       * This parameter is required if `Enabled` is set to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-inputformatconfiguration)
       */
      override fun inputFormatConfiguration(): Any? = unwrap(this).getInputFormatConfiguration()

      /**
       * Specifies the serializer that you want Firehose to use to convert the format of your data
       * to the Parquet or ORC format.
       *
       * This parameter is required if `Enabled` is set to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-outputformatconfiguration)
       */
      override fun outputFormatConfiguration(): Any? = unwrap(this).getOutputFormatConfiguration()

      /**
       * Specifies the AWS Glue Data Catalog table that contains the column information.
       *
       * This parameter is required if `Enabled` is set to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-schemaconfiguration)
       */
      override fun schemaConfiguration(): Any? = unwrap(this).getSchemaConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataFormatConversionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty):
          DataFormatConversionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataFormatConversionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataFormatConversionConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty
    }
  }
}
