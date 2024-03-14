package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationSetEventDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the configuration set that contains the event destination.
   */
  public open fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

  /**
   * The name of the configuration set that contains the event destination.
   */
  public open fun configurationSetName(`value`: String) {
    unwrap(this).setConfigurationSetName(`value`)
  }

  /**
   * The event destination object.
   */
  public open fun eventDestination(): Any = unwrap(this).getEventDestination()

  /**
   * The event destination object.
   */
  public open fun eventDestination(`value`: IResolvable) {
    unwrap(this).setEventDestination(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event destination object.
   */
  public open fun eventDestination(`value`: EventDestinationProperty) {
    unwrap(this).setEventDestination(`value`.let(EventDestinationProperty::unwrap))
  }

  /**
   * The event destination object.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("161eb83cbe5a17d079b5c9c3a492fa1c5cf750bd79c194bbc0ceaa3fc021e04d")
  public open fun eventDestination(`value`: EventDestinationProperty.Builder.() -> Unit): Unit =
      eventDestination(EventDestinationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ses.CfnConfigurationSetEventDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the configuration set that contains the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
     * @param configurationSetName The name of the configuration set that contains the event
     * destination. 
     */
    public fun configurationSetName(configurationSetName: String)

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    public fun eventDestination(eventDestination: IResolvable)

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    public fun eventDestination(eventDestination: EventDestinationProperty)

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f4d87013c9c0fe207561ee83bdde5e8d51ca236fe5b45cb88067774bcccb78")
    public fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder.create(scope,
        id)

    /**
     * The name of the configuration set that contains the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
     * @param configurationSetName The name of the configuration set that contains the event
     * destination. 
     */
    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    override fun eventDestination(eventDestination: EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(EventDestinationProperty::unwrap))
    }

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination The event destination object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f4d87013c9c0fe207561ee83bdde5e8d51ca236fe5b45cb88067774bcccb78")
    override fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit):
        Unit = eventDestination(EventDestinationProperty(eventDestination))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSetEventDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSetEventDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination):
        CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination = wrapped.cdkObject
  }

  public interface KinesisFirehoseDestinationProperty {
    /**
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
     */
    public fun deliveryStreamArn(): String

    /**
     * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon
     * Kinesis Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
     */
    public fun iamRoleArn(): String

    /**
     * A builder for [KinesisFirehoseDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStreamArn The ARN of the Amazon Kinesis Firehose stream that email sending
       * events should be published to. 
       */
      public fun deliveryStreamArn(deliveryStreamArn: String)

      /**
       * @param iamRoleArn The ARN of the IAM role under which Amazon SES publishes email sending
       * events to the Amazon Kinesis Firehose stream. 
       */
      public fun iamRoleArn(iamRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

      /**
       * @param deliveryStreamArn The ARN of the Amazon Kinesis Firehose stream that email sending
       * events should be published to. 
       */
      override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      /**
       * @param iamRoleArn The ARN of the IAM role under which Amazon SES publishes email sending
       * events to the Amazon Kinesis Firehose stream. 
       */
      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty,
    ) : CdkObject(cdkObject), KinesisFirehoseDestinationProperty {
      /**
       * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published
       * to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
       */
      override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

      /**
       * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon
       * Kinesis Firehose stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
       */
      override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty):
          KinesisFirehoseDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
    }
  }

  public interface DimensionConfigurationProperty {
    /**
     * The default value of the dimension that is published to Amazon CloudWatch if you do not
     * provide the value of the dimension when you send an email.
     *
     * The default value must meet the following requirements:
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), at signs
     * (&#64;), or periods (.).
     * * Contain 256 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
     */
    public fun defaultDimensionValue(): String

    /**
     * The name of an Amazon CloudWatch dimension associated with an email sending metric.
     *
     * The name must meet the following requirements:
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
     * colons (:).
     * * Contain 256 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
     */
    public fun dimensionName(): String

    /**
     * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch.
     *
     * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a parameter
     * to the `SendEmail` / `SendRawEmail` API, specify `messageTag` . To use your own email headers,
     * specify `emailHeader` . To put a custom tag on any link included in your email, specify
     * `linkTag` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
     */
    public fun dimensionValueSource(): String

    /**
     * A builder for [DimensionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultDimensionValue The default value of the dimension that is published to Amazon
       * CloudWatch if you do not provide the value of the dimension when you send an email. 
       * The default value must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), at
       * signs (&#64;), or periods (.).
       * * Contain 256 characters or fewer.
       */
      public fun defaultDimensionValue(defaultDimensionValue: String)

      /**
       * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
       * sending metric. 
       * The name must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * colons (:).
       * * Contain 256 characters or fewer.
       */
      public fun dimensionName(dimensionName: String)

      /**
       * @param dimensionValueSource The place where Amazon SES finds the value of a dimension to
       * publish to Amazon CloudWatch. 
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` / `SendRawEmail` API, specify `messageTag` . To use your own
       * email headers, specify `emailHeader` . To put a custom tag on any link included in your email,
       * specify `linkTag` .
       */
      public fun dimensionValueSource(dimensionValueSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

      /**
       * @param defaultDimensionValue The default value of the dimension that is published to Amazon
       * CloudWatch if you do not provide the value of the dimension when you send an email. 
       * The default value must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), at
       * signs (&#64;), or periods (.).
       * * Contain 256 characters or fewer.
       */
      override fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
      }

      /**
       * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
       * sending metric. 
       * The name must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * colons (:).
       * * Contain 256 characters or fewer.
       */
      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      /**
       * @param dimensionValueSource The place where Amazon SES finds the value of a dimension to
       * publish to Amazon CloudWatch. 
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` / `SendRawEmail` API, specify `messageTag` . To use your own
       * email headers, specify `emailHeader` . To put a custom tag on any link included in your email,
       * specify `linkTag` .
       */
      override fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty,
    ) : CdkObject(cdkObject), DimensionConfigurationProperty {
      /**
       * The default value of the dimension that is published to Amazon CloudWatch if you do not
       * provide the value of the dimension when you send an email.
       *
       * The default value must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), at
       * signs (&#64;), or periods (.).
       * * Contain 256 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
       */
      override fun defaultDimensionValue(): String = unwrap(this).getDefaultDimensionValue()

      /**
       * The name of an Amazon CloudWatch dimension associated with an email sending metric.
       *
       * The name must meet the following requirements:
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * colons (:).
       * * Contain 256 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
       */
      override fun dimensionName(): String = unwrap(this).getDimensionName()

      /**
       * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch.
       *
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` / `SendRawEmail` API, specify `messageTag` . To use your own
       * email headers, specify `emailHeader` . To put a custom tag on any link included in your email,
       * specify `linkTag` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
       */
      override fun dimensionValueSource(): String = unwrap(this).getDimensionValueSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty):
          DimensionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
    }
  }

  public interface EventDestinationProperty {
    /**
     * An object that contains the names, default values, and sources of the dimensions associated
     * with an Amazon CloudWatch event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
     */
    public fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

    /**
     * Sets whether Amazon SES publishes events to this destination when you send an email with the
     * associated configuration set.
     *
     * Set to `true` to enable publishing to this destination; set to `false` to prevent publishing
     * to this destination. The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an
     * Amazon Kinesis Firehose event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
     */
    public fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

    /**
     * The type of email sending events to publish to the event destination.
     *
     * * `send` - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still
     * count it as a send, but delivery is suppressed.)
     * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
     * attempt to deliver it to the recipient’s mail server.
     * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email. (
     * *Soft bounces* are only included when SES fails to deliver the email after retrying for a period
     * of time.)
     * * `complaint` - The email was successfully delivered to the recipient’s mail server, but the
     * recipient marked it as spam.
     * * `delivery` - SES successfully delivered the email to the recipient's mail server.
     * * `open` - The recipient received the message and opened it in their email client.
     * * `click` - The recipient clicked one or more links in the email.
     * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
     * event type can occur when template data is missing, or when there is a mismatch between template
     * parameters and data. (This event type only occurs when you send email using the
     * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
     * or
     * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
     * API operations.)
     * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because a
     * temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox is
     * full, or when the receiving email server experiences a transient issue.
     * * `subscription` - The email was successfully delivered, but the recipient updated their
     * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
     * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
     */
    public fun matchingEventTypes(): List<String>

    /**
     * The name of the event destination. The name must meet the following requirements:.
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * An object that contains the topic ARN associated with an Amazon Simple Notification Service
     * (Amazon SNS) event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-snsdestination)
     */
    public fun snsDestination(): Any? = unwrap(this).getSnsDestination()

    /**
     * A builder for [EventDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      public fun cloudWatchDestination(cloudWatchDestination: IResolvable)

      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      public fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty)

      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      public
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit)

      /**
       * @param enabled Sets whether Amazon SES publishes events to this destination when you send
       * an email with the associated configuration set.
       * Set to `true` to enable publishing to this destination; set to `false` to prevent
       * publishing to this destination. The default value is `false` .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Sets whether Amazon SES publishes events to this destination when you send
       * an email with the associated configuration set.
       * Set to `true` to enable publishing to this destination; set to `false` to prevent
       * publishing to this destination. The default value is `false` .
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable)

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty)

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit)

      /**
       * @param matchingEventTypes The type of email sending events to publish to the event
       * destination. 
       * * `send` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `complaint` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `delivery` - SES successfully delivered the email to the recipient's mail server.
       * * `open` - The recipient received the message and opened it in their email client.
       * * `click` - The recipient clicked one or more links in the email.
       * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `subscription` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      public fun matchingEventTypes(matchingEventTypes: List<String>)

      /**
       * @param matchingEventTypes The type of email sending events to publish to the event
       * destination. 
       * * `send` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `complaint` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `delivery` - SES successfully delivered the email to the recipient's mail server.
       * * `open` - The recipient received the message and opened it in their email client.
       * * `click` - The recipient clicked one or more links in the email.
       * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `subscription` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      public fun matchingEventTypes(vararg matchingEventTypes: String)

      /**
       * @param name The name of the event destination. The name must meet the following
       * requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Contain 64 characters or fewer.
       */
      public fun name(name: String)

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      public fun snsDestination(snsDestination: IResolvable)

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      public fun snsDestination(snsDestination: SnsDestinationProperty)

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      public fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      override fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      override fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(CloudWatchDestinationProperty::unwrap))
      }

      /**
       * @param cloudWatchDestination An object that contains the names, default values, and sources
       * of the dimensions associated with an Amazon CloudWatch event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      override
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatchDestination(CloudWatchDestinationProperty(cloudWatchDestination))

      /**
       * @param enabled Sets whether Amazon SES publishes events to this destination when you send
       * an email with the associated configuration set.
       * Set to `true` to enable publishing to this destination; set to `false` to prevent
       * publishing to this destination. The default value is `false` .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Sets whether Amazon SES publishes events to this destination when you send
       * an email with the associated configuration set.
       * Set to `true` to enable publishing to this destination; set to `false` to prevent
       * publishing to this destination. The default value is `false` .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      override fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(KinesisFirehoseDestinationProperty::unwrap))
      }

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDestination(KinesisFirehoseDestinationProperty(kinesisFirehoseDestination))

      /**
       * @param matchingEventTypes The type of email sending events to publish to the event
       * destination. 
       * * `send` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `complaint` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `delivery` - SES successfully delivered the email to the recipient's mail server.
       * * `open` - The recipient received the message and opened it in their email client.
       * * `click` - The recipient clicked one or more links in the email.
       * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `subscription` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      override fun matchingEventTypes(matchingEventTypes: List<String>) {
        cdkBuilder.matchingEventTypes(matchingEventTypes)
      }

      /**
       * @param matchingEventTypes The type of email sending events to publish to the event
       * destination. 
       * * `send` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `complaint` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `delivery` - SES successfully delivered the email to the recipient's mail server.
       * * `open` - The recipient received the message and opened it in their email client.
       * * `click` - The recipient clicked one or more links in the email.
       * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `subscription` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      override fun matchingEventTypes(vararg matchingEventTypes: String): Unit =
          matchingEventTypes(matchingEventTypes.toList())

      /**
       * @param name The name of the event destination. The name must meet the following
       * requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Contain 64 characters or fewer.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      override fun snsDestination(snsDestination: IResolvable) {
        cdkBuilder.snsDestination(snsDestination.let(IResolvable::unwrap))
      }

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      override fun snsDestination(snsDestination: SnsDestinationProperty) {
        cdkBuilder.snsDestination(snsDestination.let(SnsDestinationProperty::unwrap))
      }

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      override fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit): Unit =
          snsDestination(SnsDestinationProperty(snsDestination))

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty,
    ) : CdkObject(cdkObject), EventDestinationProperty {
      /**
       * An object that contains the names, default values, and sources of the dimensions associated
       * with an Amazon CloudWatch event destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
       */
      override fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

      /**
       * Sets whether Amazon SES publishes events to this destination when you send an email with
       * the associated configuration set.
       *
       * Set to `true` to enable publishing to this destination; set to `false` to prevent
       * publishing to this destination. The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * An object that contains the delivery stream ARN and the IAM role ARN associated with an
       * Amazon Kinesis Firehose event destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
       */
      override fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

      /**
       * The type of email sending events to publish to the event destination.
       *
       * * `send` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `complaint` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `delivery` - SES successfully delivered the email to the recipient's mail server.
       * * `open` - The recipient received the message and opened it in their email client.
       * * `click` - The recipient clicked one or more links in the email.
       * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `subscription` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
       */
      override fun matchingEventTypes(): List<String> = unwrap(this).getMatchingEventTypes()

      /**
       * The name of the event destination. The name must meet the following requirements:.
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Contain 64 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * An object that contains the topic ARN associated with an Amazon Simple Notification Service
       * (Amazon SNS) event destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-snsdestination)
       */
      override fun snsDestination(): Any? = unwrap(this).getSnsDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty):
          EventDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
    }
  }

  public interface SnsDestinationProperty {
    /**
     * The ARN of the Amazon SNS topic for email sending events.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
     * operation.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-snsdestination.html#cfn-ses-configurationseteventdestination-snsdestination-topicarn)
     */
    public fun topicArn(): String

    /**
     * A builder for [SnsDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topicArn The ARN of the Amazon SNS topic for email sending events. 
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

      /**
       * @param topicArn The ARN of the Amazon SNS topic for email sending events. 
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty,
    ) : CdkObject(cdkObject), SnsDestinationProperty {
      /**
       * The ARN of the Amazon SNS topic for email sending events.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-snsdestination.html#cfn-ses-configurationseteventdestination-snsdestination-topicarn)
       */
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty):
          SnsDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
    }
  }

  public interface CloudWatchDestinationProperty {
    /**
     * A list of dimensions upon which to categorize your emails when you publish email sending
     * events to Amazon CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
     */
    public fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()

    /**
     * A builder for [CloudWatchDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(dimensionConfigurations: IResolvable)

      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(dimensionConfigurations: List<Any>)

      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(vararg dimensionConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(dimensionConfigurations: List<Any>) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations)
      }

      /**
       * @param dimensionConfigurations A list of dimensions upon which to categorize your emails
       * when you publish email sending events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(vararg dimensionConfigurations: Any): Unit =
          dimensionConfigurations(dimensionConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty,
    ) : CdkObject(cdkObject), CloudWatchDestinationProperty {
      /**
       * A list of dimensions upon which to categorize your emails when you publish email sending
       * events to Amazon CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
       */
      override fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty):
          CloudWatchDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
    }
  }
}
