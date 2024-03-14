package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrManagedByFirewallManager(): IResolvable =
      unwrap(this).getAttrManagedByFirewallManager().let(IResolvable::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logDestinationConfigs(): List<String> = unwrap(this).getLogDestinationConfigs()

  public open fun logDestinationConfigs(`value`: List<String>) {
    unwrap(this).setLogDestinationConfigs(`value`)
  }

  public open fun logDestinationConfigs(vararg `value`: String): Unit =
      logDestinationConfigs(`value`.toList())

  public open fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

  public open fun loggingFilter(`value`: Any) {
    unwrap(this).setLoggingFilter(`value`)
  }

  public open fun redactedFields(): Any? = unwrap(this).getRedactedFields()

  public open fun redactedFields(`value`: IResolvable) {
    unwrap(this).setRedactedFields(`value`.let(IResolvable::unwrap))
  }

  public open fun redactedFields(__idx_ac66f0: List<Any>) {
    unwrap(this).setRedactedFields(__idx_ac66f0)
  }

  public open fun redactedFields(vararg __idx_ac66f0: Any): Unit =
      redactedFields(__idx_ac66f0.toList())

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public interface Builder {
    public fun logDestinationConfigs(logDestinationConfigs: List<String>)

    public fun logDestinationConfigs(vararg logDestinationConfigs: String)

    public fun loggingFilter(loggingFilter: Any)

    public fun redactedFields(redactedFields: IResolvable)

    public fun redactedFields(redactedFields: List<Any>)

    public fun redactedFields(vararg redactedFields: Any)

    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder.create(scope, id)

    override fun logDestinationConfigs(logDestinationConfigs: List<String>) {
      cdkBuilder.logDestinationConfigs(logDestinationConfigs)
    }

    override fun logDestinationConfigs(vararg logDestinationConfigs: String): Unit =
        logDestinationConfigs(logDestinationConfigs.toList())

    override fun loggingFilter(loggingFilter: Any) {
      cdkBuilder.loggingFilter(loggingFilter)
    }

    override fun redactedFields(redactedFields: IResolvable) {
      cdkBuilder.redactedFields(redactedFields.let(IResolvable::unwrap))
    }

    override fun redactedFields(redactedFields: List<Any>) {
      cdkBuilder.redactedFields(redactedFields)
    }

    override fun redactedFields(vararg redactedFields: Any): Unit =
        redactedFields(redactedFields.toList())

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration = wrapped.cdkObject
  }

  public interface LabelNameConditionProperty {
    public fun labelName(): String

    public interface Builder {
      public fun labelName(labelName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.builder()

      override fun labelName(labelName: String) {
        cdkBuilder.labelName(labelName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty,
    ) : LabelNameConditionProperty {
      override fun labelName(): String = unwrap(this).getLabelName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelNameConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty):
          LabelNameConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelNameConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun behavior(): String

    public fun conditions(): Any

    public fun requirement(): String

    public interface Builder {
      public fun behavior(behavior: String)

      public fun conditions(conditions: IResolvable)

      public fun conditions(conditions: List<Any>)

      public fun conditions(vararg conditions: Any)

      public fun requirement(requirement: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.builder()

      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
      }

      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions)
      }

      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      override fun requirement(requirement: String) {
        cdkBuilder.requirement(requirement)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty,
    ) : FilterProperty {
      override fun behavior(): String = unwrap(this).getBehavior()

      override fun conditions(): Any = unwrap(this).getConditions()

      override fun requirement(): String = unwrap(this).getRequirement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingFilterProperty {
    public fun defaultBehavior(): String

    public fun filters(): Any

    public interface Builder {
      public fun defaultBehavior(defaultBehavior: String)

      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)

      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.builder()

      override fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
      }

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty,
    ) : LoggingFilterProperty {
      override fun defaultBehavior(): String = unwrap(this).getDefaultBehavior()

      override fun filters(): Any = unwrap(this).getFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty):
          LoggingFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleHeaderProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty,
    ) : SingleHeaderProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionProperty {
    public fun actionCondition(): Any? = unwrap(this).getActionCondition()

    public fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()

    public interface Builder {
      public fun actionCondition(actionCondition: IResolvable)

      public fun actionCondition(actionCondition: ActionConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      public fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit)

      public fun labelNameCondition(labelNameCondition: IResolvable)

      public fun labelNameCondition(labelNameCondition: LabelNameConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      public
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.builder()

      override fun actionCondition(actionCondition: IResolvable) {
        cdkBuilder.actionCondition(actionCondition.let(IResolvable::unwrap))
      }

      override fun actionCondition(actionCondition: ActionConditionProperty) {
        cdkBuilder.actionCondition(actionCondition.let(ActionConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      override fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit):
          Unit = actionCondition(ActionConditionProperty(actionCondition))

      override fun labelNameCondition(labelNameCondition: IResolvable) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(IResolvable::unwrap))
      }

      override fun labelNameCondition(labelNameCondition: LabelNameConditionProperty) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(LabelNameConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      override
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit):
          Unit = labelNameCondition(LabelNameConditionProperty(labelNameCondition))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty,
    ) : ConditionProperty {
      override fun actionCondition(): Any? = unwrap(this).getActionCondition()

      override fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ActionConditionProperty {
    public fun action(): String

    public interface Builder {
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty,
    ) : ActionConditionProperty {
      override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty):
          ActionConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldToMatchProperty {
    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    public fun method(): Any? = unwrap(this).getMethod()

    public fun queryString(): Any? = unwrap(this).getQueryString()

    public fun singleHeader(): Any? = unwrap(this).getSingleHeader()

    public fun uriPath(): Any? = unwrap(this).getUriPath()

    public interface Builder {
      public fun jsonBody(jsonBody: Any)

      public fun method(method: Any)

      public fun queryString(queryString: Any)

      public fun singleHeader(singleHeader: Any)

      public fun uriPath(uriPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.builder()

      override fun jsonBody(jsonBody: Any) {
        cdkBuilder.jsonBody(jsonBody)
      }

      override fun method(method: Any) {
        cdkBuilder.method(method)
      }

      override fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
      }

      override fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
      }

      override fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      override fun method(): Any? = unwrap(this).getMethod()

      override fun queryString(): Any? = unwrap(this).getQueryString()

      override fun singleHeader(): Any? = unwrap(this).getSingleHeader()

      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    public interface Builder {
      public fun all(all: Any)

      public fun includedPaths(includedPaths: List<String>)

      public fun includedPaths(vararg includedPaths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      override fun includedPaths(vararg includedPaths: String): Unit =
          includedPaths(includedPaths.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty,
    ) : MatchPatternProperty {
      override fun all(): Any? = unwrap(this).getAll()

      override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty):
          MatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonBodyProperty {
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    public fun matchPattern(): Any

    public fun matchScope(): String

    public interface Builder {
      public fun invalidFallbackBehavior(invalidFallbackBehavior: String)

      public fun matchPattern(matchPattern: IResolvable)

      public fun matchPattern(matchPattern: MatchPatternProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      public fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.builder()

      override fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
      }

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: MatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(MatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      override fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(MatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty,
    ) : JsonBodyProperty {
      override fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      override fun matchScope(): String = unwrap(this).getMatchScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
