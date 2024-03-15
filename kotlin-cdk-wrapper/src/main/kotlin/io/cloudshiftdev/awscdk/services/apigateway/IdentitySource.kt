@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents an identity source.
 *
 * The source can be specified either as a literal value (e.g: `Auth`) which
 * cannot be blank, or as an unresolved string token.
 *
 * Example:
 *
 * ```
 * Function authFn;
 * Resource books;
 * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
 * .handler(authFn)
 * .identitySources(List.of(IdentitySource.header("Authorization")))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .build());
 * ```
 */
public open class IdentitySource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.IdentitySource,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.apigateway.IdentitySource()
  )

  public companion object {
    public fun context(context: String): String =
        software.amazon.awscdk.services.apigateway.IdentitySource.context(context)

    public fun `header`(headerName: String): String =
        software.amazon.awscdk.services.apigateway.IdentitySource.`header`(headerName)

    public fun queryString(queryString: String): String =
        software.amazon.awscdk.services.apigateway.IdentitySource.queryString(queryString)

    public fun stageVariable(stageVariable: String): String =
        software.amazon.awscdk.services.apigateway.IdentitySource.stageVariable(stageVariable)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IdentitySource):
        IdentitySource = IdentitySource(cdkObject)

    internal fun unwrap(wrapped: IdentitySource):
        software.amazon.awscdk.services.apigateway.IdentitySource = wrapped.cdkObject
  }
}
