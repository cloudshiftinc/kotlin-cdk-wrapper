package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

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
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.DomainAttributes,
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
        DomainAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.elasticsearch.DomainAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.DomainAttributes
  }
}
