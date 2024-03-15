@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSessionProps {
  public fun findingPublishingFrequency(): String? = unwrap(this).getFindingPublishingFrequency()

  public fun status(): String? = unwrap(this).getStatus()

  @CdkDslMarker
  public interface Builder {
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnSessionProps.Builder =
        software.amazon.awscdk.services.macie.CfnSessionProps.builder()

    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.macie.CfnSessionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnSessionProps,
  ) : CdkObject(cdkObject), CfnSessionProps {
    override fun findingPublishingFrequency(): String? =
        unwrap(this).getFindingPublishingFrequency()

    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSessionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnSessionProps):
        CfnSessionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSessionProps):
        software.amazon.awscdk.services.macie.CfnSessionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.macie.CfnSessionProps
  }
}
