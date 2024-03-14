package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRateBasedRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

  public open fun matchPredicates(`value`: IResolvable) {
    unwrap(this).setMatchPredicates(`value`.let(IResolvable::unwrap))
  }

  public open fun matchPredicates(__idx_ac66f0: List<Any>) {
    unwrap(this).setMatchPredicates(__idx_ac66f0)
  }

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rateKey(): String = unwrap(this).getRateKey()

  public open fun rateKey(`value`: String) {
    unwrap(this).setRateKey(`value`)
  }

  public open fun rateLimit(): Number = unwrap(this).getRateLimit()

  public open fun rateLimit(`value`: Number) {
    unwrap(this).setRateLimit(`value`)
  }

  public interface Builder {
    public fun matchPredicates(matchPredicates: IResolvable) {
    }

    public fun matchPredicates(matchPredicates: List<Any>) {
    }

    public fun metricName(metricName: String) {
    }

    public fun name(name: String) {
    }

    public fun rateKey(rateKey: String) {
    }

    public fun rateLimit(rateLimit: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder.create(scope, id)

    public override fun matchPredicates(matchPredicates: IResolvable) {
      cdkBuilder.matchPredicates(matchPredicates.let(IResolvable::unwrap))
    }

    public override fun matchPredicates(matchPredicates: List<Any>) {
      cdkBuilder.matchPredicates(matchPredicates)
    }

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun rateKey(rateKey: String) {
      cdkBuilder.rateKey(rateKey)
    }

    public override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRateBasedRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRateBasedRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRateBasedRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule):
        CfnRateBasedRule = CfnRateBasedRule(cdkObject)

    internal fun unwrap(wrapped: CfnRateBasedRule):
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRule = wrapped.cdkObject
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
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty,
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

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
