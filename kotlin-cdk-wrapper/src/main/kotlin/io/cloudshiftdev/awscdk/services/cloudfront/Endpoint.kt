@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kinesis.IStream

public abstract class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.Endpoint,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.Endpoint,
  ) : Endpoint(cdkObject)

  public companion object {
    public fun fromKinesisStream(stream: IStream): Endpoint =
        software.amazon.awscdk.services.cloudfront.Endpoint.fromKinesisStream(stream.let(IStream::unwrap)).let(Endpoint::wrap)

    public fun fromKinesisStream(stream: IStream, role: IRole): Endpoint =
        software.amazon.awscdk.services.cloudfront.Endpoint.fromKinesisStream(stream.let(IStream::unwrap),
        role.let(IRole::unwrap)).let(Endpoint::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Endpoint): Endpoint =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.cloudfront.Endpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.Endpoint
  }
}
