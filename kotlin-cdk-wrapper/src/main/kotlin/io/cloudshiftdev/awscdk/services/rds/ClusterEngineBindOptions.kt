@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

/**
 * The extra options passed to the `IClusterEngine.bindToCluster` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ParameterGroup parameterGroup;
 * Role role;
 * ClusterEngineBindOptions clusterEngineBindOptions = ClusterEngineBindOptions.builder()
 * .parameterGroup(parameterGroup)
 * .s3ExportRole(role)
 * .s3ImportRole(role)
 * .build();
 * ```
 */
public interface ClusterEngineBindOptions {
  /**
   * The customer-provided ParameterGroup.
   *
   * Default: - none
   */
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  /**
   * The role used for S3 exporting.
   *
   * Default: - none
   */
  public fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

  /**
   * The role used for S3 importing.
   *
   * Default: - none
   */
  public fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

  /**
   * A builder for [ClusterEngineBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterGroup The customer-provided ParameterGroup.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param s3ExportRole The role used for S3 exporting.
     */
    public fun s3ExportRole(s3ExportRole: IRole)

    /**
     * @param s3ImportRole The role used for S3 importing.
     */
    public fun s3ImportRole(s3ImportRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineBindOptions.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineBindOptions.builder()

    /**
     * @param parameterGroup The customer-provided ParameterGroup.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * @param s3ExportRole The role used for S3 exporting.
     */
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    /**
     * @param s3ImportRole The role used for S3 importing.
     */
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineBindOptions,
  ) : CdkObject(cdkObject), ClusterEngineBindOptions {
    /**
     * The customer-provided ParameterGroup.
     *
     * Default: - none
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The role used for S3 exporting.
     *
     * Default: - none
     */
    override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

    /**
     * The role used for S3 importing.
     *
     * Default: - none
     */
    override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineBindOptions):
        ClusterEngineBindOptions = CdkObjectWrappers.wrap(cdkObject) as? ClusterEngineBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterEngineBindOptions):
        software.amazon.awscdk.services.rds.ClusterEngineBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ClusterEngineBindOptions
  }
}
