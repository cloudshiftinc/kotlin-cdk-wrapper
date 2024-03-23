@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * OpenAPI specification from an S3 archive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3ApiDefinition s3ApiDefinition = new S3ApiDefinition(bucket, "key", "objectVersion");
 * ```
 */
public open class S3ApiDefinition(
  cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition,
) : ApiDefinition(cdkObject) {
  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.apigateway.S3ApiDefinition(bucket.let(IBucket::unwrap),
      key)
  )

  public constructor(
    bucket: IBucket,
    key: String,
    objectVersion: String,
  ) : this(software.amazon.awscdk.services.apigateway.S3ApiDefinition(bucket.let(IBucket::unwrap),
      key, objectVersion)
  )

  /**
   * Called when the specification is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(ApiDefinitionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition):
        S3ApiDefinition = S3ApiDefinition(cdkObject)

    internal fun unwrap(wrapped: S3ApiDefinition):
        software.amazon.awscdk.services.apigateway.S3ApiDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.S3ApiDefinition
  }
}
