package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBus internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.EventBus,
) : Resource(cdkObject), IEventBus {
  /**
   * Adds a statement to the IAM resource policy associated with this event bus.
   *
   * @param statement 
   */
  public open fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the IAM resource policy associated with this event bus.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public open fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Create an EventBridge archive to send events to.
   *
   * When you create an archive, incoming events might not immediately start being sent to the
   * archive.
   * Allow a short period of time for changes to take effect.
   *
   * @param id 
   * @param props 
   */
  public override fun archive(id: String, props: BaseArchiveProps): Archive =
      unwrap(this).archive(id, props.let(BaseArchiveProps::unwrap)).let(Archive::wrap)

  /**
   * Create an EventBridge archive to send events to.
   *
   * When you create an archive, incoming events might not immediately start being sent to the
   * archive.
   * Allow a short period of time for changes to take effect.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
  public override fun archive(id: String, props: BaseArchiveProps.Builder.() -> Unit): Archive =
      archive(id, BaseArchiveProps(props))

  /**
   * The ARN of the event bus, such as:
   * arn:aws:events:us-east-2:123456789012:event-bus/aws.partner/PartnerName/acct1/repo1.
   */
  public override fun eventBusArn(): String = unwrap(this).getEventBusArn()

  /**
   * The physical ID of this event bus resource.
   */
  public override fun eventBusName(): String = unwrap(this).getEventBusName()

  /**
   * The policy for the event bus in JSON form.
   */
  public override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

  /**
   * The name of the partner event source.
   */
  public override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * Grants an IAM Principal to send custom events to the eventBus so that they can be matched to
   * rules.
   *
   * @param grantee 
   */
  public override fun grantPutEventsTo(grantee: IGrantable): Grant =
      unwrap(this).grantPutEventsTo(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.EventBus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you
     * cannot set this.
     *
     * Default: - automatically generated name
     *
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this. 
     */
    public fun eventBusName(eventBusName: String)

    /**
     * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
     * passed in, you cannot set this.
     *
     * Default: - no partner event source
     *
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this. 
     */
    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBus.Builder =
        software.amazon.awscdk.services.events.EventBus.Builder.create(scope, id)

    /**
     * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you
     * cannot set this.
     *
     * Default: - automatically generated name
     *
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this. 
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
     * passed in, you cannot set this.
     *
     * Default: - no partner event source
     *
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this. 
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBus = cdkBuilder.build()
  }

  public companion object {
    public fun fromEventBusArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventBusArn: String,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventBusArn).let(IEventBus::wrap)

    public fun fromEventBusAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventBusAttributes,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(EventBusAttributes::unwrap)).let(IEventBus::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db4baaedf19a8aa6a12b5ee830180ece463210cfe7437dd4c219388fb552b137")
    public fun fromEventBusAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventBusAttributes.Builder.() -> Unit,
    ): IEventBus = fromEventBusAttributes(scope, id, EventBusAttributes(attrs))

    public fun fromEventBusName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventBusName: String,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventBusName).let(IEventBus::wrap)

    public fun grantAllPutEvents(grantee: IGrantable): Grant =
        software.amazon.awscdk.services.events.EventBus.grantAllPutEvents(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventBus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventBus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBus): EventBus =
        EventBus(cdkObject)

    internal fun unwrap(wrapped: EventBus): software.amazon.awscdk.services.events.EventBus =
        wrapped.cdkObject
  }
}
