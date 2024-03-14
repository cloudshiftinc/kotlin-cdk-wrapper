package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.CfnRule,
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

  public interface Builder {
    public fun metricName(metricName: String) {
    }

    public fun name(name: String) {
    }

    public fun predicates(predicates: IResolvable) {
    }

    public fun predicates(predicates: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnRule.Builder =
        software.amazon.awscdk.services.waf.CfnRule.Builder.create(scope, id)

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun predicates(predicates: IResolvable) {
      cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
    }

    public override fun predicates(predicates: List<Any>) {
      cdkBuilder.predicates(predicates)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.waf.CfnRule =
        wrapped.cdkObject
  }

  public interface PredicateProperty {
    public fun dataId(): String

    public fun negated(): Any

    public fun type(): String

    public interface Builder {
      public fun dataId(dataId: String) {
      }

      public fun negated(negated: Boolean) {
      }

      public fun negated(negated: IResolvable) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder
          = software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.builder()

      public override fun dataId(dataId: String) {
        cdkBuilder.dataId(dataId)
      }

      public override fun negated(negated: Boolean) {
        cdkBuilder.negated(negated)
      }

      public override fun negated(negated: IResolvable) {
        cdkBuilder.negated(negated.let(IResolvable::unwrap))
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnRule.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty,
    ) : PredicateProperty {
      public override fun dataId(): String = unwrap(this).getDataId()

      public override fun negated(): Any = unwrap(this).getNegated()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.waf.CfnRule.PredicateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
