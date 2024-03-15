@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAPNSChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun bundleId(): String? = unwrap(this).getBundleId()

  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  public open fun certificate(): String? = unwrap(this).getCertificate()

  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  public open fun defaultAuthenticationMethod(): String? =
      unwrap(this).getDefaultAuthenticationMethod()

  public open fun defaultAuthenticationMethod(`value`: String) {
    unwrap(this).setDefaultAuthenticationMethod(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  public open fun teamId(): String? = unwrap(this).getTeamId()

  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  public open fun tokenKey(): String? = unwrap(this).getTokenKey()

  public open fun tokenKey(`value`: String) {
    unwrap(this).setTokenKey(`value`)
  }

  public open fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()

  public open fun tokenKeyId(`value`: String) {
    unwrap(this).setTokenKeyId(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnAPNSChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAPNSChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAPNSChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel):
        CfnAPNSChannel = CfnAPNSChannel(cdkObject)

    internal fun unwrap(wrapped: CfnAPNSChannel):
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel = wrapped.cdkObject
  }
}
