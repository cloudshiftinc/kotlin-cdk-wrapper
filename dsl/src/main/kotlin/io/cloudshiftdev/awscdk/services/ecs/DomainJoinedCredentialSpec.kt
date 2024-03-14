package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

public open class DomainJoinedCredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec,
) : CredentialSpec(cdkObject) {
  public companion object {
    public fun fromS3Bucket(bucket: IBucket, key: String): DomainJoinedCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec.fromS3Bucket(bucket.let(IBucket::unwrap),
        key).let(DomainJoinedCredentialSpec::wrap)

    public fun fromSsmParameter(parameter: IParameter): DomainJoinedCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec.fromSsmParameter(parameter.let(IParameter::unwrap)).let(DomainJoinedCredentialSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec):
        DomainJoinedCredentialSpec = DomainJoinedCredentialSpec(cdkObject)

    internal fun unwrap(wrapped: DomainJoinedCredentialSpec):
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec = wrapped.cdkObject
  }
}
