@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnAPNSSandboxChannelProps {
  public fun applicationId(): String

  public fun bundleId(): String? = unwrap(this).getBundleId()

  public fun certificate(): String? = unwrap(this).getCertificate()

  public fun defaultAuthenticationMethod(): String? = unwrap(this).getDefaultAuthenticationMethod()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun privateKey(): String? = unwrap(this).getPrivateKey()

  public fun teamId(): String? = unwrap(this).getTeamId()

  public fun tokenKey(): String? = unwrap(this).getTokenKey()

  public fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun bundleId(bundleId: String)

    public fun certificate(certificate: String)

    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun privateKey(privateKey: String)

    public fun teamId(teamId: String)

    public fun tokenKey(tokenKey: String)

    public fun tokenKeyId(tokenKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    override fun tokenKey(tokenKey: String) {
      cdkBuilder.tokenKey(tokenKey)
    }

    override fun tokenKeyId(tokenKeyId: String) {
      cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps,
  ) : CdkObject(cdkObject), CfnAPNSSandboxChannelProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun bundleId(): String? = unwrap(this).getBundleId()

    override fun certificate(): String? = unwrap(this).getCertificate()

    override fun defaultAuthenticationMethod(): String? =
        unwrap(this).getDefaultAuthenticationMethod()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    override fun teamId(): String? = unwrap(this).getTeamId()

    override fun tokenKey(): String? = unwrap(this).getTokenKey()

    override fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAPNSSandboxChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps):
        CfnAPNSSandboxChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAPNSSandboxChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
  }
}
