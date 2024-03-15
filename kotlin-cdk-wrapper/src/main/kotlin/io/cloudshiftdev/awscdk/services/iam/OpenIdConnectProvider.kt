@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OpenIdConnectProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProvider,
) : Resource(cdkObject), IOpenIdConnectProvider {
  public override fun openIdConnectProviderArn(): String =
      unwrap(this).getOpenIdConnectProviderArn()

  public override fun openIdConnectProviderIssuer(): String =
      unwrap(this).getOpenIdConnectProviderIssuer()

  public open fun openIdConnectProviderthumbprints(): String =
      unwrap(this).getOpenIdConnectProviderthumbprints()

  @CdkDslMarker
  public interface Builder {
    public fun clientIds(clientIds: List<String>)

    public fun clientIds(vararg clientIds: String)

    public fun thumbprints(thumbprints: List<String>)

    public fun thumbprints(vararg thumbprints: String)

    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.OpenIdConnectProvider.Builder =
        software.amazon.awscdk.services.iam.OpenIdConnectProvider.Builder.create(scope, id)

    override fun clientIds(clientIds: List<String>) {
      cdkBuilder.clientIds(clientIds)
    }

    override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

    override fun thumbprints(thumbprints: List<String>) {
      cdkBuilder.thumbprints(thumbprints)
    }

    override fun thumbprints(vararg thumbprints: String): Unit = thumbprints(thumbprints.toList())

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.OpenIdConnectProvider =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromOpenIdConnectProviderArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      openIdConnectProviderArn: String,
    ): IOpenIdConnectProvider =
        software.amazon.awscdk.services.iam.OpenIdConnectProvider.fromOpenIdConnectProviderArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, openIdConnectProviderArn).let(IOpenIdConnectProvider::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OpenIdConnectProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OpenIdConnectProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProvider):
        OpenIdConnectProvider = OpenIdConnectProvider(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProvider):
        software.amazon.awscdk.services.iam.OpenIdConnectProvider = wrapped.cdkObject
  }
}
