package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CloudFrontWebDistributionAttributes {
  /**
   * The distribution ID for this distribution.
   */
  public fun distributionId(): String

  /**
   * The generated domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
   */
  public fun domainName(): String

  /**
   * A builder for [CloudFrontWebDistributionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param distributionId The distribution ID for this distribution. 
     */
    public fun distributionId(distributionId: String)

    /**
     * @param domainName The generated domain name of the Distribution, such as
     * d111111abcdef8.cloudfront.net. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes.builder()

    /**
     * @param distributionId The distribution ID for this distribution. 
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param domainName The generated domain name of the Distribution, such as
     * d111111abcdef8.cloudfront.net. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes,
  ) : CloudFrontWebDistributionAttributes {
    /**
     * The distribution ID for this distribution.
     */
    override fun distributionId(): String = unwrap(this).getDistributionId()

    /**
     * The generated domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
     */
    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    init {

    }

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
        Wrapper).cdkObject
  }
}
