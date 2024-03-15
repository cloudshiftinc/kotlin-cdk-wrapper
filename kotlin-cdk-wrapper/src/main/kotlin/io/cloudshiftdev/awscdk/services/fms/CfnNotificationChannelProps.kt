@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnNotificationChannelProps {
  public fun snsRoleName(): String

  public fun snsTopicArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun snsRoleName(snsRoleName: String)

    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnNotificationChannelProps.Builder
        = software.amazon.awscdk.services.fms.CfnNotificationChannelProps.builder()

    override fun snsRoleName(snsRoleName: String) {
      cdkBuilder.snsRoleName(snsRoleName)
    }

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): software.amazon.awscdk.services.fms.CfnNotificationChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannelProps,
  ) : CdkObject(cdkObject), CfnNotificationChannelProps {
    override fun snsRoleName(): String = unwrap(this).getSnsRoleName()

    override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannelProps):
        CfnNotificationChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationChannelProps):
        software.amazon.awscdk.services.fms.CfnNotificationChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnNotificationChannelProps
  }
}
