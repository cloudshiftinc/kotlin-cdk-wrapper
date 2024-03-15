@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

/**
 * Credential specification for domainless gMSA.
 *
 * Example:
 *
 * ```
 * // Make sure the task definition's execution role has permissions to read from the S3 bucket or
 * SSM parameter where the CredSpec file is stored.
 * Bucket bucket;
 * TaskDefinition taskDefinition;
 * // Domainless gMSA container from a S3 bucket object.
 * taskDefinition.addContainer("gmsa-domainless-container", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .cpu(128)
 * .memoryLimitMiB(256)
 * .credentialSpecs(List.of(DomainlessCredentialSpec.fromS3Bucket(bucket, "credSpec")))
 * .build());
 * ```
 */
public open class DomainlessCredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.DomainlessCredentialSpec,
) : CredentialSpec(cdkObject) {
  public constructor(fileLocation: String) :
      this(software.amazon.awscdk.services.ecs.DomainlessCredentialSpec(fileLocation))

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
