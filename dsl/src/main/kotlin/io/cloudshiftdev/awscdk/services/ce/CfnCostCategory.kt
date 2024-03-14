package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCostCategory internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrEffectiveStart(): String = unwrap(this).getAttrEffectiveStart()

  public open fun defaultValue(): String? = unwrap(this).getDefaultValue()

  public open fun defaultValue(`value`: String) {
    unwrap(this).setDefaultValue(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ruleVersion(): String = unwrap(this).getRuleVersion()

  public open fun ruleVersion(`value`: String) {
    unwrap(this).setRuleVersion(`value`)
  }

  public open fun rules(): String = unwrap(this).getRules()

  public open fun rules(`value`: String) {
    unwrap(this).setRules(`value`)
  }

  public open fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()

  public open fun splitChargeRules(`value`: String) {
    unwrap(this).setSplitChargeRules(`value`)
  }

  public interface Builder {
    public fun defaultValue(defaultValue: String) {
    }

    public fun name(name: String) {
    }

    public fun ruleVersion(ruleVersion: String) {
    }

    public fun rules(rules: String) {
    }

    public fun splitChargeRules(splitChargeRules: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnCostCategory.Builder =
        software.amazon.awscdk.services.ce.CfnCostCategory.Builder.create(scope, id)

    public override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun ruleVersion(ruleVersion: String) {
      cdkBuilder.ruleVersion(ruleVersion)
    }

    public override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    public override fun splitChargeRules(splitChargeRules: String) {
      cdkBuilder.splitChargeRules(splitChargeRules)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnCostCategory = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCostCategory {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCostCategory(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory):
        CfnCostCategory = CfnCostCategory(cdkObject)

    internal fun unwrap(wrapped: CfnCostCategory):
        software.amazon.awscdk.services.ce.CfnCostCategory = wrapped.cdkObject
  }
}
