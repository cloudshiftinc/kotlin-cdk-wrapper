@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes used to import a Distribution.
 *
 * Example:
 *
 * ```
 * // Using a reference to an imported Distribution
 * IDistribution distribution = Distribution.fromDistributionAttributes(this, "ImportedDist",
 * DistributionAttributes.builder()
 * .domainName("d111111abcdef8.cloudfront.net")
 * .distributionId("012345ABCDEF")
 * .build());
 * ```
 */
public interface DistributionAttributes {
  /**
   * The distribution ID for this distribution.
   */
  public fun distributionId(): String

  /**
   * The generated domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
   */
  public fun domainName(): String

  /**
   * A builder for [DistributionAttributes]
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
        software.amazon.awscdk.services.cloudfront.DistributionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.DistributionAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudfront.DistributionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.DistributionAttributes,
  ) : CdkObject(cdkObject), DistributionAttributes {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DistributionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.DistributionAttributes):
        DistributionAttributes = CdkObjectWrappers.wrap(cdkObject) as DistributionAttributes

    internal fun unwrap(wrapped: DistributionAttributes):
        software.amazon.awscdk.services.cloudfront.DistributionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.DistributionAttributes
  }
}
