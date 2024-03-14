package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

public open class DomainlessCredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.DomainlessCredentialSpec,
) : CredentialSpec(cdkObject) {
  public companion object {
    public fun fromS3Bucket(bucket: IBucket, key: String): DomainlessCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainlessCredentialSpec.fromS3Bucket(bucket.let(IBucket::unwrap),
        key).let(DomainlessCredentialSpec::wrap)

    public fun fromSsmParameter(parameter: IParameter): DomainlessCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainlessCredentialSpec.fromSsmParameter(parameter.let(IParameter::unwrap)).let(DomainlessCredentialSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DomainlessCredentialSpec):
        DomainlessCredentialSpec = DomainlessCredentialSpec(cdkObject)

    internal fun unwrap(wrapped: DomainlessCredentialSpec):
        software.amazon.awscdk.services.ecs.DomainlessCredentialSpec = wrapped.cdkObject
  }
}
