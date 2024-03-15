@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

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

    public fun defaultAction(defaultAction: CfnWebACL.ActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5596f206e565e857e73f2ed5a5565d71abecdd613c0278a9fc53e353a1c89790")
    public fun defaultAction(defaultAction: CfnWebACL.ActionProperty.Builder.() -> Unit)

    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLProps.builder()

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: CfnWebACL.ActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.ActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5596f206e565e857e73f2ed5a5565d71abecdd613c0278a9fc53e353a1c89790")
    override fun defaultAction(defaultAction: CfnWebACL.ActionProperty.Builder.() -> Unit): Unit =
        defaultAction(CfnWebACL.ActionProperty(defaultAction))

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

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLProps,
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLProps):
        CfnWebACLProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps):
        software.amazon.awscdk.services.waf.regional.CfnWebACLProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnWebACLProps
  }
}
