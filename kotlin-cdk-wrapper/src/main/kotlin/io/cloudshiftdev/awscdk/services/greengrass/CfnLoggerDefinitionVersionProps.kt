@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoggerDefinitionVersionProps {
  public fun loggerDefinitionId(): String

  public fun loggers(): Any

  @CdkDslMarker
  public interface Builder {
    public fun loggerDefinitionId(loggerDefinitionId: String)

    public fun loggers(loggers: IResolvable)

    public fun loggers(loggers: List<Any>)

    public fun loggers(vararg loggers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.builder()

    override fun loggerDefinitionId(loggerDefinitionId: String) {
      cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    override fun loggers(loggers: IResolvable) {
      cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
    }

    override fun loggers(loggers: List<Any>) {
      cdkBuilder.loggers(loggers)
    }

    override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnLoggerDefinitionVersionProps {
    override fun loggerDefinitionId(): String = unwrap(this).getLoggerDefinitionId()

    override fun loggers(): Any = unwrap(this).getLoggers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggerDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps):
        CfnLoggerDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
  }
}
