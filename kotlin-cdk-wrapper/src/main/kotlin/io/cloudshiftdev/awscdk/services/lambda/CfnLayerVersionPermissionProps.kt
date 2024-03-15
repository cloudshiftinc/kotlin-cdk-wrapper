@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLayerVersionPermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnLayerVersionPermissionProps cfnLayerVersionPermissionProps =
 * CfnLayerVersionPermissionProps.builder()
 * .action("action")
 * .layerVersionArn("layerVersionArn")
 * .principal("principal")
 * // the properties below are optional
 * .organizationId("organizationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html)
 */
public interface CfnLayerVersionPermissionProps {
  /**
   * The API action that grants access to the layer.
   *
   * For example, `lambda:GetLayerVersion` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-action)
   */
  public fun action(): String

  /**
   * The name or Amazon Resource Name (ARN) of the layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-layerversionarn)
   */
  public fun layerVersionArn(): String

  /**
   * With the principal set to `*` , grant permission to all accounts in the specified organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-organizationid)
   */
  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  /**
   * An account ID, or `*` to grant layer usage permission to all accounts in an organization, or
   * all AWS accounts (if `organizationId` is not specified).
   *
   * For the last case, make sure that you really do want all AWS accounts to have usage permission
   * to this layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-principal)
   */
  public fun principal(): String

  /**
   * A builder for [CfnLayerVersionPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The API action that grants access to the layer. 
     * For example, `lambda:GetLayerVersion` .
     */
    public fun action(action: String)

    /**
     * @param layerVersionArn The name or Amazon Resource Name (ARN) of the layer. 
     */
    public fun layerVersionArn(layerVersionArn: String)

    /**
     * @param organizationId With the principal set to `*` , grant permission to all accounts in the
     * specified organization.
     */
    public fun organizationId(organizationId: String)

    /**
     * @param principal An account ID, or `*` to grant layer usage permission to all accounts in an
     * organization, or all AWS accounts (if `organizationId` is not specified). 
     * For the last case, make sure that you really do want all AWS accounts to have usage
     * permission to this layer.
     */
    public fun principal(principal: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.builder()

    /**
     * @param action The API action that grants access to the layer. 
     * For example, `lambda:GetLayerVersion` .
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param layerVersionArn The name or Amazon Resource Name (ARN) of the layer. 
     */
    override fun layerVersionArn(layerVersionArn: String) {
      cdkBuilder.layerVersionArn(layerVersionArn)
    }

    /**
     * @param organizationId With the principal set to `*` , grant permission to all accounts in the
     * specified organization.
     */
    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    /**
     * @param principal An account ID, or `*` to grant layer usage permission to all accounts in an
     * organization, or all AWS accounts (if `organizationId` is not specified). 
     * For the last case, make sure that you really do want all AWS accounts to have usage
     * permission to this layer.
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionPermissionProps {
    /**
     * The API action that grants access to the layer.
     *
     * For example, `lambda:GetLayerVersion` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-action)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-layerversionarn)
     */
    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

    /**
     * With the principal set to `*` , grant permission to all accounts in the specified
     * organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-organizationid)
     */
    override fun organizationId(): String? = unwrap(this).getOrganizationId()

    /**
     * An account ID, or `*` to grant layer usage permission to all accounts in an organization, or
     * all AWS accounts (if `organizationId` is not specified).
     *
     * For the last case, make sure that you really do want all AWS accounts to have usage
     * permission to this layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps):
        CfnLayerVersionPermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionPermissionProps):
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
  }
}
