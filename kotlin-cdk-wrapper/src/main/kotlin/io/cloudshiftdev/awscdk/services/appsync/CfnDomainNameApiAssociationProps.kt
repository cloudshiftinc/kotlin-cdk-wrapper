@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDomainNameApiAssociationProps {
  public fun apiId(): String

  public fun domainName(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps,
  ) : CdkObject(cdkObject), CfnDomainNameApiAssociationProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameApiAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps):
        CfnDomainNameApiAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameApiAssociationProps):
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps
  }
}
