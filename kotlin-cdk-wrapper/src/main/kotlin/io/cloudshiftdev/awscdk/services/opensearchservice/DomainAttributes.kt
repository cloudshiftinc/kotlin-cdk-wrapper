@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Reference to an Amazon OpenSearch Service domain.
 *
 * Example:
 *
 * ```
 * String domainArn = Fn.importValue("another-cf-stack-export-domain-arn");
 * String domainEndpoint = Fn.importValue("another-cf-stack-export-domain-endpoint");
 * IDomain domain = Domain.fromDomainAttributes(this, "ImportedDomain", DomainAttributes.builder()
 * .domainArn(domainArn)
 * .domainEndpoint(domainEndpoint)
 * .build());
 * ```
 */
public interface DomainAttributes {
  /**
   * The ARN of the Amazon OpenSearch Service domain.
   */
  public fun domainArn(): String

  /**
   * The domain endpoint of the Amazon OpenSearch Service domain.
   */
  public fun domainEndpoint(): String

  /**
   * A builder for [DomainAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainArn The ARN of the Amazon OpenSearch Service domain. 
     */
    public fun domainArn(domainArn: String)

    /**
     * @param domainEndpoint The domain endpoint of the Amazon OpenSearch Service domain. 
     */
    public fun domainEndpoint(domainEndpoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.Builder =
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.builder()

    /**
     * @param domainArn The ARN of the Amazon OpenSearch Service domain. 
     */
    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    /**
     * @param domainEndpoint The domain endpoint of the Amazon OpenSearch Service domain. 
     */
    override fun domainEndpoint(domainEndpoint: String) {
      cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes,
  ) : CdkObject(cdkObject), DomainAttributes {
    /**
     * The ARN of the Amazon OpenSearch Service domain.
     */
    override fun domainArn(): String = unwrap(this).getDomainArn()

    /**
     * The domain endpoint of the Amazon OpenSearch Service domain.
     */
    override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes):
        DomainAttributes = CdkObjectWrappers.wrap(cdkObject) as DomainAttributes

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.opensearchservice.DomainAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.DomainAttributes
  }
}
