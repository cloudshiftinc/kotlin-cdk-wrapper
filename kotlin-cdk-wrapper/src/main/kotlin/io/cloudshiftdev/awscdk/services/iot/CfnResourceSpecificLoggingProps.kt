@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResourceSpecificLoggingProps {
  public fun logLevel(): String

  public fun targetName(): String

  public fun targetType(): String

  @CdkDslMarker
  public interface Builder {
    public fun logLevel(logLevel: String)

    public fun targetName(targetName: String)

    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.Builder =
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.builder()

    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    override fun targetName(targetName: String) {
      cdkBuilder.targetName(targetName)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps,
  ) : CdkObject(cdkObject), CfnResourceSpecificLoggingProps {
    override fun logLevel(): String = unwrap(this).getLogLevel()

    override fun targetName(): String = unwrap(this).getTargetName()

    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSpecificLoggingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps):
        CfnResourceSpecificLoggingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSpecificLoggingProps):
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
  }
}
