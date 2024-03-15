@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventBusName(): String? = unwrap(this).getEventBusName()

  public fun eventPattern(): Any? = unwrap(this).getEventPattern()

  public fun name(): String? = unwrap(this).getName()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  public fun state(): String? = unwrap(this).getState()

  public fun targets(): Any? = unwrap(this).getTargets()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventBusName(eventBusName: String)

    public fun eventPattern(eventPattern: Any)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun state(state: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnRuleProps.Builder =
        software.amazon.awscdk.services.events.CfnRuleProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    override fun eventPattern(): Any? = unwrap(this).getEventPattern()

    override fun name(): String? = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    override fun state(): String? = unwrap(this).getState()

    override fun targets(): Any? = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRuleProps): CfnRuleProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.services.events.CfnRuleProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnRuleProps
  }
}
