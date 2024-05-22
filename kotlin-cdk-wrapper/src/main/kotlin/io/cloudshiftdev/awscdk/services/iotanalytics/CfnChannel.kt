@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::IoTAnalytics::Channel resource collects data from an MQTT topic and archives the raw,
 * unprocessed messages before publishing the data to a pipeline.
 *
 * For more information, see [How to Use AWS IoT
 * Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * Object serviceManagedS3;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .channelName("channelName")
 * .channelStorage(ChannelStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
 */
public open class CfnChannel(
  cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iotanalytics.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps,
  ) :
      this(software.amazon.awscdk.services.iotanalytics.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the channel.
   */
  public open fun channelName(): String? = unwrap(this).getChannelName()

  /**
   * The name of the channel.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * Where channel data is stored.
   */
  public open fun channelStorage(): Any? = unwrap(this).getChannelStorage()

  /**
   * Where channel data is stored.
   */
  public open fun channelStorage(`value`: IResolvable) {
    unwrap(this).setChannelStorage(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Where channel data is stored.
   */
  public open fun channelStorage(`value`: ChannelStorageProperty) {
    unwrap(this).setChannelStorage(`value`.let(ChannelStorageProperty.Companion::unwrap))
  }

  /**
   * Where channel data is stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03476dd732592a6dd40175a2b6460b35b25cb45bff67d8bd3ad73beb92fc1b96")
  public open fun channelStorage(`value`: ChannelStorageProperty.Builder.() -> Unit): Unit =
      channelStorage(ChannelStorageProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * How long, in days, message data is kept for the channel.
   */
  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * How long, in days, message data is kept for the channel.
   */
  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * How long, in days, message data is kept for the channel.
   */
  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty.Companion::unwrap))
  }

  /**
   * How long, in days, message data is kept for the channel.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63fc05a852f6eb77a310b7d891ee7d96a3b6c6c18f36f9b1f9e04d2d58ea1fbe")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the channel.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the channel.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata which can be used to manage the channel.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotanalytics.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname)
     * @param channelName The name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    public fun channelStorage(channelStorage: IResolvable)

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    public fun channelStorage(channelStorage: ChannelStorageProperty)

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20cf75877cfe6cc88719ec577e83cc2a0a1d9433b5031e19782230121bec86c3")
    public fun channelStorage(channelStorage: ChannelStorageProperty.Builder.() -> Unit)

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afd016681a3e2f10369d872bcfb1bb4acde1bd130d387ad2c3ef17a619c0176c")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * Metadata which can be used to manage the channel.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
     * @param tags Metadata which can be used to manage the channel. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the channel.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
     * @param tags Metadata which can be used to manage the channel. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnChannel.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnChannel.Builder.create(scope, id)

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname)
     * @param channelName The name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    override fun channelStorage(channelStorage: IResolvable) {
      cdkBuilder.channelStorage(channelStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    override fun channelStorage(channelStorage: ChannelStorageProperty) {
      cdkBuilder.channelStorage(channelStorage.let(ChannelStorageProperty.Companion::unwrap))
    }

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     * @param channelStorage Where channel data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20cf75877cfe6cc88719ec577e83cc2a0a1d9433b5031e19782230121bec86c3")
    override fun channelStorage(channelStorage: ChannelStorageProperty.Builder.() -> Unit): Unit =
        channelStorage(ChannelStorageProperty(channelStorage))

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable.Companion::unwrap))
    }

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty.Companion::unwrap))
    }

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afd016681a3e2f10369d872bcfb1bb4acde1bd130d387ad2c3ef17a619c0176c")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    /**
     * Metadata which can be used to manage the channel.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
     * @param tags Metadata which can be used to manage the channel. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the channel.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
     * @param tags Metadata which can be used to manage the channel. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotanalytics.CfnChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.iotanalytics.CfnChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.iotanalytics.CfnChannel
  }

  /**
   * Where channel data is stored.
   *
   * You may choose one of `serviceManagedS3` , `customerManagedS3` storage. If not specified, the
   * default is `serviceManagedS3` . This can't be changed after creation of the channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * Object serviceManagedS3;
   * ChannelStorageProperty channelStorageProperty = ChannelStorageProperty.builder()
   * .customerManagedS3(CustomerManagedS3Property.builder()
   * .bucket("bucket")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .serviceManagedS3(serviceManagedS3)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html)
   */
  public interface ChannelStorageProperty {
    /**
     * Used to store channel data in an S3 bucket that you manage.
     *
     * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
     * can't change the choice of S3 storage after the data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html#cfn-iotanalytics-channel-channelstorage-customermanageds3)
     */
    public fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

    /**
     * Used to store channel data in an S3 bucket managed by AWS IoT Analytics .
     *
     * You can't change the choice of S3 storage after the data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html#cfn-iotanalytics-channel-channelstorage-servicemanageds3)
     */
    public fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()

    /**
     * A builder for [ChannelStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      public fun customerManagedS3(customerManagedS3: IResolvable)

      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property)

      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7eb6cf71b02dbb0e5cf3fe556179354d70e550ee3cdb0ffeff0dce7e4e3dc22d")
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit)

      /**
       * @param serviceManagedS3 Used to store channel data in an S3 bucket managed by AWS IoT
       * Analytics .
       * You can't change the choice of S3 storage after the data store is created.
       */
      public fun serviceManagedS3(serviceManagedS3: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty.builder()

      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      override fun customerManagedS3(customerManagedS3: IResolvable) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      override fun customerManagedS3(customerManagedS3: CustomerManagedS3Property) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(CustomerManagedS3Property.Companion::unwrap))
      }

      /**
       * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7eb6cf71b02dbb0e5cf3fe556179354d70e550ee3cdb0ffeff0dce7e4e3dc22d")
      override
          fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit):
          Unit = customerManagedS3(CustomerManagedS3Property(customerManagedS3))

      /**
       * @param serviceManagedS3 Used to store channel data in an S3 bucket managed by AWS IoT
       * Analytics .
       * You can't change the choice of S3 storage after the data store is created.
       */
      override fun serviceManagedS3(serviceManagedS3: Any) {
        cdkBuilder.serviceManagedS3(serviceManagedS3)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty,
    ) : CdkObject(cdkObject), ChannelStorageProperty {
      /**
       * Used to store channel data in an S3 bucket that you manage.
       *
       * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You
       * can't change the choice of S3 storage after the data store is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html#cfn-iotanalytics-channel-channelstorage-customermanageds3)
       */
      override fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

      /**
       * Used to store channel data in an S3 bucket managed by AWS IoT Analytics .
       *
       * You can't change the choice of S3 storage after the data store is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html#cfn-iotanalytics-channel-channelstorage-servicemanageds3)
       */
      override fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty):
          ChannelStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? ChannelStorageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty
    }
  }

  /**
   * Used to store channel data in an S3 bucket that you manage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
   * .bucket("bucket")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html)
   */
  public interface CustomerManagedS3Property {
    /**
     * The name of the S3 bucket in which channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-bucket)
     */
    public fun bucket(): String

    /**
     * (Optional) The prefix used to create the keys of the channel data objects.
     *
     * Each object in an S3 bucket has a key that is its unique identifier within the bucket (each
     * object in a bucket has exactly one key). The prefix must end with a forward slash (/).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [CustomerManagedS3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket in which channel data is stored. 
       */
      public fun bucket(bucket: String)

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the channel data objects.
       * Each object in an S3 bucket has a key that is its unique identifier within the bucket (each
       * object in a bucket has exactly one key). The prefix must end with a forward slash (/).
       */
      public fun keyPrefix(keyPrefix: String)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 resources. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.builder()

      /**
       * @param bucket The name of the S3 bucket in which channel data is stored. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the channel data objects.
       * Each object in an S3 bucket has a key that is its unique identifier within the bucket (each
       * object in a bucket has exactly one key). The prefix must end with a forward slash (/).
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 resources. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property,
    ) : CdkObject(cdkObject), CustomerManagedS3Property {
      /**
       * The name of the S3 bucket in which channel data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * (Optional) The prefix used to create the keys of the channel data objects.
       *
       * Each object in an S3 bucket has a key that is its unique identifier within the bucket (each
       * object in a bucket has exactly one key). The prefix must end with a forward slash (/).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      /**
       * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon
       * S3 resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html#cfn-iotanalytics-channel-customermanageds3-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property):
          CustomerManagedS3Property = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedS3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3Property):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property
    }
  }

  /**
   * How long, in days, message data is kept.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
   * .numberOfDays(123)
   * .unlimited(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html)
   */
  public interface RetentionPeriodProperty {
    /**
     * The number of days that message data is kept.
     *
     * The `unlimited` parameter must be false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays)
     */
    public fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

    /**
     * If true, message data is kept indefinitely.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited)
     */
    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    /**
     * A builder for [RetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      public fun numberOfDays(numberOfDays: Number)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: Boolean)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.builder()

      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      override fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty,
    ) : CdkObject(cdkObject), RetentionPeriodProperty {
      /**
       * The number of days that message data is kept.
       *
       * The `unlimited` parameter must be false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays)
       */
      override fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

      /**
       * If true, message data is kept indefinitely.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited)
       */
      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty):
          RetentionPeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? RetentionPeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty
    }
  }
}
