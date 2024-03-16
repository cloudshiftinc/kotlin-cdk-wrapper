@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IDomainName : IResource {
  /**
   * The domain name (e.g. `example.com`).
   */
  public fun domainName(): String

  /**
   * The Route53 alias target to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasDomainName(): String

  /**
   * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
   * alias.
   */
  public fun domainNameAliasHostedZoneId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IDomainName):
        IDomainName = CdkObjectWrappers.wrap(cdkObject) as IDomainName

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigateway.IDomainName = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.IDomainName
  }
}
