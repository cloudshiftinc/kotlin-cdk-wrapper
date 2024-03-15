@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CloudFrontWebDistributionAttributes {
  public fun distributionId(): String

  public fun domainName(): String

  @CdkDslMarker
  public interface Builder {
    public fun distributionId(distributionId: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes.builder()

    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes,
  ) : CdkObject(cdkObject), CloudFrontWebDistributionAttributes {
    override fun distributionId(): String = unwrap(this).getDistributionId()

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFrontWebDistributionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes):
        CloudFrontWebDistributionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFrontWebDistributionAttributes):
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes
  }
}
