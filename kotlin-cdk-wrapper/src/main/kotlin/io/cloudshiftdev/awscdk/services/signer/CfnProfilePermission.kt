@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds cross-account permissions to a signing profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.signer.*;
 * CfnProfilePermission cfnProfilePermission = CfnProfilePermission.Builder.create(this,
 * "MyCfnProfilePermission")
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
public open class CfnProfilePermission internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermission,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfilePermissionProps,
  ) :
      this(software.amazon.awscdk.services.signer.CfnProfilePermission(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProfilePermissionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfilePermissionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProfilePermissionProps(props)
  )

  /**
   * The AWS Signer action permitted as part of cross-account permissions.
   */
  public open fun action(): String = unwrap(this).getAction()

  /**
   * The AWS Signer action permitted as part of cross-account permissions.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS principal receiving cross-account permissions.
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   * The AWS principal receiving cross-account permissions.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * The human-readable name of the signing profile.
   */
  public open fun profileName(): String = unwrap(this).getProfileName()

  /**
   * The human-readable name of the signing profile.
   */
  public open fun profileName(`value`: String) {
    unwrap(this).setProfileName(`value`)
  }

  /**
   * The version of the signing profile.
   */
  public open fun profileVersion(): String? = unwrap(this).getProfileVersion()

  /**
   * The version of the signing profile.
   */
  public open fun profileVersion(`value`: String) {
    unwrap(this).setProfileVersion(`value`)
  }

  /**
   * A unique identifier for the cross-account permission statement.
   */
  public open fun statementId(): String = unwrap(this).getStatementId()

  /**
   * A unique identifier for the cross-account permission statement.
   */
  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.signer.CfnProfilePermission].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS Signer action permitted as part of cross-account permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-action)
     * @param action The AWS Signer action permitted as part of cross-account permissions. 
     */
    public fun action(action: String)

    /**
     * The AWS principal receiving cross-account permissions.
     *
     * This may be an IAM role or another AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-principal)
     * @param principal The AWS principal receiving cross-account permissions. 
     */
    public fun principal(principal: String)

    /**
     * The human-readable name of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profilename)
     * @param profileName The human-readable name of the signing profile. 
     */
    public fun profileName(profileName: String)

    /**
     * The version of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profileversion)
     * @param profileVersion The version of the signing profile. 
     */
    public fun profileVersion(profileVersion: String)

    /**
     * A unique identifier for the cross-account permission statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-statementid)
     * @param statementId A unique identifier for the cross-account permission statement. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnProfilePermission.Builder =
        software.amazon.awscdk.services.signer.CfnProfilePermission.Builder.create(scope, id)

    /**
     * The AWS Signer action permitted as part of cross-account permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-action)
     * @param action The AWS Signer action permitted as part of cross-account permissions. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * The AWS principal receiving cross-account permissions.
     *
     * This may be an IAM role or another AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-principal)
     * @param principal The AWS principal receiving cross-account permissions. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * The human-readable name of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profilename)
     * @param profileName The human-readable name of the signing profile. 
     */
    override fun profileName(profileName: String) {
      cdkBuilder.profileName(profileName)
    }

    /**
     * The version of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profileversion)
     * @param profileVersion The version of the signing profile. 
     */
    override fun profileVersion(profileVersion: String) {
      cdkBuilder.profileVersion(profileVersion)
    }

    /**
     * A unique identifier for the cross-account permission statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-statementid)
     * @param statementId A unique identifier for the cross-account permission statement. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.signer.CfnProfilePermission =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.signer.CfnProfilePermission.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfilePermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfilePermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermission):
        CfnProfilePermission = CfnProfilePermission(cdkObject)

    internal fun unwrap(wrapped: CfnProfilePermission):
        software.amazon.awscdk.services.signer.CfnProfilePermission = wrapped.cdkObject
  }
}
