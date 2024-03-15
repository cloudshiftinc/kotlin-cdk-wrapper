@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventBusPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun action(): String? = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun condition(): Any? = unwrap(this).getCondition()

  public open fun condition(`value`: IResolvable) {
    unwrap(this).setCondition(`value`.let(IResolvable::unwrap))
  }

  public open fun condition(`value`: ConditionProperty) {
    unwrap(this).setCondition(`value`.let(ConditionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10cee99f7782d1bba1b99ecf1ad487fe3dfd7fae7c1d07d06dd3c6b683902ee6")
  public open fun condition(`value`: ConditionProperty.Builder.() -> Unit): Unit =
      condition(ConditionProperty(`value`))

  public open fun eventBusName(): String? = unwrap(this).getEventBusName()

  public open fun eventBusName(`value`: String) {
    unwrap(this).setEventBusName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principal(): String? = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public open fun statement(): Any? = unwrap(this).getStatement()

  public open fun statement(`value`: Any) {
    unwrap(this).setStatement(`value`)
  }

  public open fun statementId(): String = unwrap(this).getStatementId()

  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun condition(condition: IResolvable)

    public fun condition(condition: ConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c81da9166694ec5e5051df6657e0f460416690db276f5df54c6b0454046fc8")
    public fun condition(condition: ConditionProperty.Builder.() -> Unit)

    public fun eventBusName(eventBusName: String)

    public fun principal(principal: String)

    public fun statement(statement: Any)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusPolicy.Builder =
        software.amazon.awscdk.services.events.CfnEventBusPolicy.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun condition(condition: IResolvable) {
      cdkBuilder.condition(condition.let(IResolvable::unwrap))
    }

    override fun condition(condition: ConditionProperty) {
      cdkBuilder.condition(condition.let(ConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c81da9166694ec5e5051df6657e0f460416690db276f5df54c6b0454046fc8")
    override fun condition(condition: ConditionProperty.Builder.() -> Unit): Unit =
        condition(ConditionProperty(condition))

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun statement(statement: Any) {
      cdkBuilder.statement(statement)
    }

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnEventBusPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBusPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBusPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy):
        CfnEventBusPolicy = CfnEventBusPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusPolicy):
        software.amazon.awscdk.services.events.CfnEventBusPolicy = wrapped.cdkObject
  }

  public interface ConditionProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder =
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty,
    ) : CdkObject(cdkObject), ConditionProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun type(): String? = unwrap(this).getType()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty
    }
  }
}
