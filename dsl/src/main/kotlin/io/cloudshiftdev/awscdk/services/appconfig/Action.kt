package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class Action internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Action,
) {
  public open fun actionPoints(): List<ActionPoint> =
      unwrap(this).getActionPoints().map(ActionPoint::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun eventDestination(): IEventDestination =
      unwrap(this).getEventDestination().let(IEventDestination::wrap)

  public open fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public open fun invokeWithoutExecutionRole(): Boolean? =
      unwrap(this).getInvokeWithoutExecutionRole()

  public open fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun actionPoints(actionPoints: List<ActionPoint>)

    public fun actionPoints(vararg actionPoints: ActionPoint)

    public fun description(description: String)

    public fun eventDestination(eventDestination: IEventDestination)

    public fun executionRole(executionRole: IRole)

    public fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Action.Builder =
        software.amazon.awscdk.services.appconfig.Action.Builder.create()

    override fun actionPoints(actionPoints: List<ActionPoint>) {
      cdkBuilder.actionPoints(actionPoints.map(ActionPoint::unwrap))
    }

    override fun actionPoints(vararg actionPoints: ActionPoint): Unit =
        actionPoints(actionPoints.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventDestination(eventDestination: IEventDestination) {
      cdkBuilder.eventDestination(eventDestination.let(IEventDestination::unwrap))
    }

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean) {
      cdkBuilder.invokeWithoutExecutionRole(invokeWithoutExecutionRole)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.Action = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Action {
      val builderImpl = BuilderImpl()
      return Action(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Action): Action =
        Action(cdkObject)

    internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.appconfig.Action =
        wrapped.cdkObject
  }
}
