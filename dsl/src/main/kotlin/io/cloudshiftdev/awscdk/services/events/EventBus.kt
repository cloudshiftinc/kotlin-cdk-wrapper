package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
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
  public open fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public open fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun archive(id: String, props: BaseArchiveProps): Archive =
      unwrap(this).archive(id, props.let(BaseArchiveProps::unwrap)).let(Archive::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
  public override fun archive(id: String, props: BaseArchiveProps.Builder.() -> Unit): Archive =
      archive(id, BaseArchiveProps(props))

  public override fun eventBusArn(): String = unwrap(this).getEventBusArn()

  public override fun eventBusName(): String = unwrap(this).getEventBusName()

  public override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

  public override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  public override fun grantPutEventsTo(grantee: IGrantable): Grant =
      unwrap(this).grantPutEventsTo(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public interface Builder {
    public fun eventBusName(eventBusName: String)

    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBus.Builder =
        software.amazon.awscdk.services.events.EventBus.Builder.create(scope, id)

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBus = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEventBusArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventBusArn: String,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventBusArn).let(IEventBus::wrap)

    public open fun fromEventBusAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventBusAttributes,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(EventBusAttributes::unwrap)).let(IEventBus::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db4baaedf19a8aa6a12b5ee830180ece463210cfe7437dd4c219388fb552b137")
    public open fun fromEventBusAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventBusAttributes.Builder.() -> Unit,
    ): IEventBus = fromEventBusAttributes(scope, id, EventBusAttributes(attrs))

    public open fun fromEventBusName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventBusName: String,
    ): IEventBus =
        software.amazon.awscdk.services.events.EventBus.fromEventBusName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventBusName).let(IEventBus::wrap)

    public open fun grantAllPutEvents(grantee: IGrantable): Grant =
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
