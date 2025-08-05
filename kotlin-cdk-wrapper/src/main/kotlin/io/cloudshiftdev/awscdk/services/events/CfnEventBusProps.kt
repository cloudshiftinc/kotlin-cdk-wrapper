@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

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
 * Properties for defining a `CfnEventBus`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object policy;
 * CfnEventBusProps cfnEventBusProps = CfnEventBusProps.builder()
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
public interface CfnEventBusProps {
  /**
   * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
   * (DLQ).
   *
   * For more information, see [Using dead-letter queues to process undelivered
   * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
   * in the *EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
   */
  public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  /**
   * The event bus description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * If you are creating a partner event bus, this specifies the partner event source that the new
   * event bus will be matched with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt events on this event bus.
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
   * customer managed key for encrypting the source event bus, we strongly recommend you also specify a
   * customer managed key for any archives for the event bus as well.
   *
   * For more information, see [Encrypting
   * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
   * the *Amazon EventBridge User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-kmskeyidentifier)
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The logging configuration settings for the event bus.
   *
   * For more information, see [Configuring logs for event
   * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
   */
  public fun logConfig(): Any? = unwrap(this).getLogConfig()

  /**
   * The name of the new event bus.
   *
   * Custom event bus names can't contain the `/` character, but you can use the `/` character in
   * partner event bus names. In addition, for partner event buses, the name must exactly match the
   * name of the partner event source that this event bus is matched to.
   *
   * You can't use the name `default` for a custom event bus, as this name is already used for your
   * account's default event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
   */
  public fun name(): String

  /**
   * The permissions policy of the event bus, describing which other AWS accounts can write events
   * to this event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * Tags to associate with the event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventBusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    public fun deadLetterConfig(deadLetterConfig: CfnEventBus.DeadLetterConfigProperty)

    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("218c44d6c789c061790d0176044975ad92fb80b70ba3a171b64fb8664601178e")
    public
        fun deadLetterConfig(deadLetterConfig: CfnEventBus.DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * @param description The event bus description.
     */
    public fun description(description: String)

    /**
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with.
     */
    public fun eventSourceName(eventSourceName: String)

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt events on this event bus.
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
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    public fun logConfig(logConfig: IResolvable)

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    public fun logConfig(logConfig: CfnEventBus.LogConfigProperty)

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e4d94f0742a80cdaecadb43ceea15908c3f3b7c3a77b0fd0d333892c0c9191")
    public fun logConfig(logConfig: CfnEventBus.LogConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the new event bus. 
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     */
    public fun name(name: String)

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus.
     */
    public fun policy(policy: Any)

    /**
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusProps.Builder =
        software.amazon.awscdk.services.events.CfnEventBusProps.builder()

    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    override fun deadLetterConfig(deadLetterConfig: CfnEventBus.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnEventBus.DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig Configuration details of the Amazon SQS queue for EventBridge to use
     * as a dead-letter queue (DLQ).
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("218c44d6c789c061790d0176044975ad92fb80b70ba3a171b64fb8664601178e")
    override
        fun deadLetterConfig(deadLetterConfig: CfnEventBus.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnEventBus.DeadLetterConfigProperty(deadLetterConfig))

    /**
     * @param description The event bus description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     * event source that the new event bus will be matched with.
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt events on this event bus.
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
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    override fun logConfig(logConfig: CfnEventBus.LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(CfnEventBus.LogConfigProperty.Companion::unwrap))
    }

    /**
     * @param logConfig The logging configuration settings for the event bus.
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e4d94f0742a80cdaecadb43ceea15908c3f3b7c3a77b0fd0d333892c0c9191")
    override fun logConfig(logConfig: CfnEventBus.LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(CfnEventBus.LogConfigProperty(logConfig))

    /**
     * @param name The name of the new event bus. 
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match the
     * name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     * can write events to this event bus.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param tags Tags to associate with the event bus.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to associate with the event bus.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps,
  ) : CdkObject(cdkObject),
      CfnEventBusProps {
    /**
     * Configuration details of the Amazon SQS queue for EventBridge to use as a dead-letter queue
     * (DLQ).
     *
     * For more information, see [Using dead-letter queues to process undelivered
     * events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rule-event-delivery.html#eb-rule-dlq)
     * in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-deadletterconfig)
     */
    override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * The event bus description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

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
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * The logging configuration settings for the event bus.
     *
     * For more information, see [Configuring logs for event
     * buses](https://docs.aws.amazon.com/eb-event-bus-logs.html) in the *EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-logconfig)
     */
    override fun logConfig(): Any? = unwrap(this).getLogConfig()

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
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The permissions policy of the event bus, describing which other AWS accounts can write events
     * to this event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps):
        CfnEventBusProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventBusProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusProps):
        software.amazon.awscdk.services.events.CfnEventBusProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnEventBusProps
  }
}
