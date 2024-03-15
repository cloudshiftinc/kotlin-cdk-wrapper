@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResolverQueryLoggingConfigProps {
  public fun destinationArn(): String? = unwrap(this).getDestinationArn()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun destinationArn(destinationArn: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps.builder()

    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps,
  ) : CdkObject(cdkObject), CfnResolverQueryLoggingConfigProps {
    override fun destinationArn(): String? = unwrap(this).getDestinationArn()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverQueryLoggingConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps):
        CfnResolverQueryLoggingConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps
  }
}
