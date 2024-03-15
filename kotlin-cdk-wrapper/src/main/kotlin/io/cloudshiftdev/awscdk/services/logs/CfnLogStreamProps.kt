@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLogStreamProps {
  public fun logGroupName(): String

  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  @CdkDslMarker
  public interface Builder {
    public fun logGroupName(logGroupName: String)

    public fun logStreamName(logStreamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder =
        software.amazon.awscdk.services.logs.CfnLogStreamProps.builder()

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnLogStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnLogStreamProps,
  ) : CdkObject(cdkObject), CfnLogStreamProps {
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    override fun logStreamName(): String? = unwrap(this).getLogStreamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogStreamProps):
        CfnLogStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogStreamProps):
        software.amazon.awscdk.services.logs.CfnLogStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CfnLogStreamProps
  }
}
