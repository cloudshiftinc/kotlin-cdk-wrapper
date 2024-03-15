@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnContactProps {
  public fun alias(): String

  public fun displayName(): String

  public fun plan(): Any? = unwrap(this).getPlan()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun alias(alias: String)

    public fun displayName(displayName: String)

    public fun plan(plan: IResolvable)

    public fun plan(plan: List<Any>)

    public fun plan(vararg plan: Any)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContactProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactProps.builder()

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun plan(plan: IResolvable) {
      cdkBuilder.plan(plan.let(IResolvable::unwrap))
    }

    override fun plan(plan: List<Any>) {
      cdkBuilder.plan(plan)
    }

    override fun plan(vararg plan: Any): Unit = plan(plan.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactProps,
  ) : CdkObject(cdkObject), CfnContactProps {
    override fun alias(): String = unwrap(this).getAlias()

    override fun displayName(): String = unwrap(this).getDisplayName()

    override fun plan(): Any? = unwrap(this).getPlan()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactProps):
        CfnContactProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactProps):
        software.amazon.awscdk.services.ssmcontacts.CfnContactProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnContactProps
  }
}
