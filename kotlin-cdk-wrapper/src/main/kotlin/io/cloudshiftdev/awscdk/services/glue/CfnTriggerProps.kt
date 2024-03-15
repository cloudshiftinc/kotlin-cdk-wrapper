@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTriggerProps {
  public fun actions(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

  public fun name(): String? = unwrap(this).getName()

  public fun predicate(): Any? = unwrap(this).getPredicate()

  public fun schedule(): String? = unwrap(this).getSchedule()

  public fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun type(): String

  public fun workflowName(): String? = unwrap(this).getWorkflowName()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun description(description: String)

    public fun eventBatchingCondition(eventBatchingCondition: IResolvable)

    public
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02e560aac5c407e456caac23c669aa9834fb2e25630d05ebed6dda10988385c6")
    public
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun predicate(predicate: IResolvable)

    public fun predicate(predicate: CfnTrigger.PredicateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6d6adc057a35bac1c43cc52cced224ec25554ec2afcf0f7415fccf2cbb18cf0")
    public fun predicate(predicate: CfnTrigger.PredicateProperty.Builder.() -> Unit)

    public fun schedule(schedule: String)

    public fun startOnCreation(startOnCreation: Boolean)

    public fun startOnCreation(startOnCreation: IResolvable)

    public fun tags(tags: Any)

    public fun type(type: String)

    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTriggerProps.Builder =
        software.amazon.awscdk.services.glue.CfnTriggerProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBatchingCondition(eventBatchingCondition: IResolvable) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(IResolvable::unwrap))
    }

    override
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(CfnTrigger.EventBatchingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02e560aac5c407e456caac23c669aa9834fb2e25630d05ebed6dda10988385c6")
    override
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit):
        Unit =
        eventBatchingCondition(CfnTrigger.EventBatchingConditionProperty(eventBatchingCondition))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun predicate(predicate: IResolvable) {
      cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
    }

    override fun predicate(predicate: CfnTrigger.PredicateProperty) {
      cdkBuilder.predicate(predicate.let(CfnTrigger.PredicateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6d6adc057a35bac1c43cc52cced224ec25554ec2afcf0f7415fccf2cbb18cf0")
    override fun predicate(predicate: CfnTrigger.PredicateProperty.Builder.() -> Unit): Unit =
        predicate(CfnTrigger.PredicateProperty(predicate))

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun startOnCreation(startOnCreation: Boolean) {
      cdkBuilder.startOnCreation(startOnCreation)
    }

    override fun startOnCreation(startOnCreation: IResolvable) {
      cdkBuilder.startOnCreation(startOnCreation.let(IResolvable::unwrap))
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTriggerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnTriggerProps,
  ) : CdkObject(cdkObject), CfnTriggerProps {
    override fun actions(): Any = unwrap(this).getActions()

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

    override fun name(): String? = unwrap(this).getName()

    override fun predicate(): Any? = unwrap(this).getPredicate()

    override fun schedule(): String? = unwrap(this).getSchedule()

    override fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun type(): String = unwrap(this).getType()

    override fun workflowName(): String? = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTriggerProps):
        CfnTriggerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTriggerProps):
        software.amazon.awscdk.services.glue.CfnTriggerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnTriggerProps
  }
}
