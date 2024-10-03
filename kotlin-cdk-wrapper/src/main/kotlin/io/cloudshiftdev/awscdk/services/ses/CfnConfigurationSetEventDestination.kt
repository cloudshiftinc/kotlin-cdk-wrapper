@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a configuration set event destination.
 *
 * *Events* include message sends, deliveries, opens, clicks, bounces, and complaints. *Event
 * destinations* are places that you can send information about these events to. For example, you can
 * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or
 * you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
 *
 * A single configuration set can include more than one event destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnConfigurationSetEventDestination cfnConfigurationSetEventDestination =
 * CfnConfigurationSetEventDestination.Builder.create(this, "MyCfnConfigurationSetEventDestination")
 * .configurationSetName("configurationSetName")
 * .eventDestination(EventDestinationProperty.builder()
 * .matchingEventTypes(List.of("matchingEventTypes"))
 * // the properties below are optional
 * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
 * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build()))
 * .build())
 * .enabled(false)
 * .eventBridgeDestination(EventBridgeDestinationProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build())
 * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build())
 * .name("name")
 * .snsDestination(SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
 */
public open class CfnConfigurationSetEventDestination(
  cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetEventDestinationProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationSetEventDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetEventDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationSetEventDestinationProps(props)
  )

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
   * An object that defines the event destination.
   */
  public open fun eventDestination(): Any = unwrap(this).getEventDestination()

  /**
   * An object that defines the event destination.
   */
  public open fun eventDestination(`value`: IResolvable) {
    unwrap(this).setEventDestination(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines the event destination.
   */
  public open fun eventDestination(`value`: EventDestinationProperty) {
    unwrap(this).setEventDestination(`value`.let(EventDestinationProperty.Companion::unwrap))
  }

  /**
   * An object that defines the event destination.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("161eb83cbe5a17d079b5c9c3a492fa1c5cf750bd79c194bbc0ceaa3fc021e04d")
  public open fun eventDestination(`value`: EventDestinationProperty.Builder.() -> Unit): Unit =
      eventDestination(EventDestinationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    public fun eventDestination(eventDestination: IResolvable)

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    public fun eventDestination(eventDestination: EventDestinationProperty)

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    override fun eventDestination(eventDestination: EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(EventDestinationProperty.Companion::unwrap))
    }

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     * @param eventDestination An object that defines the event destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f4d87013c9c0fe207561ee83bdde5e8d51ca236fe5b45cb88067774bcccb78")
    override fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit):
        Unit = eventDestination(EventDestinationProperty(eventDestination))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CFN_RESOURCE_TYPE_NAME

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
        as software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
  }

  /**
   * An object that defines an Amazon CloudWatch destination for email events.
   *
   * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * CloudWatchDestinationProperty cloudWatchDestinationProperty =
   * CloudWatchDestinationProperty.builder()
   * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
   * .defaultDimensionValue("defaultDimensionValue")
   * .dimensionName("dimensionName")
   * .dimensionValueSource("dimensionValueSource")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html)
   */
  public interface CloudWatchDestinationProperty {
    /**
     * An array of objects that define the dimensions to use when you send email events to Amazon
     * CloudWatch.
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
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(dimensionConfigurations: IResolvable)

      /**
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(dimensionConfigurations: List<Any>)

      /**
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      public fun dimensionConfigurations(vararg dimensionConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

      /**
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(dimensionConfigurations: List<Any>) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensionConfigurations An array of objects that define the dimensions to use when
       * you send email events to Amazon CloudWatch.
       */
      override fun dimensionConfigurations(vararg dimensionConfigurations: Any): Unit =
          dimensionConfigurations(dimensionConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty,
    ) : CdkObject(cdkObject),
        CloudWatchDestinationProperty {
      /**
       * An array of objects that define the dimensions to use when you send email events to Amazon
       * CloudWatch.
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
          CloudWatchDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
    }
  }

  /**
   * An object that defines the dimension configuration to use when you send email events to Amazon
   * CloudWatch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DimensionConfigurationProperty dimensionConfigurationProperty =
   * DimensionConfigurationProperty.builder()
   * .defaultDimensionValue("defaultDimensionValue")
   * .dimensionName("dimensionName")
   * .dimensionValueSource("dimensionValueSource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html)
   */
  public interface DimensionConfigurationProperty {
    /**
     * The default value of the dimension that is published to Amazon CloudWatch if you don't
     * provide the value of the dimension when you send an email.
     *
     * This value has to meet the following criteria:
     *
     * * Can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-),
     * at signs (&#64;), and periods (.).
     * * It can contain no more than 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
     */
    public fun defaultDimensionValue(): String

    /**
     * The name of an Amazon CloudWatch dimension associated with an email sending metric.
     *
     * The name has to meet the following criteria:
     *
     * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
     * (-).
     * * It can contain no more than 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
     */
    public fun dimensionName(): String

    /**
     * The location where the Amazon SES API v2 finds the value of a dimension to publish to Amazon
     * CloudWatch.
     *
     * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a parameter
     * to the `SendEmail` or `SendRawEmail` API, choose `messageTag` . To use your own email headers,
     * choose `emailHeader` . To use link tags, choose `linkTag` .
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
       * CloudWatch if you don't provide the value of the dimension when you send an email. 
       * This value has to meet the following criteria:
       *
       * * Can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-),
       * at signs (&#64;), and periods (.).
       * * It can contain no more than 256 characters.
       */
      public fun defaultDimensionValue(defaultDimensionValue: String)

      /**
       * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
       * sending metric. 
       * The name has to meet the following criteria:
       *
       * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
       * (-).
       * * It can contain no more than 256 characters.
       */
      public fun dimensionName(dimensionName: String)

      /**
       * @param dimensionValueSource The location where the Amazon SES API v2 finds the value of a
       * dimension to publish to Amazon CloudWatch. 
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` or `SendRawEmail` API, choose `messageTag` . To use your own
       * email headers, choose `emailHeader` . To use link tags, choose `linkTag` .
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
       * CloudWatch if you don't provide the value of the dimension when you send an email. 
       * This value has to meet the following criteria:
       *
       * * Can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-),
       * at signs (&#64;), and periods (.).
       * * It can contain no more than 256 characters.
       */
      override fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
      }

      /**
       * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
       * sending metric. 
       * The name has to meet the following criteria:
       *
       * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
       * (-).
       * * It can contain no more than 256 characters.
       */
      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      /**
       * @param dimensionValueSource The location where the Amazon SES API v2 finds the value of a
       * dimension to publish to Amazon CloudWatch. 
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` or `SendRawEmail` API, choose `messageTag` . To use your own
       * email headers, choose `emailHeader` . To use link tags, choose `linkTag` .
       */
      override fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty,
    ) : CdkObject(cdkObject),
        DimensionConfigurationProperty {
      /**
       * The default value of the dimension that is published to Amazon CloudWatch if you don't
       * provide the value of the dimension when you send an email.
       *
       * This value has to meet the following criteria:
       *
       * * Can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-),
       * at signs (&#64;), and periods (.).
       * * It can contain no more than 256 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
       */
      override fun defaultDimensionValue(): String = unwrap(this).getDefaultDimensionValue()

      /**
       * The name of an Amazon CloudWatch dimension associated with an email sending metric.
       *
       * The name has to meet the following criteria:
       *
       * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
       * (-).
       * * It can contain no more than 256 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
       */
      override fun dimensionName(): String = unwrap(this).getDimensionName()

      /**
       * The location where the Amazon SES API v2 finds the value of a dimension to publish to
       * Amazon CloudWatch.
       *
       * To use the message tags that you specify using an `X-SES-MESSAGE-TAGS` header or a
       * parameter to the `SendEmail` or `SendRawEmail` API, choose `messageTag` . To use your own
       * email headers, choose `emailHeader` . To use link tags, choose `linkTag` .
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
          DimensionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DimensionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
    }
  }

  /**
   * An object that defines an Amazon EventBridge destination for email events.
   *
   * You can use Amazon EventBridge to send notifications when certain email events occur.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * EventBridgeDestinationProperty eventBridgeDestinationProperty =
   * EventBridgeDestinationProperty.builder()
   * .eventBusArn("eventBusArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventbridgedestination.html)
   */
  public interface EventBridgeDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon EventBridge bus to publish email events to.
     *
     * Only the default bus is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventbridgedestination.html#cfn-ses-configurationseteventdestination-eventbridgedestination-eventbusarn)
     */
    public fun eventBusArn(): String

    /**
     * A builder for [EventBridgeDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusArn The Amazon Resource Name (ARN) of the Amazon EventBridge bus to publish
       * email events to. 
       * Only the default bus is supported.
       */
      public fun eventBusArn(eventBusArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty.builder()

      /**
       * @param eventBusArn The Amazon Resource Name (ARN) of the Amazon EventBridge bus to publish
       * email events to. 
       * Only the default bus is supported.
       */
      override fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty,
    ) : CdkObject(cdkObject),
        EventBridgeDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon EventBridge bus to publish email events to.
       *
       * Only the default bus is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventbridgedestination.html#cfn-ses-configurationseteventdestination-eventbridgedestination-eventbusarn)
       */
      override fun eventBusArn(): String = unwrap(this).getEventBusArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty):
          EventBridgeDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventBridgeDestinationProperty
    }
  }

  /**
   * In the Amazon SES API v2, *events* include message sends, deliveries, opens, clicks, bounces,
   * complaints and delivery delays.
   *
   * *Event destinations* are places that you can send information about these events to. For
   * example, you can send event data to Amazon SNS to receive notifications when you receive bounces
   * or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for
   * long-term storage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * EventDestinationProperty eventDestinationProperty = EventDestinationProperty.builder()
   * .matchingEventTypes(List.of("matchingEventTypes"))
   * // the properties below are optional
   * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
   * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
   * .defaultDimensionValue("defaultDimensionValue")
   * .dimensionName("dimensionName")
   * .dimensionValueSource("dimensionValueSource")
   * .build()))
   * .build())
   * .enabled(false)
   * .eventBridgeDestination(EventBridgeDestinationProperty.builder()
   * .eventBusArn("eventBusArn")
   * .build())
   * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
   * .deliveryStreamArn("deliveryStreamArn")
   * .iamRoleArn("iamRoleArn")
   * .build())
   * .name("name")
   * .snsDestination(SnsDestinationProperty.builder()
   * .topicArn("topicArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html)
   */
  public interface EventDestinationProperty {
    /**
     * An object that defines an Amazon CloudWatch destination for email events.
     *
     * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
     */
    public fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

    /**
     * If `true` , the event destination is enabled.
     *
     * When the event destination is enabled, the specified event types are sent to the destinations
     * in this `EventDestinationDefinition` .
     *
     * If `false` , the event destination is disabled. When the event destination is disabled,
     * events aren't sent to the specified destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * An object that defines an Amazon EventBridge destination for email events.
     *
     * You can use Amazon EventBridge to send notifications when certain email events occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-eventbridgedestination)
     */
    public fun eventBridgeDestination(): Any? = unwrap(this).getEventBridgeDestination()

    /**
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an
     * Amazon Kinesis Firehose event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
     */
    public fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

    /**
     * The types of events that Amazon SES sends to the specified event destinations.
     *
     * * `SEND` - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still
     * count it as a send, but delivery is suppressed.)
     * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
     * attempt to deliver it to the recipient’s mail server.
     * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email. (
     * *Soft bounces* are only included when SES fails to deliver the email after retrying for a period
     * of time.)
     * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but the
     * recipient marked it as spam.
     * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
     * * `OPEN` - The recipient received the message and opened it in their email client.
     * * `CLICK` - The recipient clicked one or more links in the email.
     * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
     * event type can occur when template data is missing, or when there is a mismatch between template
     * parameters and data. (This event type only occurs when you send email using the
     * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
     * or
     * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
     * API operations.)
     * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because a
     * temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox is
     * full, or when the receiving email server experiences a transient issue.
     * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
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
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      public fun cloudWatchDestination(cloudWatchDestination: IResolvable)

      /**
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      public fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty)

      /**
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      public
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit)

      /**
       * @param enabled If `true` , the event destination is enabled.
       * When the event destination is enabled, the specified event types are sent to the
       * destinations in this `EventDestinationDefinition` .
       *
       * If `false` , the event destination is disabled. When the event destination is disabled,
       * events aren't sent to the specified destinations.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If `true` , the event destination is enabled.
       * When the event destination is enabled, the specified event types are sent to the
       * destinations in this `EventDestinationDefinition` .
       *
       * If `false` , the event destination is disabled. When the event destination is disabled,
       * events aren't sent to the specified destinations.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      public fun eventBridgeDestination(eventBridgeDestination: IResolvable)

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      public fun eventBridgeDestination(eventBridgeDestination: EventBridgeDestinationProperty)

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a97feab7510459f54d182edd3696e832ee9920cfe9957c61720a2f782b4e0d9")
      public
          fun eventBridgeDestination(eventBridgeDestination: EventBridgeDestinationProperty.Builder.() -> Unit)

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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit)

      /**
       * @param matchingEventTypes The types of events that Amazon SES sends to the specified event
       * destinations. 
       * * `SEND` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
       * * `OPEN` - The recipient received the message and opened it in their email client.
       * * `CLICK` - The recipient clicked one or more links in the email.
       * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      public fun matchingEventTypes(matchingEventTypes: List<String>)

      /**
       * @param matchingEventTypes The types of events that Amazon SES sends to the specified event
       * destinations. 
       * * `SEND` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
       * * `OPEN` - The recipient received the message and opened it in their email client.
       * * `CLICK` - The recipient clicked one or more links in the email.
       * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      public fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

      /**
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      override fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      override fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(CloudWatchDestinationProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for
       * email events.
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      override
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatchDestination(CloudWatchDestinationProperty(cloudWatchDestination))

      /**
       * @param enabled If `true` , the event destination is enabled.
       * When the event destination is enabled, the specified event types are sent to the
       * destinations in this `EventDestinationDefinition` .
       *
       * If `false` , the event destination is disabled. When the event destination is disabled,
       * events aren't sent to the specified destinations.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If `true` , the event destination is enabled.
       * When the event destination is enabled, the specified event types are sent to the
       * destinations in this `EventDestinationDefinition` .
       *
       * If `false` , the event destination is disabled. When the event destination is disabled,
       * events aren't sent to the specified destinations.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      override fun eventBridgeDestination(eventBridgeDestination: IResolvable) {
        cdkBuilder.eventBridgeDestination(eventBridgeDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      override fun eventBridgeDestination(eventBridgeDestination: EventBridgeDestinationProperty) {
        cdkBuilder.eventBridgeDestination(eventBridgeDestination.let(EventBridgeDestinationProperty.Companion::unwrap))
      }

      /**
       * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for
       * email events.
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a97feab7510459f54d182edd3696e832ee9920cfe9957c61720a2f782b4e0d9")
      override
          fun eventBridgeDestination(eventBridgeDestination: EventBridgeDestinationProperty.Builder.() -> Unit):
          Unit = eventBridgeDestination(EventBridgeDestinationProperty(eventBridgeDestination))

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      override fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(KinesisFirehoseDestinationProperty.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the
       * IAM role ARN associated with an Amazon Kinesis Firehose event destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDestination(KinesisFirehoseDestinationProperty(kinesisFirehoseDestination))

      /**
       * @param matchingEventTypes The types of events that Amazon SES sends to the specified event
       * destinations. 
       * * `SEND` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
       * * `OPEN` - The recipient received the message and opened it in their email client.
       * * `CLICK` - The recipient clicked one or more links in the email.
       * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
       * subscription preferences by clicking on an *unsubscribe* link as part of your [subscription
       * management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
       * .
       */
      override fun matchingEventTypes(matchingEventTypes: List<String>) {
        cdkBuilder.matchingEventTypes(matchingEventTypes)
      }

      /**
       * @param matchingEventTypes The types of events that Amazon SES sends to the specified event
       * destinations. 
       * * `SEND` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
       * * `OPEN` - The recipient received the message and opened it in their email client.
       * * `CLICK` - The recipient clicked one or more links in the email.
       * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
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
        cdkBuilder.snsDestination(snsDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      override fun snsDestination(snsDestination: SnsDestinationProperty) {
        cdkBuilder.snsDestination(snsDestination.let(SnsDestinationProperty.Companion::unwrap))
      }

      /**
       * @param snsDestination An object that contains the topic ARN associated with an Amazon
       * Simple Notification Service (Amazon SNS) event destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      override fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit): Unit =
          snsDestination(SnsDestinationProperty(snsDestination))

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty,
    ) : CdkObject(cdkObject),
        EventDestinationProperty {
      /**
       * An object that defines an Amazon CloudWatch destination for email events.
       *
       * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
       */
      override fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

      /**
       * If `true` , the event destination is enabled.
       *
       * When the event destination is enabled, the specified event types are sent to the
       * destinations in this `EventDestinationDefinition` .
       *
       * If `false` , the event destination is disabled. When the event destination is disabled,
       * events aren't sent to the specified destinations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * An object that defines an Amazon EventBridge destination for email events.
       *
       * You can use Amazon EventBridge to send notifications when certain email events occur.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-eventbridgedestination)
       */
      override fun eventBridgeDestination(): Any? = unwrap(this).getEventBridgeDestination()

      /**
       * An object that contains the delivery stream ARN and the IAM role ARN associated with an
       * Amazon Kinesis Firehose event destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
       */
      override fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

      /**
       * The types of events that Amazon SES sends to the specified event destinations.
       *
       * * `SEND` - The send request was successful and SES will attempt to deliver the message to
       * the recipient’s mail server. (If account-level or global suppression is being used, SES will
       * still count it as a send, but delivery is suppressed.)
       * * `REJECT` - SES accepted the email, but determined that it contained a virus and didn’t
       * attempt to deliver it to the recipient’s mail server.
       * * `BOUNCE` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email.
       * ( *Soft bounces* are only included when SES fails to deliver the email after retrying for a
       * period of time.)
       * * `COMPLAINT` - The email was successfully delivered to the recipient’s mail server, but
       * the recipient marked it as spam.
       * * `DELIVERY` - SES successfully delivered the email to the recipient's mail server.
       * * `OPEN` - The recipient received the message and opened it in their email client.
       * * `CLICK` - The recipient clicked one or more links in the email.
       * * `RENDERING_FAILURE` - The email wasn't sent because of a template rendering issue. This
       * event type can occur when template data is missing, or when there is a mismatch between
       * template parameters and data. (This event type only occurs when you send email using the
       * [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
       * or
       * [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
       * API operations.)
       * * `DELIVERY_DELAY` - The email couldn't be delivered to the recipient’s mail server because
       * a temporary issue occurred. Delivery delays can occur, for example, when the recipient's inbox
       * is full, or when the receiving email server experiences a transient issue.
       * * `SUBSCRIPTION` - The email was successfully delivered, but the recipient updated their
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
          EventDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? EventDestinationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
    }
  }

  /**
   * An object that defines an Amazon Kinesis Data Firehose destination for email events.
   *
   * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3
   * and Amazon Redshift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * KinesisFirehoseDestinationProperty kinesisFirehoseDestinationProperty =
   * KinesisFirehoseDestinationProperty.builder()
   * .deliveryStreamArn("deliveryStreamArn")
   * .iamRoleArn("iamRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html)
   */
  public interface KinesisFirehoseDestinationProperty {
    /**
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
     */
    public fun deliveryStreamArn(): String

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email
     * events to the Amazon Kinesis Data Firehose stream.
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
       * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2
       * uses to send email events to the Amazon Kinesis Data Firehose stream. 
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
       * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2
       * uses to send email events to the Amazon Kinesis Data Firehose stream. 
       */
      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty,
    ) : CdkObject(cdkObject),
        KinesisFirehoseDestinationProperty {
      /**
       * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published
       * to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
       */
      override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send
       * email events to the Amazon Kinesis Data Firehose stream.
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
          KinesisFirehoseDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
    }
  }

  /**
   * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
   * destination.
   *
   * Event destinations, such as Amazon SNS, are associated with configuration sets, which enable
   * you to publish email sending events. For information about using configuration sets, see the
   * [Amazon SES Developer
   * Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * SnsDestinationProperty snsDestinationProperty = SnsDestinationProperty.builder()
   * .topicArn("topicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-snsdestination.html)
   */
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
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty,
    ) : CdkObject(cdkObject),
        SnsDestinationProperty {
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
          SnsDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? SnsDestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
    }
  }
}
