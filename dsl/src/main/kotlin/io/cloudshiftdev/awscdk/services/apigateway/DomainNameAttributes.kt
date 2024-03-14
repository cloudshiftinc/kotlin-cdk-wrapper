package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface DomainNameAttributes {
  /**
   * The domain name (e.g. `example.com`).
   */
  public fun domainName(): String

  /**
   * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasHostedZoneId(): String

  /**
   * The Route53 alias target to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasTarget(): String

  /**
   * A builder for [DomainNameAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The domain name (e.g. `example.com`). 
     */
    public fun domainName(domainName: String)

    /**
     * @param domainNameAliasHostedZoneId The Route53 hosted zone ID to use in order to connect a
     * record set to this domain through an alias. 
     */
    public fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String)

    /**
     * @param domainNameAliasTarget The Route53 alias target to use in order to connect a record set
     * to this domain through an alias. 
     */
    public fun domainNameAliasTarget(domainNameAliasTarget: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameAttributes.Builder
        = software.amazon.awscdk.services.apigateway.DomainNameAttributes.builder()

    /**
     * @param domainName The domain name (e.g. `example.com`). 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainNameAliasHostedZoneId The Route53 hosted zone ID to use in order to connect a
     * record set to this domain through an alias. 
     */
    override fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String) {
      cdkBuilder.domainNameAliasHostedZoneId(domainNameAliasHostedZoneId)
    }

    /**
     * @param domainNameAliasTarget The Route53 alias target to use in order to connect a record set
     * to this domain through an alias. 
     */
    override fun domainNameAliasTarget(domainNameAliasTarget: String) {
      cdkBuilder.domainNameAliasTarget(domainNameAliasTarget)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes,
  ) : DomainNameAttributes {
    /**
     * The domain name (e.g. `example.com`).
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
     * alias.
     */
    override fun domainNameAliasHostedZoneId(): String =
        unwrap(this).getDomainNameAliasHostedZoneId()

    /**
     * The Route53 alias target to use in order to connect a record set to this domain through an
     * alias.
     */
    override fun domainNameAliasTarget(): String = unwrap(this).getDomainNameAliasTarget()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes):
        DomainNameAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameAttributes):
        software.amazon.awscdk.services.apigateway.DomainNameAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
