@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * The options passed to `IInstanceEngine.bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * OptionGroup optionGroup;
 * Role role;
 * InstanceEngineBindOptions instanceEngineBindOptions = InstanceEngineBindOptions.builder()
 * .domain("domain")
 * .optionGroup(optionGroup)
 * .s3ExportRole(role)
 * .s3ImportRole(role)
 * .timezone("timezone")
 * .build();
 * ```
 */
public interface InstanceEngineBindOptions {
  /**
   * The Active Directory directory ID to create the DB instance in.
   *
   * Default: - none (it's an optional field)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The option group of the database.
   *
   * Default: - none
   */
  public fun optionGroup(): IOptionGroup? = unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

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
   * The timezone of the database, set by the customer.
   *
   * Default: - none (it's an optional field)
   */
  public fun timezone(): String? = unwrap(this).getTimezone()

  /**
   * A builder for [InstanceEngineBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     */
    public fun domain(domain: String)

    /**
     * @param optionGroup The option group of the database.
     */
    public fun optionGroup(optionGroup: IOptionGroup)

    /**
     * @param s3ExportRole The role used for S3 exporting.
     */
    public fun s3ExportRole(s3ExportRole: IRole)

    /**
     * @param s3ImportRole The role used for S3 importing.
     */
    public fun s3ImportRole(s3ImportRole: IRole)

    /**
     * @param timezone The timezone of the database, set by the customer.
     */
    public fun timezone(timezone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineBindOptions.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineBindOptions.builder()

    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param optionGroup The option group of the database.
     */
    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
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

    /**
     * @param timezone The timezone of the database, set by the customer.
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.InstanceEngineBindOptions,
  ) : CdkObject(cdkObject), InstanceEngineBindOptions {
    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Default: - none (it's an optional field)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The option group of the database.
     *
     * Default: - none
     */
    override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

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

    /**
     * The timezone of the database, set by the customer.
     *
     * Default: - none (it's an optional field)
     */
    override fun timezone(): String? = unwrap(this).getTimezone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineBindOptions):
        InstanceEngineBindOptions = CdkObjectWrappers.wrap(cdkObject) as? InstanceEngineBindOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineBindOptions):
        software.amazon.awscdk.services.rds.InstanceEngineBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.InstanceEngineBindOptions
  }
}
