package io.cloudshiftdev.awscdk.services.elasticsearch

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface DomainAttributes {
  @Deprecated(message = "deprecated in CDK")
  public fun domainArn(): String

  @Deprecated(message = "deprecated in CDK")
  public fun domainEndpoint(): String

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun domainArn(domainArn: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun domainEndpoint(domainEndpoint: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.DomainAttributes.Builder =
        software.amazon.awscdk.services.elasticsearch.DomainAttributes.builder()

    @Deprecated(message = "deprecated in CDK")
    public override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun domainEndpoint(domainEndpoint: String) {
      cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.DomainAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.DomainAttributes,
  ) : DomainAttributes {
    @Deprecated(message = "deprecated in CDK")
    public override fun domainArn(): String = unwrap(this).getDomainArn()

    @Deprecated(message = "deprecated in CDK")
    public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.DomainAttributes):
        DomainAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.elasticsearch.DomainAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
