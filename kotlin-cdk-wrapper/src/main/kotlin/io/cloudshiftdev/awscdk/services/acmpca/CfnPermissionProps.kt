@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.acmpca.*;
 * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
 * .actions(List.of("actions"))
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .principal("principal")
 * // the properties below are optional
 * .sourceAccount("sourceAccount")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html)
 */
public interface CfnPermissionProps {
  /**
   * The private CA actions that can be performed by the designated AWS service.
   *
   * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
   */
  public fun actions(): List<String>

  /**
   * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String

  /**
   * The AWS service or entity that holds the permission.
   *
   * At this time, the only valid principal is `acm.amazonaws.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
   */
  public fun principal(): String

  /**
   * The ID of the account that assigned the permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
   */
  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  /**
   * A builder for [CfnPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The private CA actions that can be performed by the designated AWS service. 
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions The private CA actions that can be performed by the designated AWS service. 
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     */
    public fun actions(vararg actions: String)

    /**
     * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from which
     * the permission was issued. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param principal The AWS service or entity that holds the permission. 
     * At this time, the only valid principal is `acm.amazonaws.com` .
     */
    public fun principal(principal: String)

    /**
     * @param sourceAccount The ID of the account that assigned the permission.
     */
    public fun sourceAccount(sourceAccount: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnPermissionProps.builder()

    /**
     * @param actions The private CA actions that can be performed by the designated AWS service. 
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The private CA actions that can be performed by the designated AWS service. 
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from which
     * the permission was issued. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param principal The AWS service or entity that holds the permission. 
     * At this time, the only valid principal is `acm.amazonaws.com` .
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param sourceAccount The ID of the account that assigned the permission.
     */
    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.CfnPermissionProps,
  ) : CdkObject(cdkObject), CfnPermissionProps {
    /**
     * The private CA actions that can be performed by the designated AWS service.
     *
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /**
     * The AWS service or entity that holds the permission.
     *
     * At this time, the only valid principal is `acm.amazonaws.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * The ID of the account that assigned the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
     */
    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnPermissionProps):
        CfnPermissionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPermissionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.acmpca.CfnPermissionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.acmpca.CfnPermissionProps
  }
}
