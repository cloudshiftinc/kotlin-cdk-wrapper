@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DomainNameAttributes {
  public fun domainName(): String

  public fun domainNameAliasHostedZoneId(): String

  public fun domainNameAliasTarget(): String

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String)

    public fun domainNameAliasTarget(domainNameAliasTarget: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameAttributes.Builder
        = software.amazon.awscdk.services.apigateway.DomainNameAttributes.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String) {
      cdkBuilder.domainNameAliasHostedZoneId(domainNameAliasHostedZoneId)
    }

    override fun domainNameAliasTarget(domainNameAliasTarget: String) {
      cdkBuilder.domainNameAliasTarget(domainNameAliasTarget)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes,
  ) : CdkObject(cdkObject), DomainNameAttributes {
    override fun domainName(): String = unwrap(this).getDomainName()

    override fun domainNameAliasHostedZoneId(): String =
        unwrap(this).getDomainNameAliasHostedZoneId()

    override fun domainNameAliasTarget(): String = unwrap(this).getDomainNameAliasTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes):
        DomainNameAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameAttributes):
        software.amazon.awscdk.services.apigateway.DomainNameAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DomainNameAttributes
  }
}
