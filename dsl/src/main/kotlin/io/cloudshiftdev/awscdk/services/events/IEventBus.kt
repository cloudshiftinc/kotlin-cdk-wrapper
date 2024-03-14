package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IEventBus : IResource {
  public fun archive(arg0: String, arg1: BaseArchiveProps): Archive

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
  public fun archive(arg0: String, arg1: BaseArchiveProps.Builder.() -> Unit): Archive

  public fun eventBusArn(): String

  public fun eventBusName(): String

  public fun eventBusPolicy(): String

  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  public fun grantPutEventsTo(arg0: IGrantable): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IEventBus,
  ) : IEventBus {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun archive(arg0: String, arg1: BaseArchiveProps): Archive = unwrap(this).archive(arg0,
        arg1.let(BaseArchiveProps::unwrap)).let(Archive::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
    override fun archive(arg0: String, arg1: BaseArchiveProps.Builder.() -> Unit): Archive =
        archive(arg0, BaseArchiveProps(arg1))

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun eventBusArn(): String = unwrap(this).getEventBusArn()

    override fun eventBusName(): String = unwrap(this).getEventBusName()

    override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

    override fun grantPutEventsTo(arg0: IGrantable): Grant =
        unwrap(this).grantPutEventsTo(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IEventBus): IEventBus =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventBus): software.amazon.awscdk.services.events.IEventBus =
        (wrapped as Wrapper).cdkObject
  }
}
