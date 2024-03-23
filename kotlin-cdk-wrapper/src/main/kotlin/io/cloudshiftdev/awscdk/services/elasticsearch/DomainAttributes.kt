@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Reference to an Elasticsearch domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
 * DomainAttributes domainAttributes = DomainAttributes.builder()
 * .domainArn("domainArn")
 * .domainEndpoint("domainEndpoint")
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
public interface DomainAttributes {
  /**
   * (deprecated) The ARN of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainArn(): String

  /**
   * (deprecated) The domain endpoint of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainEndpoint(): String

  /**
   * A builder for [DomainAttributes]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param domainArn The ARN of the Elasticsearch domain. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainArn(domainArn: String)

    /**
     * @param domainEndpoint The domain endpoint of the Elasticsearch domain. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainEndpoint(domainEndpoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.DomainAttributes.Builder =
        software.amazon.awscdk.services.elasticsearch.DomainAttributes.builder()

    /**
     * @param domainArn The ARN of the Elasticsearch domain. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    /**
     * @param domainEndpoint The domain endpoint of the Elasticsearch domain. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainEndpoint(domainEndpoint: String) {
      cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.DomainAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.DomainAttributes,
  ) : CdkObject(cdkObject), DomainAttributes {
    /**
     * (deprecated) The ARN of the Elasticsearch domain.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainArn(): String = unwrap(this).getDomainArn()

    /**
     * (deprecated) The domain endpoint of the Elasticsearch domain.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.DomainAttributes):
        DomainAttributes = CdkObjectWrappers.wrap(cdkObject) as? DomainAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.elasticsearch.DomainAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.DomainAttributes
  }
}
