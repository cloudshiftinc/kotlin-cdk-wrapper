@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnProfilePermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.signer.*;
 * CfnProfilePermissionProps cfnProfilePermissionProps = CfnProfilePermissionProps.builder()
 * .action("action")
 * .principal("principal")
 * .profileName("profileName")
 * .statementId("statementId")
 * // the properties below are optional
 * .profileVersion("profileVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html)
 */
public interface CfnProfilePermissionProps {
  /**
   * The AWS Signer action permitted as part of cross-account permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-action)
   */
  public fun action(): String

  /**
   * The AWS principal receiving cross-account permissions.
   *
   * This may be an IAM role or another AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-principal)
   */
  public fun principal(): String

  /**
   * The human-readable name of the signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profilename)
   */
  public fun profileName(): String

  /**
   * The version of the signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profileversion)
   */
  public fun profileVersion(): String? = unwrap(this).getProfileVersion()

  /**
   * A unique identifier for the cross-account permission statement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-statementid)
   */
  public fun statementId(): String

  /**
   * A builder for [CfnProfilePermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The AWS Signer action permitted as part of cross-account permissions. 
     */
    public fun action(action: String)

    /**
     * @param principal The AWS principal receiving cross-account permissions. 
     * This may be an IAM role or another AWS account ID.
     */
    public fun principal(principal: String)

    /**
     * @param profileName The human-readable name of the signing profile. 
     */
    public fun profileName(profileName: String)

    /**
     * @param profileVersion The version of the signing profile.
     */
    public fun profileVersion(profileVersion: String)

    /**
     * @param statementId A unique identifier for the cross-account permission statement. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnProfilePermissionProps.Builder
        = software.amazon.awscdk.services.signer.CfnProfilePermissionProps.builder()

    /**
     * @param action The AWS Signer action permitted as part of cross-account permissions. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param principal The AWS principal receiving cross-account permissions. 
     * This may be an IAM role or another AWS account ID.
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param profileName The human-readable name of the signing profile. 
     */
    override fun profileName(profileName: String) {
      cdkBuilder.profileName(profileName)
    }

    /**
     * @param profileVersion The version of the signing profile.
     */
    override fun profileVersion(profileVersion: String) {
      cdkBuilder.profileVersion(profileVersion)
    }

    /**
     * @param statementId A unique identifier for the cross-account permission statement. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.signer.CfnProfilePermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermissionProps,
  ) : CdkObject(cdkObject), CfnProfilePermissionProps {
    /**
     * The AWS Signer action permitted as part of cross-account permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-action)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * The AWS principal receiving cross-account permissions.
     *
     * This may be an IAM role or another AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * The human-readable name of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profilename)
     */
    override fun profileName(): String = unwrap(this).getProfileName()

    /**
     * The version of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profileversion)
     */
    override fun profileVersion(): String? = unwrap(this).getProfileVersion()

    /**
     * A unique identifier for the cross-account permission statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-statementid)
     */
    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfilePermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermissionProps):
        CfnProfilePermissionProps = CdkObjectWrappers.wrap(cdkObject) as CfnProfilePermissionProps

    internal fun unwrap(wrapped: CfnProfilePermissionProps):
        software.amazon.awscdk.services.signer.CfnProfilePermissionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.CfnProfilePermissionProps
  }
}
