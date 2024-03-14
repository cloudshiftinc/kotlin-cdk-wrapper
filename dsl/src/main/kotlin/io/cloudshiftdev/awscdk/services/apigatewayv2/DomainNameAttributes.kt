package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface DomainNameAttributes {
  public fun name(): String

  public fun regionalDomainName(): String

  public fun regionalHostedZoneId(): String

  public interface Builder {
    public fun name(name: String) {
    }

    public fun regionalDomainName(regionalDomainName: String) {
    }

    public fun regionalHostedZoneId(regionalHostedZoneId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes.builder()

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun regionalDomainName(regionalDomainName: String) {
      cdkBuilder.regionalDomainName(regionalDomainName)
    }

    public override fun regionalHostedZoneId(regionalHostedZoneId: String) {
      cdkBuilder.regionalHostedZoneId(regionalHostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes,
  ) : DomainNameAttributes {
    public override fun name(): String = unwrap(this).getName()

    public override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

    public override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes):
        DomainNameAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameAttributes):
        software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
