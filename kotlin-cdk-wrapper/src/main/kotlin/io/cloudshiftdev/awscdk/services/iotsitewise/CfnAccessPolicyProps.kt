@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAccessPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAccessPolicyProps cfnAccessPolicyProps = CfnAccessPolicyProps.builder()
 * .accessPolicyIdentity(AccessPolicyIdentityProperty.builder()
 * .iamRole(IamRoleProperty.builder()
 * .arn("arn")
 * .build())
 * .iamUser(IamUserProperty.builder()
 * .arn("arn")
 * .build())
 * .user(UserProperty.builder()
 * .id("id")
 * .build())
 * .build())
 * .accessPolicyPermission("accessPolicyPermission")
 * .accessPolicyResource(AccessPolicyResourceProperty.builder()
 * .portal(PortalProperty.builder()
 * .id("id")
 * .build())
 * .project(ProjectProperty.builder()
 * .id("id")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
 */
public interface CfnAccessPolicyProps {
  /**
   * The identity for this access policy.
   *
   * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
   */
  public fun accessPolicyIdentity(): Any

  /**
   * The permission level for this access policy.
   *
   * Note that a project `ADMINISTRATOR` is also known as a project owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicypermission)
   */
  public fun accessPolicyPermission(): String

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   *
   * Choose either a portal or a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
   */
  public fun accessPolicyResource(): Any

  /**
   * A builder for [CfnAccessPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable)

    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    public
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty)

    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c12763fe8e7f55a71e475733f0777036ff85801c861048494babe29ab313c68")
    public
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder.() -> Unit)

    /**
     * @param accessPolicyPermission The permission level for this access policy. 
     * Note that a project `ADMINISTRATOR` is also known as a project owner.
     */
    public fun accessPolicyPermission(accessPolicyPermission: String)

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    public fun accessPolicyResource(accessPolicyResource: IResolvable)

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    public
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty)

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762a524aae62e4f6cffa176e4e0a0d8a73227d90f2e29d5420ab4c96bc95d1a8")
    public
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.Builder
        = software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.builder()

    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    override fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    override
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(CfnAccessPolicy.AccessPolicyIdentityProperty.Companion::unwrap))
    }

    /**
     * @param accessPolicyIdentity The identity for this access policy. 
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c12763fe8e7f55a71e475733f0777036ff85801c861048494babe29ab313c68")
    override
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder.() -> Unit):
        Unit =
        accessPolicyIdentity(CfnAccessPolicy.AccessPolicyIdentityProperty(accessPolicyIdentity))

    /**
     * @param accessPolicyPermission The permission level for this access policy. 
     * Note that a project `ADMINISTRATOR` is also known as a project owner.
     */
    override fun accessPolicyPermission(accessPolicyPermission: String) {
      cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    override fun accessPolicyResource(accessPolicyResource: IResolvable) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    override
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(CfnAccessPolicy.AccessPolicyResourceProperty.Companion::unwrap))
    }

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     * Choose either a portal or a project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762a524aae62e4f6cffa176e4e0a0d8a73227d90f2e29d5420ab4c96bc95d1a8")
    override
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty.Builder.() -> Unit):
        Unit =
        accessPolicyResource(CfnAccessPolicy.AccessPolicyResourceProperty(accessPolicyResource))

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps,
  ) : CdkObject(cdkObject), CfnAccessPolicyProps {
    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     */
    override fun accessPolicyIdentity(): Any = unwrap(this).getAccessPolicyIdentity()

    /**
     * The permission level for this access policy.
     *
     * Note that a project `ADMINISTRATOR` is also known as a project owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicypermission)
     */
    override fun accessPolicyPermission(): String = unwrap(this).getAccessPolicyPermission()

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     */
    override fun accessPolicyResource(): Any = unwrap(this).getAccessPolicyResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps):
        CfnAccessPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccessPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicyProps):
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps
  }
}
