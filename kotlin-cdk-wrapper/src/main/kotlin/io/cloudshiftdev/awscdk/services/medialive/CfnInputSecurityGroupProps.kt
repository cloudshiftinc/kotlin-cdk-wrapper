@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

public interface CfnInputSecurityGroupProps {
  public fun tags(): Any? = unwrap(this).getTags()

  public fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()

  @CdkDslMarker
  public interface Builder {
    public fun tags(tags: Any)

    public fun whitelistRules(whitelistRules: IResolvable)

    public fun whitelistRules(whitelistRules: List<Any>)

    public fun whitelistRules(vararg whitelistRules: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps.Builder =
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps.builder()

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun whitelistRules(whitelistRules: IResolvable) {
      cdkBuilder.whitelistRules(whitelistRules.let(IResolvable::unwrap))
    }

    override fun whitelistRules(whitelistRules: List<Any>) {
      cdkBuilder.whitelistRules(whitelistRules)
    }

    override fun whitelistRules(vararg whitelistRules: Any): Unit =
        whitelistRules(whitelistRules.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnInputSecurityGroupProps {
    override fun tags(): Any? = unwrap(this).getTags()

    override fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps):
        CfnInputSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInputSecurityGroupProps):
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps
  }
}
