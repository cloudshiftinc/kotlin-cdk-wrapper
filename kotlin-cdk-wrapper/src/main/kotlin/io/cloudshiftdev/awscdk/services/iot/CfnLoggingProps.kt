@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLoggingProps {
  public fun accountId(): String

  public fun defaultLogLevel(): String

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun defaultLogLevel(defaultLogLevel: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnLoggingProps.Builder =
        software.amazon.awscdk.services.iot.CfnLoggingProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun defaultLogLevel(defaultLogLevel: String) {
      cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnLoggingProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnLoggingProps,
  ) : CdkObject(cdkObject), CfnLoggingProps {
    override fun accountId(): String = unwrap(this).getAccountId()

    override fun defaultLogLevel(): String = unwrap(this).getDefaultLogLevel()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnLoggingProps):
        CfnLoggingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingProps):
        software.amazon.awscdk.services.iot.CfnLoggingProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnLoggingProps
  }
}
