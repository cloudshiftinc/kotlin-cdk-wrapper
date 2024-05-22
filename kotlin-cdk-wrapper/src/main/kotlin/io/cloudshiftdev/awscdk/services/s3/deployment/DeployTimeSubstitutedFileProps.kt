@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
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
public interface DeployTimeSubstitutedFileProps {
  /**
   * The S3 bucket to sync the contents of the zip file to.
   */
  public fun destinationBucket(): IBucket

  /**
   * The object key in the destination bucket where the processed file would be written to.
   *
   * Default: - Fingerprint of the file content would be used as object key
   */
  public fun destinationKey(): String? = unwrap(this).getDestinationKey()

  /**
   * Execution role associated with this function.
   *
   * Default: - A role is automatically created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Path to the user's local file.
   */
  public fun source(): String

  /**
   * User-defined substitutions to make in the file.
   *
   * Placeholders in the user's local file must be specified with double curly
   * brackets and spaces. For example, if you use the key 'xxxx' in the file,
   * it must be written as: {{ xxxx }} to be recognized by the construct as a
   * substitution.
   */
  public fun substitutions(): Map<String, String>

  /**
   * A builder for [DeployTimeSubstitutedFileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    public fun destinationBucket(destinationBucket: IBucket)

    /**
     * @param destinationKey The object key in the destination bucket where the processed file would
     * be written to.
     */
    public fun destinationKey(destinationKey: String)

    /**
     * @param role Execution role associated with this function.
     */
    public fun role(role: IRole)

    /**
     * @param source Path to the user's local file. 
     */
    public fun source(source: String)

    /**
     * @param substitutions User-defined substitutions to make in the file. 
     * Placeholders in the user's local file must be specified with double curly
     * brackets and spaces. For example, if you use the key 'xxxx' in the file,
     * it must be written as: {{ xxxx }} to be recognized by the construct as a
     * substitution.
     */
    public fun substitutions(substitutions: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps.Builder =
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps.builder()

    /**
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param destinationKey The object key in the destination bucket where the processed file would
     * be written to.
     */
    override fun destinationKey(destinationKey: String) {
      cdkBuilder.destinationKey(destinationKey)
    }

    /**
     * @param role Execution role associated with this function.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param source Path to the user's local file. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param substitutions User-defined substitutions to make in the file. 
     * Placeholders in the user's local file must be specified with double curly
     * brackets and spaces. For example, if you use the key 'xxxx' in the file,
     * it must be written as: {{ xxxx }} to be recognized by the construct as a
     * substitution.
     */
    override fun substitutions(substitutions: Map<String, String>) {
      cdkBuilder.substitutions(substitutions)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps,
  ) : CdkObject(cdkObject), DeployTimeSubstitutedFileProps {
    /**
     * The S3 bucket to sync the contents of the zip file to.
     */
    override fun destinationBucket(): IBucket =
        unwrap(this).getDestinationBucket().let(IBucket::wrap)

    /**
     * The object key in the destination bucket where the processed file would be written to.
     *
     * Default: - Fingerprint of the file content would be used as object key
     */
    override fun destinationKey(): String? = unwrap(this).getDestinationKey()

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Path to the user's local file.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * User-defined substitutions to make in the file.
     *
     * Placeholders in the user's local file must be specified with double curly
     * brackets and spaces. For example, if you use the key 'xxxx' in the file,
     * it must be written as: {{ xxxx }} to be recognized by the construct as a
     * substitution.
     */
    override fun substitutions(): Map<String, String> = unwrap(this).getSubstitutions() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployTimeSubstitutedFileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps):
        DeployTimeSubstitutedFileProps = CdkObjectWrappers.wrap(cdkObject) as?
        DeployTimeSubstitutedFileProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployTimeSubstitutedFileProps):
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
  }
}
