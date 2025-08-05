@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import kotlin.collections.List

/**
 * VPC configuration.
 */
public interface IBedrockCreateModelCustomizationJobVpcConfig {
  /**
   * VPC configuration security groups.
   *
   * The minimum number of security groups is 1.
   * The maximum number of security groups is 5.
   */
  public fun securityGroups(): List<ISecurityGroup>

  /**
   * VPC configuration subnets.
   *
   * The minimum number of subnets is 1.
   * The maximum number of subnets is 16.
   */
  public fun subnets(): List<ISubnet>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IBedrockCreateModelCustomizationJobVpcConfig,
  ) : CdkObject(cdkObject),
      IBedrockCreateModelCustomizationJobVpcConfig {
    /**
     * VPC configuration security groups.
     *
     * The minimum number of security groups is 1.
     * The maximum number of security groups is 5.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

    /**
     * VPC configuration subnets.
     *
     * The minimum number of subnets is 1.
     * The maximum number of subnets is 16.
     */
    override fun subnets(): List<ISubnet> = unwrap(this).getSubnets().map(ISubnet::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IBedrockCreateModelCustomizationJobVpcConfig):
        IBedrockCreateModelCustomizationJobVpcConfig = CdkObjectWrappers.wrap(cdkObject) as?
        IBedrockCreateModelCustomizationJobVpcConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBedrockCreateModelCustomizationJobVpcConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.IBedrockCreateModelCustomizationJobVpcConfig
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.IBedrockCreateModelCustomizationJobVpcConfig
  }
}
