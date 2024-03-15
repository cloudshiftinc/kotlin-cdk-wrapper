@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLogDeliveryConfigurationProps {
  public fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun logConfigurations(logConfigurations: IResolvable)

    public fun logConfigurations(logConfigurations: List<Any>)

    public fun logConfigurations(vararg logConfigurations: Any)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.Builder =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.builder()

    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable::unwrap))
    }

    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations)
    }

    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps,
  ) : CdkObject(cdkObject), CfnLogDeliveryConfigurationProps {
    override fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogDeliveryConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps):
        CfnLogDeliveryConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogDeliveryConfigurationProps):
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps
  }
}
