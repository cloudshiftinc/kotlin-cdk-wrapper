@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoggingConfigurationProps {
  public fun logDestinationConfigs(): List<String>

  public fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

  public fun redactedFields(): Any? = unwrap(this).getRedactedFields()

  public fun resourceArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun logDestinationConfigs(logDestinationConfigs: List<String>)

    public fun logDestinationConfigs(vararg logDestinationConfigs: String)

    public fun loggingFilter(loggingFilter: Any)

    public fun redactedFields(redactedFields: IResolvable)

    public fun redactedFields(redactedFields: List<Any>)

    public fun redactedFields(vararg redactedFields: Any)

    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.builder()

    override fun logDestinationConfigs(logDestinationConfigs: List<String>) {
      cdkBuilder.logDestinationConfigs(logDestinationConfigs)
    }

    override fun logDestinationConfigs(vararg logDestinationConfigs: String): Unit =
        logDestinationConfigs(logDestinationConfigs.toList())

    override fun loggingFilter(loggingFilter: Any) {
      cdkBuilder.loggingFilter(loggingFilter)
    }

    override fun redactedFields(redactedFields: IResolvable) {
      cdkBuilder.redactedFields(redactedFields.let(IResolvable::unwrap))
    }

    override fun redactedFields(redactedFields: List<Any>) {
      cdkBuilder.redactedFields(redactedFields)
    }

    override fun redactedFields(vararg redactedFields: Any): Unit =
        redactedFields(redactedFields.toList())

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps,
  ) : CdkObject(cdkObject), CfnLoggingConfigurationProps {
    override fun logDestinationConfigs(): List<String> = unwrap(this).getLogDestinationConfigs()

    override fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

    override fun redactedFields(): Any? = unwrap(this).getRedactedFields()

    override fun resourceArn(): String = unwrap(this).getResourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps):
        CfnLoggingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfigurationProps):
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps
  }
}
