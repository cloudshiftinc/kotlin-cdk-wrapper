@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Represents the environment a given resource lives in.
 *
 * Used as the return value for the `IResource.env` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ResourceEnvironment resourceEnvironment = ResourceEnvironment.builder()
 * .account("account")
 * .region("region")
 * .build();
 * ```
 */
public interface ResourceEnvironment {
  /**
   * The AWS account ID that this resource belongs to.
   *
   * Since this can be a Token
   * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
   * make sure to use Token.compareStrings()
   * instead of just comparing the values for equality.
   */
  public fun account(): String

  /**
   * The AWS region that this resource belongs to.
   *
   * Since this can be a Token
   * (for example, when the region is CloudFormation's AWS::Region intrinsic),
   * make sure to use Token.compareStrings()
   * instead of just comparing the values for equality.
   */
  public fun region(): String

  /**
   * A builder for [ResourceEnvironment]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    public fun account(account: String)

    /**
     * @param region The AWS region that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResourceEnvironment.Builder =
        software.amazon.awscdk.ResourceEnvironment.builder()

    /**
     * @param account The AWS account ID that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param region The AWS region that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.ResourceEnvironment = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResourceEnvironment,
  ) : CdkObject(cdkObject), ResourceEnvironment {
    /**
     * The AWS account ID that this resource belongs to.
     *
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The AWS region that this resource belongs to.
     *
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResourceEnvironment): ResourceEnvironment =
        CdkObjectWrappers.wrap(cdkObject) as ResourceEnvironment

    internal fun unwrap(wrapped: ResourceEnvironment): software.amazon.awscdk.ResourceEnvironment =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ResourceEnvironment
  }
}
