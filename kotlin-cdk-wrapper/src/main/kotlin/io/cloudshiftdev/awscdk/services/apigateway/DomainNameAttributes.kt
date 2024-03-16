@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * RestApi api;
 * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
 * DomainNameAttributes.builder()
 * .domainName("domainName")
 * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
 * .domainNameAliasTarget("domainNameAliasTarget")
 * .build());
 * BasePathMapping.Builder.create(this, "BasePathMapping")
 * .domainName(domainName)
 * .restApi(api)
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes,
  ) : CdkObject(cdkObject), DomainNameAttributes {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameAttributes):
        DomainNameAttributes = CdkObjectWrappers.wrap(cdkObject) as DomainNameAttributes

    internal fun unwrap(wrapped: DomainNameAttributes):
        software.amazon.awscdk.services.apigateway.DomainNameAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DomainNameAttributes
  }
}
