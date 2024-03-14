package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrigger internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  public open fun actions(vararg __idx_ac66f0: Any): Unit = actions(__idx_ac66f0.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

  public open fun eventBatchingCondition(`value`: IResolvable) {
    unwrap(this).setEventBatchingCondition(`value`.let(IResolvable::unwrap))
  }

  public open fun eventBatchingCondition(`value`: EventBatchingConditionProperty) {
    unwrap(this).setEventBatchingCondition(`value`.let(EventBatchingConditionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3805b8102585a0b00724653340e1533f283c30872821ec2dbcf1164affdccc22")
  public open
      fun eventBatchingCondition(`value`: EventBatchingConditionProperty.Builder.() -> Unit): Unit =
      eventBatchingCondition(EventBatchingConditionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun predicate(): Any? = unwrap(this).getPredicate()

  public open fun predicate(`value`: IResolvable) {
    unwrap(this).setPredicate(`value`.let(IResolvable::unwrap))
  }

  public open fun predicate(`value`: PredicateProperty) {
    unwrap(this).setPredicate(`value`.let(PredicateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3e1c423dcfb6c1c880205abf7fe6c49b084192461d25f3ab2f32db63dbd1d08")
  public open fun predicate(`value`: PredicateProperty.Builder.() -> Unit): Unit =
      predicate(PredicateProperty(`value`))

  public open fun schedule(): String? = unwrap(this).getSchedule()

  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  public open fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

  public open fun startOnCreation(`value`: Boolean) {
    unwrap(this).setStartOnCreation(`value`)
  }

  public open fun startOnCreation(`value`: IResolvable) {
    unwrap(this).setStartOnCreation(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun workflowName(): String? = unwrap(this).getWorkflowName()

  public open fun workflowName(`value`: String) {
    unwrap(this).setWorkflowName(`value`)
  }

  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun description(description: String)

    public fun eventBatchingCondition(eventBatchingCondition: IResolvable)

    public fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7278c0637d7ff3a0fce804c7246b18af2dbe03cc954e7a2baff78791cf900b47")
    public
        fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun predicate(predicate: IResolvable)

    public fun predicate(predicate: PredicateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbcadeabe28dcb7d3e5fdda448dd4d3bd87ce8fb1a70b9ca1c8c3e294d2a844c")
    public fun predicate(predicate: PredicateProperty.Builder.() -> Unit)

    public fun schedule(schedule: String)

    public fun startOnCreation(startOnCreation: Boolean)

    public fun startOnCreation(startOnCreation: IResolvable)

    public fun tags(tags: Any)

    public fun type(type: String)

    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTrigger.Builder =
        software.amazon.awscdk.services.glue.CfnTrigger.Builder.create(scope, id)

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

    override fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(EventBatchingConditionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7278c0637d7ff3a0fce804c7246b18af2dbe03cc954e7a2baff78791cf900b47")
    override
        fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty.Builder.() -> Unit):
        Unit = eventBatchingCondition(EventBatchingConditionProperty(eventBatchingCondition))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun predicate(predicate: IResolvable) {
      cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
    }

    override fun predicate(predicate: PredicateProperty) {
      cdkBuilder.predicate(predicate.let(PredicateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbcadeabe28dcb7d3e5fdda448dd4d3bd87ce8fb1a70b9ca1c8c3e294d2a844c")
    override fun predicate(predicate: PredicateProperty.Builder.() -> Unit): Unit =
        predicate(PredicateProperty(predicate))

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

    public fun build(): software.amazon.awscdk.services.glue.CfnTrigger = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrigger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger): CfnTrigger =
        CfnTrigger(cdkObject)

    internal fun unwrap(wrapped: CfnTrigger): software.amazon.awscdk.services.glue.CfnTrigger =
        wrapped.cdkObject
  }

  public interface ActionProperty {
    public fun arguments(): Any? = unwrap(this).getArguments()

    public fun crawlerName(): String? = unwrap(this).getCrawlerName()

    public fun jobName(): String? = unwrap(this).getJobName()

    public fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

    public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    public fun timeout(): Number? = unwrap(this).getTimeout()

    public interface Builder {
      public fun arguments(arguments: Any)

      public fun crawlerName(crawlerName: String)

      public fun jobName(jobName: String)

      public fun notificationProperty(notificationProperty: IResolvable)

      public fun notificationProperty(notificationProperty: NotificationPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67d942a337878632a7155a8861a9d8ba5da45d910ab542bc94aa976aff03c77f")
      public
          fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit)

      public fun securityConfiguration(securityConfiguration: String)

      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty.Builder
          = software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty.builder()

      override fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
      }

      override fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
      }

      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      override fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty.let(IResolvable::unwrap))
      }

      override fun notificationProperty(notificationProperty: NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty.let(NotificationPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67d942a337878632a7155a8861a9d8ba5da45d910ab542bc94aa976aff03c77f")
      override
          fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit):
          Unit = notificationProperty(NotificationPropertyProperty(notificationProperty))

      override fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
      }

      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty,
    ) : ActionProperty {
      override fun arguments(): Any? = unwrap(this).getArguments()

      override fun crawlerName(): String? = unwrap(this).getCrawlerName()

      override fun jobName(): String? = unwrap(this).getJobName()

      override fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

      override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventBatchingConditionProperty {
    public fun batchSize(): Number

    public fun batchWindow(): Number? = unwrap(this).getBatchWindow()

    public interface Builder {
      public fun batchSize(batchSize: Number)

      public fun batchWindow(batchWindow: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty.builder()

      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      override fun batchWindow(batchWindow: Number) {
        cdkBuilder.batchWindow(batchWindow)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty,
    ) : EventBatchingConditionProperty {
      override fun batchSize(): Number = unwrap(this).getBatchSize()

      override fun batchWindow(): Number? = unwrap(this).getBatchWindow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBatchingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty):
          EventBatchingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBatchingConditionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NotificationPropertyProperty {
    public fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()

    public interface Builder {
      public fun notifyDelayAfter(notifyDelayAfter: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty.builder()

      override fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty,
    ) : NotificationPropertyProperty {
      override fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty):
          NotificationPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationPropertyProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PredicateProperty {
    public fun conditions(): Any? = unwrap(this).getConditions()

    public fun logical(): String? = unwrap(this).getLogical()

    public interface Builder {
      public fun conditions(conditions: IResolvable)

      public fun conditions(conditions: List<Any>)

      public fun conditions(vararg conditions: Any)

      public fun logical(logical: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.builder()

      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
      }

      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions)
      }

      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      override fun logical(logical: String) {
        cdkBuilder.logical(logical)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty,
    ) : PredicateProperty {
      override fun conditions(): Any? = unwrap(this).getConditions()

      override fun logical(): String? = unwrap(this).getLogical()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConditionProperty {
    public fun crawlState(): String? = unwrap(this).getCrawlState()

    public fun crawlerName(): String? = unwrap(this).getCrawlerName()

    public fun jobName(): String? = unwrap(this).getJobName()

    public fun logicalOperator(): String? = unwrap(this).getLogicalOperator()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun crawlState(crawlState: String)

      public fun crawlerName(crawlerName: String)

      public fun jobName(jobName: String)

      public fun logicalOperator(logicalOperator: String)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty.builder()

      override fun crawlState(crawlState: String) {
        cdkBuilder.crawlState(crawlState)
      }

      override fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
      }

      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      override fun logicalOperator(logicalOperator: String) {
        cdkBuilder.logicalOperator(logicalOperator)
      }

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty,
    ) : ConditionProperty {
      override fun crawlState(): String? = unwrap(this).getCrawlState()

      override fun crawlerName(): String? = unwrap(this).getCrawlerName()

      override fun jobName(): String? = unwrap(this).getJobName()

      override fun logicalOperator(): String? = unwrap(this).getLogicalOperator()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
