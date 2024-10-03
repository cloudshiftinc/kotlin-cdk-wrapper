@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::PolicyAssociation` resource specifies associations for a configuration
 * policy or a self-managed configuration.
 *
 * You can associate a AWS Security Hub configuration policy or self-managed configuration with the
 * organization root, organizational units (OUs), or AWS accounts . After a successful association, the
 * configuration policy takes effect in the specified targets. For more information, see [Creating and
 * associating Security Hub configuration
 * policies](https://docs.aws.amazon.com/securityhub/latest/userguide/create-associate-policy.html) in
 * the *AWS Security Hub User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnPolicyAssociation cfnPolicyAssociation = CfnPolicyAssociation.Builder.create(this,
 * "MyCfnPolicyAssociation")
 * .configurationPolicyId("configurationPolicyId")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html)
 */
public open class CfnPolicyAssociation(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnPolicyAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyAssociationProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnPolicyAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPolicyAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPolicyAssociationProps(props)
  )

  /**
   * The association identifier, formatted as `TargetType/TargetId` .
   *
   * For example, `ACCOUNT/123456789012` .
   */
  public open fun attrAssociationIdentifier(): String = unwrap(this).getAttrAssociationIdentifier()

  /**
   * The current status of the association between the specified target and the configuration.
   */
  public open fun attrAssociationStatus(): String = unwrap(this).getAttrAssociationStatus()

  /**
   * The explanation for a `FAILED` value for `AssociationStatus` .
   */
  public open fun attrAssociationStatusMessage(): String =
      unwrap(this).getAttrAssociationStatusMessage()

  /**
   * Indicates whether the association between the specified target and the configuration was
   * directly applied by the AWS Security Hub delegated administrator or inherited from a parent.
   */
  public open fun attrAssociationType(): String = unwrap(this).getAttrAssociationType()

  /**
   * The date and time, in UTC and ISO 8601 format, that the configuration policy association was
   * last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The universally unique identifier (UUID) of the configuration policy.
   */
  public open fun configurationPolicyId(): String = unwrap(this).getConfigurationPolicyId()

  /**
   * The universally unique identifier (UUID) of the configuration policy.
   */
  public open fun configurationPolicyId(`value`: String) {
    unwrap(this).setConfigurationPolicyId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The identifier of the target account, organizational unit, or the root.
   */
  public open fun targetId(): String = unwrap(this).getTargetId()

  /**
   * The identifier of the target account, organizational unit, or the root.
   */
  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  /**
   * Specifies whether the target is an AWS account , organizational unit, or the root.
   */
  public open fun targetType(): String = unwrap(this).getTargetType()

  /**
   * Specifies whether the target is an AWS account , organizational unit, or the root.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnPolicyAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The universally unique identifier (UUID) of the configuration policy.
     *
     * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
     * `SELF_MANAGED_SECURITY_HUB` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-configurationpolicyid)
     * @param configurationPolicyId The universally unique identifier (UUID) of the configuration
     * policy. 
     */
    public fun configurationPolicyId(configurationPolicyId: String)

    /**
     * The identifier of the target account, organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targetid)
     * @param targetId The identifier of the target account, organizational unit, or the root. 
     */
    public fun targetId(targetId: String)

    /**
     * Specifies whether the target is an AWS account , organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targettype)
     * @param targetType Specifies whether the target is an AWS account , organizational unit, or
     * the root. 
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnPolicyAssociation.Builder
        = software.amazon.awscdk.services.securityhub.CfnPolicyAssociation.Builder.create(scope, id)

    /**
     * The universally unique identifier (UUID) of the configuration policy.
     *
     * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
     * `SELF_MANAGED_SECURITY_HUB` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-configurationpolicyid)
     * @param configurationPolicyId The universally unique identifier (UUID) of the configuration
     * policy. 
     */
    override fun configurationPolicyId(configurationPolicyId: String) {
      cdkBuilder.configurationPolicyId(configurationPolicyId)
    }

    /**
     * The identifier of the target account, organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targetid)
     * @param targetId The identifier of the target account, organizational unit, or the root. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * Specifies whether the target is an AWS account , organizational unit, or the root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-policyassociation.html#cfn-securityhub-policyassociation-targettype)
     * @param targetType Specifies whether the target is an AWS account , organizational unit, or
     * the root. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnPolicyAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnPolicyAssociation):
        CfnPolicyAssociation = CfnPolicyAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyAssociation):
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnPolicyAssociation
  }
}
