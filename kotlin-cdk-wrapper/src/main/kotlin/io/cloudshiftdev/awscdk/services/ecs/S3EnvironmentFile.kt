@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Environment file from S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3EnvironmentFile s3EnvironmentFile = new S3EnvironmentFile(bucket, "key", "objectVersion");
 * ```
 */
public open class S3EnvironmentFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile,
) : EnvironmentFile(cdkObject) {
  public constructor(
    bucket: IBucket,
    key: String,
    objectVersion: String,
  ) : this(software.amazon.awscdk.services.ecs.S3EnvironmentFile(IBucket.unwrap(bucket), key,
      objectVersion))

  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.ecs.S3EnvironmentFile(IBucket.unwrap(bucket), key))

  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile):
        S3EnvironmentFile = S3EnvironmentFile(cdkObject)

    internal fun unwrap(wrapped: S3EnvironmentFile):
        software.amazon.awscdk.services.ecs.S3EnvironmentFile = wrapped.cdkObject
  }
}
