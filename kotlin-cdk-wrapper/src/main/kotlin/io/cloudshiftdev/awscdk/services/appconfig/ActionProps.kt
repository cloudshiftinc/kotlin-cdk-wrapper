@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ActionProps {
  public fun actionPoints(): List<ActionPoint>

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventDestination(): IEventDestination

  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun invokeWithoutExecutionRole(): Boolean? = unwrap(this).getInvokeWithoutExecutionRole()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
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
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ActionProps.Builder =
        software.amazon.awscdk.services.appconfig.ActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.appconfig.ActionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ActionProps,
  ) : CdkObject(cdkObject), ActionProps {
    override fun actionPoints(): List<ActionPoint> =
        unwrap(this).getActionPoints().map(ActionPoint::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventDestination(): IEventDestination =
        unwrap(this).getEventDestination().let(IEventDestination::wrap)

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun invokeWithoutExecutionRole(): Boolean? =
        unwrap(this).getInvokeWithoutExecutionRole()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ActionProps): ActionProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionProps): software.amazon.awscdk.services.appconfig.ActionProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ActionProps
  }
}
