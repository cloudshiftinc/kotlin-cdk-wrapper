@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

/**
 * Credential specification (CredSpec) file.
 *
 * Example:
 *
 * ```
 * // Make sure the task definition's execution role has permissions to read from the S3 bucket or
 * SSM parameter where the CredSpec file is stored.
 * IParameter parameter;
 * TaskDefinition taskDefinition;
 * // Domain-joined gMSA container from a SSM parameter
 * taskDefinition.addContainer("gmsa-domain-joined-container", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .cpu(128)
 * .memoryLimitMiB(256)
 * .credentialSpecs(List.of(DomainJoinedCredentialSpec.fromSsmParameter(parameter)))
 * .build());
 * ```
 */
public open class DomainJoinedCredentialSpec(
  cdkObject: software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec,
) : CredentialSpec(cdkObject) {
  public constructor(fileLocation: String) :
      this(software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec(fileLocation)
  )

  public companion object {
    public fun fromS3Bucket(bucket: IBucket, key: String): DomainJoinedCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec.fromS3Bucket(bucket.let(IBucket::unwrap),
        key).let(DomainJoinedCredentialSpec::wrap)

    public fun fromSsmParameter(parameter: IParameter): DomainJoinedCredentialSpec =
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec.fromSsmParameter(parameter.let(IParameter::unwrap)).let(DomainJoinedCredentialSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec):
        DomainJoinedCredentialSpec = DomainJoinedCredentialSpec(cdkObject)

    internal fun unwrap(wrapped: DomainJoinedCredentialSpec):
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.DomainJoinedCredentialSpec
  }
}
