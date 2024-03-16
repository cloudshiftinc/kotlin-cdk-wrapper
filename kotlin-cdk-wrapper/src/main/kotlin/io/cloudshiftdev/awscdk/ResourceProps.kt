@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `Resource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ResourceProps resourceProps = ResourceProps.builder()
 * .account("account")
 * .environmentFromArn("environmentFromArn")
 * .physicalName("physicalName")
 * .region("region")
 * .build();
 * ```
 */
public interface ResourceProps {
  /**
   * The AWS account ID this resource belongs to.
   *
   * Default: - the resource is in the same account as the stack it belongs to
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * ARN to deduce region and account from.
   *
   * The ARN is parsed and the account and region are taken from the ARN.
   * This should be used for imported resources.
   *
   * Cannot be supplied together with either `account` or `region`.
   *
   * Default: - take environment from `account`, `region` parameters, or use Stack environment.
   */
  public fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

  /**
   * The value passed in by users to the physical name prop of the resource.
   *
   * * `undefined` implies that a physical name will be allocated by
   * CloudFormation during deployment.
   * * a concrete value implies a specific physical name
   * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
   * generated
   * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated by
   * CloudFormation.
   *
   * Default: - The physical name will be allocated by CloudFormation at deployment time
   */
  public fun physicalName(): String? = unwrap(this).getPhysicalName()

  /**
   * The AWS region this resource belongs to.
   *
   * Default: - the resource is in the same region as the stack it belongs to
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [ResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID this resource belongs to.
     */
    public fun account(account: String)

    /**
     * @param environmentFromArn ARN to deduce region and account from.
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     */
    public fun environmentFromArn(environmentFromArn: String)

    /**
     * @param physicalName The value passed in by users to the physical name prop of the resource.
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     */
    public fun physicalName(physicalName: String)

    /**
     * @param region The AWS region this resource belongs to.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResourceProps.Builder =
        software.amazon.awscdk.ResourceProps.builder()

    /**
     * @param account The AWS account ID this resource belongs to.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param environmentFromArn ARN to deduce region and account from.
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     */
    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    /**
     * @param physicalName The value passed in by users to the physical name prop of the resource.
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     */
    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    /**
     * @param region The AWS region this resource belongs to.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.ResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResourceProps,
  ) : CdkObject(cdkObject), ResourceProps {
    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     */
    override fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

    /**
     * The value passed in by users to the physical name prop of the resource.
     *
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     *
     * Default: - The physical name will be allocated by CloudFormation at deployment time
     */
    override fun physicalName(): String? = unwrap(this).getPhysicalName()

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResourceProps): ResourceProps =
        CdkObjectWrappers.wrap(cdkObject) as ResourceProps

    internal fun unwrap(wrapped: ResourceProps): software.amazon.awscdk.ResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ResourceProps
  }
}
