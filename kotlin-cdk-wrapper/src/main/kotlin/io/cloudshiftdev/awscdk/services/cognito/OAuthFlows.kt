@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface OAuthFlows {
  public fun authorizationCodeGrant(): Boolean? = unwrap(this).getAuthorizationCodeGrant()

  public fun clientCredentials(): Boolean? = unwrap(this).getClientCredentials()

  public fun implicitCodeGrant(): Boolean? = unwrap(this).getImplicitCodeGrant()

  @CdkDslMarker
  public interface Builder {
    public fun authorizationCodeGrant(authorizationCodeGrant: Boolean)

    public fun clientCredentials(clientCredentials: Boolean)

    public fun implicitCodeGrant(implicitCodeGrant: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OAuthFlows.Builder =
        software.amazon.awscdk.services.cognito.OAuthFlows.builder()

    override fun authorizationCodeGrant(authorizationCodeGrant: Boolean) {
      cdkBuilder.authorizationCodeGrant(authorizationCodeGrant)
    }

    override fun clientCredentials(clientCredentials: Boolean) {
      cdkBuilder.clientCredentials(clientCredentials)
    }

    override fun implicitCodeGrant(implicitCodeGrant: Boolean) {
      cdkBuilder.implicitCodeGrant(implicitCodeGrant)
    }

    public fun build(): software.amazon.awscdk.services.cognito.OAuthFlows = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows,
  ) : CdkObject(cdkObject), OAuthFlows {
    override fun authorizationCodeGrant(): Boolean? = unwrap(this).getAuthorizationCodeGrant()

    override fun clientCredentials(): Boolean? = unwrap(this).getClientCredentials()

    override fun implicitCodeGrant(): Boolean? = unwrap(this).getImplicitCodeGrant()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthFlows {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows): OAuthFlows =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthFlows): software.amazon.awscdk.services.cognito.OAuthFlows =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.OAuthFlows
  }
}
