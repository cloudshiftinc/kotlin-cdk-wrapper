@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnADMChannelProps {
  public fun applicationId(): String

  public fun clientId(): String

  public fun clientSecret(): String

  public fun enabled(): Any? = unwrap(this).getEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnADMChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps,
  ) : CdkObject(cdkObject), CfnADMChannelProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): String = unwrap(this).getClientSecret()

    override fun enabled(): Any? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnADMChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps):
        CfnADMChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnADMChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnADMChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
  }
}
