@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWebACLProps {
  public fun defaultAction(): Any

  public fun metricName(): String

  public fun name(): String

  public fun rules(): Any? = unwrap(this).getRules()

  @CdkDslMarker
  public interface Builder {
    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16110417c347210d7a02fb826a0f53032171075764564d7d670fd6a25c8e0c12")
    public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty.Builder.() -> Unit)

    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.waf.CfnWebACLProps.builder()

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: CfnWebACL.WafActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.WafActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16110417c347210d7a02fb826a0f53032171075764564d7d670fd6a25c8e0c12")
    override fun defaultAction(defaultAction: CfnWebACL.WafActionProperty.Builder.() -> Unit): Unit
        = defaultAction(CfnWebACL.WafActionProperty(defaultAction))

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnWebACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACLProps,
  ) : CdkObject(cdkObject), CfnWebACLProps {
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun name(): String = unwrap(this).getName()

    override fun rules(): Any? = unwrap(this).getRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACLProps): CfnWebACLProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps): software.amazon.awscdk.services.waf.CfnWebACLProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnWebACLProps
  }
}
