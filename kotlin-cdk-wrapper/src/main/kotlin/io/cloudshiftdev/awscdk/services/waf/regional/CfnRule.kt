@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun predicates(): Any? = unwrap(this).getPredicates()

  public open fun predicates(`value`: IResolvable) {
    unwrap(this).setPredicates(`value`.let(IResolvable::unwrap))
  }

  public open fun predicates(__idx_ac66f0: List<Any>) {
    unwrap(this).setPredicates(__idx_ac66f0)
  }

  public open fun predicates(vararg __idx_ac66f0: Any): Unit = predicates(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun predicates(predicates: IResolvable)

    public fun predicates(predicates: List<Any>)

    public fun predicates(vararg predicates: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRule.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRule.Builder.create(scope, id)

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun predicates(predicates: IResolvable) {
      cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
    }

    override fun predicates(predicates: List<Any>) {
      cdkBuilder.predicates(predicates)
    }

    override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.waf.regional.CfnRule =
        wrapped.cdkObject
  }

  public interface PredicateProperty {
    public fun dataId(): String

    public fun negated(): Any

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun dataId(dataId: String)

      public fun negated(negated: Boolean)

      public fun negated(negated: IResolvable)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.builder()

      override fun dataId(dataId: String) {
        cdkBuilder.dataId(dataId)
      }

      override fun negated(negated: Boolean) {
        cdkBuilder.negated(negated)
      }

      override fun negated(negated: IResolvable) {
        cdkBuilder.negated(negated.let(IResolvable::unwrap))
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty,
    ) : CdkObject(cdkObject), PredicateProperty {
      override fun dataId(): String = unwrap(this).getDataId()

      override fun negated(): Any = unwrap(this).getNegated()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty
    }
  }
}
