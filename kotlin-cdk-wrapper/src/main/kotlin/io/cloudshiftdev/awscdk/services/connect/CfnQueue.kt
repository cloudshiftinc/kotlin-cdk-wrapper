@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains information about a queue.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
 * .hoursOfOperationArn("hoursOfOperationArn")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .maxContacts(123)
 * .outboundCallerConfig(OutboundCallerConfigProperty.builder()
 * .outboundCallerIdName("outboundCallerIdName")
 * .outboundCallerIdNumberArn("outboundCallerIdNumberArn")
 * .outboundFlowArn("outboundFlowArn")
 * .build())
 * .quickConnectArns(List.of("quickConnectArns"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html)
 */
public open class CfnQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnQueue,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnQueue(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnQueueProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the queue.
   */
  public open fun attrQueueArn(): String = unwrap(this).getAttrQueueArn()

  /**
   * The type of queue.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the queue.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the queue.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the hours of operation.
   */
  public open fun hoursOfOperationArn(): String = unwrap(this).getHoursOfOperationArn()

  /**
   * The Amazon Resource Name (ARN) of the hours of operation.
   */
  public open fun hoursOfOperationArn(`value`: String) {
    unwrap(this).setHoursOfOperationArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The maximum number of contacts that can be in the queue before it is considered full.
   */
  public open fun maxContacts(): Number? = unwrap(this).getMaxContacts()

  /**
   * The maximum number of contacts that can be in the queue before it is considered full.
   */
  public open fun maxContacts(`value`: Number) {
    unwrap(this).setMaxContacts(`value`)
  }

  /**
   * The name of the queue.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the queue.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   */
  public open fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   */
  public open fun outboundCallerConfig(`value`: IResolvable) {
    unwrap(this).setOutboundCallerConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   */
  public open fun outboundCallerConfig(`value`: OutboundCallerConfigProperty) {
    unwrap(this).setOutboundCallerConfig(`value`.let(OutboundCallerConfigProperty::unwrap))
  }

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab8ea47268cf497727d015924e56654bac17c87fede1a93f7211ca86e3804e06")
  public open fun outboundCallerConfig(`value`: OutboundCallerConfigProperty.Builder.() -> Unit):
      Unit = outboundCallerConfig(OutboundCallerConfigProperty(`value`))

  /**
   * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
   * working the queue.
   */
  public open fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
   * working the queue.
   */
  public open fun quickConnectArns(`value`: List<String>) {
    unwrap(this).setQuickConnectArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
   * working the queue.
   */
  public open fun quickConnectArns(vararg `value`: String): Unit =
      quickConnectArns(`value`.toList())

  /**
   * The status of the queue.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the queue.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-description)
     * @param description The description of the queue. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-hoursofoperationarn)
     * @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation. 
     */
    public fun hoursOfOperationArn(hoursOfOperationArn: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The maximum number of contacts that can be in the queue before it is considered full.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-maxcontacts)
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     * considered full. 
     */
    public fun maxContacts(maxContacts: Number)

    /**
     * The name of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-name)
     * @param name The name of the queue. 
     */
    public fun name(name: String)

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    public fun outboundCallerConfig(outboundCallerConfig: IResolvable)

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    public fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty)

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fea0c6d4349f0a909729187b8314330b05c7d9bb80d6adb423178a0df302ce2")
    public
        fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue. 
     */
    public fun quickConnectArns(quickConnectArns: List<String>)

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue. 
     */
    public fun quickConnectArns(vararg quickConnectArns: String)

    /**
     * The status of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-status)
     * @param status The status of the queue. 
     */
    public fun status(status: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQueue.Builder =
        software.amazon.awscdk.services.connect.CfnQueue.Builder.create(scope, id)

    /**
     * The description of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-description)
     * @param description The description of the queue. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-hoursofoperationarn)
     * @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation. 
     */
    override fun hoursOfOperationArn(hoursOfOperationArn: String) {
      cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The maximum number of contacts that can be in the queue before it is considered full.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-maxcontacts)
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     * considered full. 
     */
    override fun maxContacts(maxContacts: Number) {
      cdkBuilder.maxContacts(maxContacts)
    }

    /**
     * The name of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-name)
     * @param name The name of the queue. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    override fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(IResolvable::unwrap))
    }

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    override fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(OutboundCallerConfigProperty::unwrap))
    }

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fea0c6d4349f0a909729187b8314330b05c7d9bb80d6adb423178a0df302ce2")
    override
        fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty.Builder.() -> Unit):
        Unit = outboundCallerConfig(OutboundCallerConfigProperty(outboundCallerConfig))

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue. 
     */
    override fun quickConnectArns(quickConnectArns: List<String>) {
      cdkBuilder.quickConnectArns(quickConnectArns)
    }

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue. 
     */
    override fun quickConnectArns(vararg quickConnectArns: String): Unit =
        quickConnectArns(quickConnectArns.toList())

    /**
     * The status of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-status)
     * @param status The status of the queue. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.connect.CfnQueue =
        wrapped.cdkObject
  }

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * OutboundCallerConfigProperty outboundCallerConfigProperty =
   * OutboundCallerConfigProperty.builder()
   * .outboundCallerIdName("outboundCallerIdName")
   * .outboundCallerIdNumberArn("outboundCallerIdNumberArn")
   * .outboundFlowArn("outboundFlowArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html)
   */
  public interface OutboundCallerConfigProperty {
    /**
     * The caller ID name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundcalleridname)
     */
    public fun outboundCallerIdName(): String? = unwrap(this).getOutboundCallerIdName()

    /**
     * The Amazon Resource Name (ARN) of the outbound caller ID number.
     *
     *
     * Only use the phone number ARN format that doesn't contain `instance` in the path, for
     * example, `arn:aws:connect:us-east-1:1234567890:phone-number/uuid` . This is the same ARN format
     * that is returned when you create a phone number using CloudFormation , or when you call the
     * [ListPhoneNumbersV2](https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html)
     * API.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundcalleridnumberarn)
     */
    public fun outboundCallerIdNumberArn(): String? = unwrap(this).getOutboundCallerIdNumberArn()

    /**
     * The Amazon Resource Name (ARN) of the outbound flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundflowarn)
     */
    public fun outboundFlowArn(): String? = unwrap(this).getOutboundFlowArn()

    /**
     * A builder for [OutboundCallerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param outboundCallerIdName The caller ID name.
       */
      public fun outboundCallerIdName(outboundCallerIdName: String)

      /**
       * @param outboundCallerIdNumberArn The Amazon Resource Name (ARN) of the outbound caller ID
       * number.
       *
       * Only use the phone number ARN format that doesn't contain `instance` in the path, for
       * example, `arn:aws:connect:us-east-1:1234567890:phone-number/uuid` . This is the same ARN
       * format that is returned when you create a phone number using CloudFormation , or when you call
       * the
       * [ListPhoneNumbersV2](https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html)
       * API.
       */
      public fun outboundCallerIdNumberArn(outboundCallerIdNumberArn: String)

      /**
       * @param outboundFlowArn The Amazon Resource Name (ARN) of the outbound flow.
       */
      public fun outboundFlowArn(outboundFlowArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty.Builder =
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty.builder()

      /**
       * @param outboundCallerIdName The caller ID name.
       */
      override fun outboundCallerIdName(outboundCallerIdName: String) {
        cdkBuilder.outboundCallerIdName(outboundCallerIdName)
      }

      /**
       * @param outboundCallerIdNumberArn The Amazon Resource Name (ARN) of the outbound caller ID
       * number.
       *
       * Only use the phone number ARN format that doesn't contain `instance` in the path, for
       * example, `arn:aws:connect:us-east-1:1234567890:phone-number/uuid` . This is the same ARN
       * format that is returned when you create a phone number using CloudFormation , or when you call
       * the
       * [ListPhoneNumbersV2](https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html)
       * API.
       */
      override fun outboundCallerIdNumberArn(outboundCallerIdNumberArn: String) {
        cdkBuilder.outboundCallerIdNumberArn(outboundCallerIdNumberArn)
      }

      /**
       * @param outboundFlowArn The Amazon Resource Name (ARN) of the outbound flow.
       */
      override fun outboundFlowArn(outboundFlowArn: String) {
        cdkBuilder.outboundFlowArn(outboundFlowArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty,
    ) : CdkObject(cdkObject), OutboundCallerConfigProperty {
      /**
       * The caller ID name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundcalleridname)
       */
      override fun outboundCallerIdName(): String? = unwrap(this).getOutboundCallerIdName()

      /**
       * The Amazon Resource Name (ARN) of the outbound caller ID number.
       *
       *
       * Only use the phone number ARN format that doesn't contain `instance` in the path, for
       * example, `arn:aws:connect:us-east-1:1234567890:phone-number/uuid` . This is the same ARN
       * format that is returned when you create a phone number using CloudFormation , or when you call
       * the
       * [ListPhoneNumbersV2](https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html)
       * API.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundcalleridnumberarn)
       */
      override fun outboundCallerIdNumberArn(): String? =
          unwrap(this).getOutboundCallerIdNumberArn()

      /**
       * The Amazon Resource Name (ARN) of the outbound flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html#cfn-connect-queue-outboundcallerconfig-outboundflowarn)
       */
      override fun outboundFlowArn(): String? = unwrap(this).getOutboundFlowArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutboundCallerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty):
          OutboundCallerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OutboundCallerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutboundCallerConfigProperty):
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty
    }
  }
}
