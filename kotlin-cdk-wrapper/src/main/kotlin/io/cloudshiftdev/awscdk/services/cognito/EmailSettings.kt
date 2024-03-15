@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EmailSettings {
  public fun from(): String? = unwrap(this).getFrom()

  public fun replyTo(): String? = unwrap(this).getReplyTo()

  @CdkDslMarker
  public interface Builder {
    public fun from(from: String)

    public fun replyTo(replyTo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.EmailSettings.Builder =
        software.amazon.awscdk.services.cognito.EmailSettings.builder()

    override fun from(from: String) {
      cdkBuilder.from(from)
    }

    override fun replyTo(replyTo: String) {
      cdkBuilder.replyTo(replyTo)
    }

    public fun build(): software.amazon.awscdk.services.cognito.EmailSettings = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.EmailSettings,
  ) : CdkObject(cdkObject), EmailSettings {
    override fun from(): String? = unwrap(this).getFrom()

    override fun replyTo(): String? = unwrap(this).getReplyTo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmailSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.EmailSettings):
        EmailSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmailSettings):
        software.amazon.awscdk.services.cognito.EmailSettings = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.EmailSettings
  }
}
