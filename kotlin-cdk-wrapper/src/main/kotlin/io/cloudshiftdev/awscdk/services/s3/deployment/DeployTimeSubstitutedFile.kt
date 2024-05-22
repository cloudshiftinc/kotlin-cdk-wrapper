@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * `DeployTimeSubstitutedFile` is an extension of `BucketDeployment` that allows users to upload
 * individual files and specify to make substitutions in the file.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function myLambdaFunction;
 * Bucket destinationBucket;
 * //(Optional) if provided, the resulting processed file would be uploaded to the destinationBucket
 * under the destinationKey name.
 * String destinationKey;
 * Role role;
 * DeployTimeSubstitutedFile.Builder.create(this, "MyFile")
 * .source("my-file.yaml")
 * .destinationKey(destinationKey)
 * .destinationBucket(destinationBucket)
 * .substitutions(Map.of(
 * "variableName", myLambdaFunction.getFunctionName()))
 * .role(role)
 * .build();
 * ```
 */
public open class DeployTimeSubstitutedFile(
  cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile,
) : BucketDeployment(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeployTimeSubstitutedFileProps,
  ) :
      this(software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DeployTimeSubstitutedFileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeployTimeSubstitutedFileProps.Builder.() -> Unit,
  ) : this(scope, id, DeployTimeSubstitutedFileProps(props)
  )

  /**
   *
   */
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   *
   */
  public open fun objectKey(): String = unwrap(this).getObjectKey()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.s3.deployment.DeployTimeSubstitutedFile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    public fun destinationBucket(destinationBucket: IBucket)

    /**
     * The object key in the destination bucket where the processed file would be written to.
     *
     * Default: - Fingerprint of the file content would be used as object key
     *
     * @param destinationKey The object key in the destination bucket where the processed file would
     * be written to. 
     */
    public fun destinationKey(destinationKey: String)

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     *
     * @param role Execution role associated with this function. 
     */
    public fun role(role: IRole)

    /**
     * Path to the user's local file.
     *
     * @param source Path to the user's local file. 
     */
    public fun source(source: String)

    /**
     * User-defined substitutions to make in the file.
     *
     * Placeholders in the user's local file must be specified with double curly
     * brackets and spaces. For example, if you use the key 'xxxx' in the file,
     * it must be written as: {{ xxxx }} to be recognized by the construct as a
     * substitution.
     *
     * @param substitutions User-defined substitutions to make in the file. 
     */
    public fun substitutions(substitutions: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile.Builder =
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile.Builder.create(scope,
        id)

    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * The object key in the destination bucket where the processed file would be written to.
     *
     * Default: - Fingerprint of the file content would be used as object key
     *
     * @param destinationKey The object key in the destination bucket where the processed file would
     * be written to. 
     */
    override fun destinationKey(destinationKey: String) {
      cdkBuilder.destinationKey(destinationKey)
    }

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     *
     * @param role Execution role associated with this function. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Path to the user's local file.
     *
     * @param source Path to the user's local file. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * User-defined substitutions to make in the file.
     *
     * Placeholders in the user's local file must be specified with double curly
     * brackets and spaces. For example, if you use the key 'xxxx' in the file,
     * it must be written as: {{ xxxx }} to be recognized by the construct as a
     * substitution.
     *
     * @param substitutions User-defined substitutions to make in the file. 
     */
    override fun substitutions(substitutions: Map<String, String>) {
      cdkBuilder.substitutions(substitutions)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DeployTimeSubstitutedFile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DeployTimeSubstitutedFile(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile):
        DeployTimeSubstitutedFile = DeployTimeSubstitutedFile(cdkObject)

    internal fun unwrap(wrapped: DeployTimeSubstitutedFile):
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile = wrapped.cdkObject
        as software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
  }
}
