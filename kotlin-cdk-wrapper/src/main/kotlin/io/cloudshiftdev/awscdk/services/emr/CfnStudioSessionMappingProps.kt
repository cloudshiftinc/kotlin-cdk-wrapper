@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnStudioSessionMapping`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnStudioSessionMappingProps cfnStudioSessionMappingProps =
 * CfnStudioSessionMappingProps.builder()
 * .identityName("identityName")
 * .identityType("identityType")
 * .sessionPolicyArn("sessionPolicyArn")
 * .studioId("studioId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html)
 */
public interface CfnStudioSessionMappingProps {
  /**
   * The name of the user or group.
   *
   * For more information, see
   * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
   * and
   * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
   * in the *IAM Identity Center Identity Store API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identityname)
   */
  public fun identityName(): String

  /**
   * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identitytype)
   */
  public fun identityType(): String

  /**
   * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
   * group.
   *
   * Session policies refine Studio user permissions without the need to use multiple IAM user
   * roles. For more information, see [Create an EMR Studio user role with session
   * policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html) in the
   * *Amazon EMR Management Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-sessionpolicyarn)
   */
  public fun sessionPolicyArn(): String

  /**
   * The ID of the Amazon EMR Studio to which the user or group will be mapped.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-studioid)
   */
  public fun studioId(): String

  /**
   * A builder for [CfnStudioSessionMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityName The name of the user or group. 
     * For more information, see
     * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
     * and
     * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
     * in the *IAM Identity Center Identity Store API Reference* .
     */
    public fun identityName(identityName: String)

    /**
     * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a user
     * or a group. 
     */
    public fun identityType(identityType: String)

    /**
     * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be
     * applied to the user or group. 
     * Session policies refine Studio user permissions without the need to use multiple IAM user
     * roles. For more information, see [Create an EMR Studio user role with session
     * policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html) in
     * the *Amazon EMR Management Guide* .
     */
    public fun sessionPolicyArn(sessionPolicyArn: String)

    /**
     * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped. 
     */
    public fun studioId(studioId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.Builder
        = software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.builder()

    /**
     * @param identityName The name of the user or group. 
     * For more information, see
     * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
     * and
     * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
     * in the *IAM Identity Center Identity Store API Reference* .
     */
    override fun identityName(identityName: String) {
      cdkBuilder.identityName(identityName)
    }

    /**
     * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a user
     * or a group. 
     */
    override fun identityType(identityType: String) {
      cdkBuilder.identityType(identityType)
    }

    /**
     * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be
     * applied to the user or group. 
     * Session policies refine Studio user permissions without the need to use multiple IAM user
     * roles. For more information, see [Create an EMR Studio user role with session
     * policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html) in
     * the *Amazon EMR Management Guide* .
     */
    override fun sessionPolicyArn(sessionPolicyArn: String) {
      cdkBuilder.sessionPolicyArn(sessionPolicyArn)
    }

    /**
     * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps,
  ) : CdkObject(cdkObject), CfnStudioSessionMappingProps {
    /**
     * The name of the user or group.
     *
     * For more information, see
     * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
     * and
     * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
     * in the *IAM Identity Center Identity Store API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identityname)
     */
    override fun identityName(): String = unwrap(this).getIdentityName()

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identitytype)
     */
    override fun identityType(): String = unwrap(this).getIdentityType()

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
     * group.
     *
     * Session policies refine Studio user permissions without the need to use multiple IAM user
     * roles. For more information, see [Create an EMR Studio user role with session
     * policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html) in
     * the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-sessionpolicyarn)
     */
    override fun sessionPolicyArn(): String = unwrap(this).getSessionPolicyArn()

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioSessionMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps):
        CfnStudioSessionMappingProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStudioSessionMappingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioSessionMappingProps):
        software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
  }
}
