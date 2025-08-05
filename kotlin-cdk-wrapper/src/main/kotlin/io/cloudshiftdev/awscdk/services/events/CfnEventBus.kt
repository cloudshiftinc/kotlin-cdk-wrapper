@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an event bus within your account.
 *
 * This can be a custom event bus which you can use to receive events from your custom applications
 * and services, or it can be a partner event bus which can be matched to a partner event source.
 *
 *
 * As an aid to help you jumpstart developing CloudFormation templates, the EventBridge console
 * enables you to create templates from the existing event buses in your account. For more information,
 * see [Generating CloudFormation templates from an EventBridge event
 * bus](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-generate-event-bus-template.html)
 * in the *Amazon EventBridge User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object policy;
 * CfnEventBus cfnEventBus = CfnEventBus.Builder.create(this, "MyCfnEventBus")
 * .name("name")
 * // the properties below are optional
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build())
 * .description("description")
 * .eventSourceName("eventSourceName")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .logConfig(LogConfigProperty.builder()
 * .includeDetail("includeDetail")
 * .level("level")
 * .build())
 * .policy(policy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html)
 */
public open class CfnEventBus(
  cdkObject: software.amazon.awscdk.services.events.CfnEventBus,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnEventBus(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventBusProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventBusProps(props)
  )

  /**
   * The ARN of the event bus, such as
   * `arn:aws:events:us-east-2:123456789012:event-bus/aws.partner/PartnerName/acct1/repo1` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the event bus, such as `PartnerName/acct1/repo1` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   *
   */
  public open fun attrPolicy(): String = unwrap(this).getAttrPolicy()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   */
  public open fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   */
  public open fun deadLetterConfig(`value`: IResolvable) {
    unwrap(this).setDeadLetterConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   */
  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty) {
    unwrap(this).setDeadLetterConfig(`value`.let(DeadLetterConfigProperty.Companion::unwrap))
  }

  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad9d8f4092e91a69f655c27f57eacfe113c07a579779094ab803b244ad23ccbb")
  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty.Builder.() -> Unit): Unit =
      deadLetterConfig(DeadLetterConfigProperty(`value`))

  /**
   * The event bus description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The event bus description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   */
  public open fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   */
  public open fun eventSourceName(`value`: String) {
    unwrap(this).setEventSourceName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt events on this event bus.
   */
  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt events on this event bus.
   */
  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  /**
   * The logging configuration settings for the event bus.
   */
  public open fun logConfig(): Any? = unwrap(this).getLogConfig()

  /**
   * The logging configuration settings for the event bus.
   */
  public open fun logConfig(`value`: IResolvable) {
    unwrap(this).setLogConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The logging configuration settings for the event bus.
   */
  public open fun logConfig(`value`: LogConfigProperty) {
    unwrap(this).setLogConfig(`value`.let(LogConfigProperty.Companion::unwrap))
  }

  /**
   * The logging configuration settings for the event bus.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed40f9cf014c45ce4fd7a51d77b5cfe25cc34af50926c400e2346213ccb27595")
  public open fun logConfig(`value`: LogConfigProperty.Builder.() -> Unit): Unit =
      logConfig(LogConfigProperty(`value`))

  /**
   * The name of the new event bus.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the new event bus.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to associate with the event bus.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnEventBus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f31737b7d3b549dc98eb4b41fa2cecda7036ac88c739dce81a73969086234c6")
    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * The event bus description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
     * @param description The event bus description. 
     */
    public fun description(description: String)

    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with. 
     */
    public fun eventSourceName(eventSourceName: String)

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt events on this event bus.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt events on the event bus.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     *
     * Schema discovery is not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     *
     * * You call
     * `[CreateDiscoverer](https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer)`
     * on an event bus set to use a customer managed key for encryption.
     * * You call
     * `[UpdatedEventBus](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html)`
     * to set a customer managed key on an event bus with schema discovery enabled.
     *
     * To enable schema discovery on an event bus, choose to use an AWS owned key . For more
     * information, see [Encrypting
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption-event-bus-cmkey.html)
     * in the *Amazon EventBridge User Guide* . &gt; If you have specified that EventBridge use a
     * customer managed key for encrypting the source event bus, we strongly recommend you also specify
     * a customer managed key for any archives for the event bus as well.
     *
     * For more information, see [Encrypting
     * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
     * the *Amazon EventBridge User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt events on this event bus. 
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    public fun logConfig(logConfig: IResolvable)

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    public fun logConfig(logConfig: LogConfigProperty)

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b06ca052f0d9b027cadf8d1e13b15d5a864f3c03f6516e5b6d0bd3636e88257")
    public fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit)

    /**
     * The name of the new event bus.
     *
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
     * @param name The name of the new event bus. 
     */
    public fun name(name: String)

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus. 
     */
    public fun policy(policy: Any)

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBus.Builder =
        software.amazon.awscdk.services.events.CfnEventBus.Builder.create(scope, id)

    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f31737b7d3b549dc98eb4b41fa2cecda7036ac88c739dce81a73969086234c6")
    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

    /**
     * The event bus description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
     * @param description The event bus description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with. 
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt events on this event bus.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt events on the event bus.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     *
     * Schema discovery is not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     *
     * * You call
     * `[CreateDiscoverer](https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer)`
     * on an event bus set to use a customer managed key for encryption.
     * * You call
     * `[UpdatedEventBus](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html)`
     * to set a customer managed key on an event bus with schema discovery enabled.
     *
     * To enable schema discovery on an event bus, choose to use an AWS owned key . For more
     * information, see [Encrypting
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption-event-bus-cmkey.html)
     * in the *Amazon EventBridge User Guide* . &gt; If you have specified that EventBridge use a
     * customer managed key for encrypting the source event bus, we strongly recommend you also specify
     * a customer managed key for any archives for the event bus as well.
     *
     * For more information, see [Encrypting
     * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
     * the *Amazon EventBridge User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt events on this event bus. 
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    override fun logConfig(logConfig: LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(LogConfigProperty.Companion::unwrap))
    }

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     * @param logConfig The logging configuration settings for the event bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b06ca052f0d9b027cadf8d1e13b15d5a864f3c03f6516e5b6d0bd3636e88257")
    override fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(LogConfigProperty(logConfig))

    /**
     * The name of the new event bus.
     *
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
     * @param name The name of the new event bus. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     * @param tags Tags to associate with the event bus. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnEventBus = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnEventBus.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBus): CfnEventBus =
        CfnEventBus(cdkObject)

    internal fun unwrap(wrapped: CfnEventBus): software.amazon.awscdk.services.events.CfnEventBus =
        wrapped.cdkObject as software.amazon.awscdk.services.events.CfnEventBus
  }

  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   *
   * For more information, see [Using dead-letter queues to process undelivered
   * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
   * in the *EventBridge User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-deadletterconfig.html)
   */
  public interface DeadLetterConfigProperty {
    /**
     * The ARN of the SQS queue specified as the target for the dead-letter queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-deadletterconfig.html#cfn-events-eventbus-deadletterconfig-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [DeadLetterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the SQS queue specified as the target for the dead-letter queue.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty.builder()

      /**
       * @param arn The ARN of the SQS queue specified as the target for the dead-letter queue.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject),
        DeadLetterConfigProperty {
      /**
       * The ARN of the SQS queue specified as the target for the dead-letter queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-deadletterconfig.html#cfn-events-eventbus-deadletterconfig-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty):
          DeadLetterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DeadLetterConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEventBus.DeadLetterConfigProperty
    }
  }

  /**
   * The logging configuration settings for the event bus.
   *
   * For more information, see [Configuring logs for event
   * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * LogConfigProperty logConfigProperty = LogConfigProperty.builder()
   * .includeDetail("includeDetail")
   * .level("level")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-logconfig.html)
   */
  public interface LogConfigProperty {
    /**
     * Whether EventBridge include detailed event information in the records it generates.
     *
     * Detailed data can be useful for troubleshooting and debugging. This information includes
     * details of the event itself, as well as target details.
     *
     * For more information, see [Including detail data in event bus
     * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-logs-data)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-logconfig.html#cfn-events-eventbus-logconfig-includedetail)
     */
    public fun includeDetail(): String? = unwrap(this).getIncludeDetail()

    /**
     * The level of logging detail to include. This applies to all log destinations for the event
     * bus.
     *
     * For more information, see [Specifying event bus log
     * level](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-bus-logs-level)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-logconfig.html#cfn-events-eventbus-logconfig-level)
     */
    public fun level(): String? = unwrap(this).getLevel()

    /**
     * A builder for [LogConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param includeDetail Whether EventBridge include detailed event information in the records
       * it generates.
       * Detailed data can be useful for troubleshooting and debugging. This information includes
       * details of the event itself, as well as target details.
       *
       * For more information, see [Including detail data in event bus
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-logs-data)
       * in the *EventBridge User Guide* .
       */
      public fun includeDetail(includeDetail: String)

      /**
       * @param level The level of logging detail to include. This applies to all log destinations
       * for the event bus.
       * For more information, see [Specifying event bus log
       * level](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-bus-logs-level)
       * in the *EventBridge User Guide* .
       */
      public fun level(level: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty.builder()

      /**
       * @param includeDetail Whether EventBridge include detailed event information in the records
       * it generates.
       * Detailed data can be useful for troubleshooting and debugging. This information includes
       * details of the event itself, as well as target details.
       *
       * For more information, see [Including detail data in event bus
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-logs-data)
       * in the *EventBridge User Guide* .
       */
      override fun includeDetail(includeDetail: String) {
        cdkBuilder.includeDetail(includeDetail)
      }

      /**
       * @param level The level of logging detail to include. This applies to all log destinations
       * for the event bus.
       * For more information, see [Specifying event bus log
       * level](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-bus-logs-level)
       * in the *EventBridge User Guide* .
       */
      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty,
    ) : CdkObject(cdkObject),
        LogConfigProperty {
      /**
       * Whether EventBridge include detailed event information in the records it generates.
       *
       * Detailed data can be useful for troubleshooting and debugging. This information includes
       * details of the event itself, as well as target details.
       *
       * For more information, see [Including detail data in event bus
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-logs-data)
       * in the *EventBridge User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-logconfig.html#cfn-events-eventbus-logconfig-includedetail)
       */
      override fun includeDetail(): String? = unwrap(this).getIncludeDetail()

      /**
       * The level of logging detail to include. This applies to all log destinations for the event
       * bus.
       *
       * For more information, see [Specifying event bus log
       * level](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus-logs.html#eb-event-bus-logs-level)
       * in the *EventBridge User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-logconfig.html#cfn-events-eventbus-logconfig-level)
       */
      override fun level(): String? = unwrap(this).getLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty):
          LogConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigProperty):
          software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEventBus.LogConfigProperty
    }
  }
}
