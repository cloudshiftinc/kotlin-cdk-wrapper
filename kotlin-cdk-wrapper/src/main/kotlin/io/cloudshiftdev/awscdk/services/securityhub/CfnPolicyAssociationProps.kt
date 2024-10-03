@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPolicyAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnPolicyAssociationProps cfnPolicyAssociationProps = CfnPolicyAssociationProps.builder()
 * .configurationPolicyId("configurationPolicyId")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html)
 */
public interface CfnPolicyAssociationProps {
  /**
   * The universally unique identifier (UUID) of the configuration policy.
   *
   * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
   * `SELF_MANAGED_SECURITY_HUB` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-configurationpolicyid)
   */
  public fun configurationPolicyId(): String

  /**
   * The identifier of the target account, organizational unit, or the root.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targetid)
   */
  public fun targetId(): String

  /**
   * Specifies whether the target is an AWS account , organizational unit, or the root.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targettype)
   */
  public fun targetType(): String

  /**
   * A builder for [CfnPolicyAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationPolicyId The universally unique identifier (UUID) of the configuration
     * policy. 
     * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
     * `SELF_MANAGED_SECURITY_HUB` .
     */
    public fun configurationPolicyId(configurationPolicyId: String)

    /**
     * @param targetId The identifier of the target account, organizational unit, or the root. 
     */
    public fun targetId(targetId: String)

    /**
     * @param targetType Specifies whether the target is an AWS account , organizational unit, or
     * the root. 
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps.builder()

    /**
     * @param configurationPolicyId The universally unique identifier (UUID) of the configuration
     * policy. 
     * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
     * `SELF_MANAGED_SECURITY_HUB` .
     */
    override fun configurationPolicyId(configurationPolicyId: String) {
      cdkBuilder.configurationPolicyId(configurationPolicyId)
    }

    /**
     * @param targetId The identifier of the target account, organizational unit, or the root. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * @param targetType Specifies whether the target is an AWS account , organizational unit, or
     * the root. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps,
  ) : CdkObject(cdkObject),
      CfnPolicyAssociationProps {
    /**
     * The universally unique identifier (UUID) of the configuration policy.
     *
     * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
     * `SELF_MANAGED_SECURITY_HUB` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-configurationpolicyid)
     */
    override fun configurationPolicyId(): String = unwrap(this).getConfigurationPolicyId()

    /**
     * The identifier of the target account, organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targetid)
     */
    override fun targetId(): String = unwrap(this).getTargetId()

    /**
     * Specifies whether the target is an AWS account , organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targettype)
     */
    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps):
        CfnPolicyAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyAssociationProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyAssociationProps):
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps
  }
}
