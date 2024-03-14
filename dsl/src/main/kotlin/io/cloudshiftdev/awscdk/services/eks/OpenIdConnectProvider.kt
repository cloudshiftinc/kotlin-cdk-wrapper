package io.cloudshiftdev.awscdk.services.eks

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OpenIdConnectProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProvider,
) : io.cloudshiftdev.awscdk.services.iam.OpenIdConnectProvider(cdkObject) {
  public interface Builder {
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.OpenIdConnectProvider.Builder =
        software.amazon.awscdk.services.eks.OpenIdConnectProvider.Builder.create(scope, id)

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.eks.OpenIdConnectProvider =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OpenIdConnectProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OpenIdConnectProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProvider):
        OpenIdConnectProvider = OpenIdConnectProvider(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProvider):
        software.amazon.awscdk.services.eks.OpenIdConnectProvider = wrapped.cdkObject
  }
}
