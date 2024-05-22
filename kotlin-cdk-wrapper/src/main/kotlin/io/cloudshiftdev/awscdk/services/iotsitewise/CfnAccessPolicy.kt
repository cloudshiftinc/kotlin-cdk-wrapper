@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an access policy that grants the specified identity (IAM Identity Center user, IAM
 * Identity Center group, or IAM user) access to the specified AWS IoT SiteWise Monitor portal or
 * project resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAccessPolicy cfnAccessPolicy = CfnAccessPolicy.Builder.create(this, "MyCfnAccessPolicy")
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
public open class CfnAccessPolicy(
  cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPolicyProps,
  ) :
      this(software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAccessPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessPolicyProps(props)
  )

  /**
   * The identity for this access policy.
   */
  public open fun accessPolicyIdentity(): Any = unwrap(this).getAccessPolicyIdentity()

  /**
   * The identity for this access policy.
   */
  public open fun accessPolicyIdentity(`value`: IResolvable) {
    unwrap(this).setAccessPolicyIdentity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The identity for this access policy.
   */
  public open fun accessPolicyIdentity(`value`: AccessPolicyIdentityProperty) {
    unwrap(this).setAccessPolicyIdentity(`value`.let(AccessPolicyIdentityProperty.Companion::unwrap))
  }

  /**
   * The identity for this access policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ef47bfd649e94f7cc8f07888d4ce74e1afe7cae0de3ccdd8fc04a008336f95a")
  public open fun accessPolicyIdentity(`value`: AccessPolicyIdentityProperty.Builder.() -> Unit):
      Unit = accessPolicyIdentity(AccessPolicyIdentityProperty(`value`))

  /**
   * The permission level for this access policy.
   */
  public open fun accessPolicyPermission(): String = unwrap(this).getAccessPolicyPermission()

  /**
   * The permission level for this access policy.
   */
  public open fun accessPolicyPermission(`value`: String) {
    unwrap(this).setAccessPolicyPermission(`value`)
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   */
  public open fun accessPolicyResource(): Any = unwrap(this).getAccessPolicyResource()

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   */
  public open fun accessPolicyResource(`value`: IResolvable) {
    unwrap(this).setAccessPolicyResource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   */
  public open fun accessPolicyResource(`value`: AccessPolicyResourceProperty) {
    unwrap(this).setAccessPolicyResource(`value`.let(AccessPolicyResourceProperty.Companion::unwrap))
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("91e16c3090085a219492b7184b483cd66f04de1aea4329d0d06be134aa84523b")
  public open fun accessPolicyResource(`value`: AccessPolicyResourceProperty.Builder.() -> Unit):
      Unit = accessPolicyResource(AccessPolicyResourceProperty(`value`))

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
   * access policy, which has the following format.
   *
   * `arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}`
   */
  public open fun attrAccessPolicyArn(): String = unwrap(this).getAttrAccessPolicyArn()

  /**
   * The ID of the access policy.
   */
  public open fun attrAccessPolicyId(): String = unwrap(this).getAttrAccessPolicyId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnAccessPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable)

    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    public fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty)

    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba0b6288f8d7a538847ec33b15c817454bd77798ebea103e3a02993db166e141")
    public
        fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty.Builder.() -> Unit)

    /**
     * The permission level for this access policy.
     *
     * Note that a project `ADMINISTRATOR` is also known as a project owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicypermission)
     * @param accessPolicyPermission The permission level for this access policy. 
     */
    public fun accessPolicyPermission(accessPolicyPermission: String)

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    public fun accessPolicyResource(accessPolicyResource: IResolvable)

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    public fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty)

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cea6ccf0d9b11d8e3c96d08f69a5f41cfc124716f241c04562834fed75f4f2d")
    public
        fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder.create(scope, id)

    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    override fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(IResolvable.Companion::unwrap))
    }

    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    override fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(AccessPolicyIdentityProperty.Companion::unwrap))
    }

    /**
     * The identity for this access policy.
     *
     * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
     * @param accessPolicyIdentity The identity for this access policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba0b6288f8d7a538847ec33b15c817454bd77798ebea103e3a02993db166e141")
    override
        fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty.Builder.() -> Unit):
        Unit = accessPolicyIdentity(AccessPolicyIdentityProperty(accessPolicyIdentity))

    /**
     * The permission level for this access policy.
     *
     * Note that a project `ADMINISTRATOR` is also known as a project owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicypermission)
     * @param accessPolicyPermission The permission level for this access policy. 
     */
    override fun accessPolicyPermission(accessPolicyPermission: String) {
      cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    override fun accessPolicyResource(accessPolicyResource: IResolvable) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(IResolvable.Companion::unwrap))
    }

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    override fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(AccessPolicyResourceProperty.Companion::unwrap))
    }

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cea6ccf0d9b11d8e3c96d08f69a5f41cfc124716f241c04562834fed75f4f2d")
    override
        fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty.Builder.() -> Unit):
        Unit = accessPolicyResource(AccessPolicyResourceProperty(accessPolicyResource))

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy):
        CfnAccessPolicy = CfnAccessPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicy):
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
  }

  /**
   * The identity (IAM Identity Center user, IAM Identity Center group, or IAM user) to which this
   * access policy applies.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AccessPolicyIdentityProperty accessPolicyIdentityProperty =
   * AccessPolicyIdentityProperty.builder()
   * .iamRole(IamRoleProperty.builder()
   * .arn("arn")
   * .build())
   * .iamUser(IamUserProperty.builder()
   * .arn("arn")
   * .build())
   * .user(UserProperty.builder()
   * .id("id")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html)
   */
  public interface AccessPolicyIdentityProperty {
    /**
     * An IAM role identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-iamrole)
     */
    public fun iamRole(): Any? = unwrap(this).getIamRole()

    /**
     * An IAM user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-iamuser)
     */
    public fun iamUser(): Any? = unwrap(this).getIamUser()

    /**
     * An IAM Identity Center user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-user)
     */
    public fun user(): Any? = unwrap(this).getUser()

    /**
     * A builder for [AccessPolicyIdentityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iamRole An IAM role identity.
       */
      public fun iamRole(iamRole: IResolvable)

      /**
       * @param iamRole An IAM role identity.
       */
      public fun iamRole(iamRole: IamRoleProperty)

      /**
       * @param iamRole An IAM role identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328197fd2e04f80290b7704d49b6bacf39ab3ea71c7e565e48b746b7d171b412")
      public fun iamRole(iamRole: IamRoleProperty.Builder.() -> Unit)

      /**
       * @param iamUser An IAM user identity.
       */
      public fun iamUser(iamUser: IResolvable)

      /**
       * @param iamUser An IAM user identity.
       */
      public fun iamUser(iamUser: IamUserProperty)

      /**
       * @param iamUser An IAM user identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("116b3c3ca5fae3d54b7546b5361d08260e9d2694cfbc683de9db9411a01a9807")
      public fun iamUser(iamUser: IamUserProperty.Builder.() -> Unit)

      /**
       * @param user An IAM Identity Center user identity.
       */
      public fun user(user: IResolvable)

      /**
       * @param user An IAM Identity Center user identity.
       */
      public fun user(user: UserProperty)

      /**
       * @param user An IAM Identity Center user identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746495a1927bed50c37c06e856341df13539bbd48ade5a8d68215886f6a3f9ec")
      public fun user(user: UserProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty.builder()

      /**
       * @param iamRole An IAM role identity.
       */
      override fun iamRole(iamRole: IResolvable) {
        cdkBuilder.iamRole(iamRole.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamRole An IAM role identity.
       */
      override fun iamRole(iamRole: IamRoleProperty) {
        cdkBuilder.iamRole(iamRole.let(IamRoleProperty.Companion::unwrap))
      }

      /**
       * @param iamRole An IAM role identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328197fd2e04f80290b7704d49b6bacf39ab3ea71c7e565e48b746b7d171b412")
      override fun iamRole(iamRole: IamRoleProperty.Builder.() -> Unit): Unit =
          iamRole(IamRoleProperty(iamRole))

      /**
       * @param iamUser An IAM user identity.
       */
      override fun iamUser(iamUser: IResolvable) {
        cdkBuilder.iamUser(iamUser.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamUser An IAM user identity.
       */
      override fun iamUser(iamUser: IamUserProperty) {
        cdkBuilder.iamUser(iamUser.let(IamUserProperty.Companion::unwrap))
      }

      /**
       * @param iamUser An IAM user identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("116b3c3ca5fae3d54b7546b5361d08260e9d2694cfbc683de9db9411a01a9807")
      override fun iamUser(iamUser: IamUserProperty.Builder.() -> Unit): Unit =
          iamUser(IamUserProperty(iamUser))

      /**
       * @param user An IAM Identity Center user identity.
       */
      override fun user(user: IResolvable) {
        cdkBuilder.user(user.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param user An IAM Identity Center user identity.
       */
      override fun user(user: UserProperty) {
        cdkBuilder.user(user.let(UserProperty.Companion::unwrap))
      }

      /**
       * @param user An IAM Identity Center user identity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746495a1927bed50c37c06e856341df13539bbd48ade5a8d68215886f6a3f9ec")
      override fun user(user: UserProperty.Builder.() -> Unit): Unit = user(UserProperty(user))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty,
    ) : CdkObject(cdkObject), AccessPolicyIdentityProperty {
      /**
       * An IAM role identity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-iamrole)
       */
      override fun iamRole(): Any? = unwrap(this).getIamRole()

      /**
       * An IAM user identity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-iamuser)
       */
      override fun iamUser(): Any? = unwrap(this).getIamUser()

      /**
       * An IAM Identity Center user identity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity-user)
       */
      override fun user(): Any? = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyIdentityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty):
          AccessPolicyIdentityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessPolicyIdentityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyIdentityProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty
    }
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   *
   * Choose either a portal or a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AccessPolicyResourceProperty accessPolicyResourceProperty =
   * AccessPolicyResourceProperty.builder()
   * .portal(PortalProperty.builder()
   * .id("id")
   * .build())
   * .project(ProjectProperty.builder()
   * .id("id")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html)
   */
  public interface AccessPolicyResourceProperty {
    /**
     * Identifies an AWS IoT SiteWise Monitor portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html#cfn-iotsitewise-accesspolicy-accesspolicyresource-portal)
     */
    public fun portal(): Any? = unwrap(this).getPortal()

    /**
     * Identifies a specific AWS IoT SiteWise Monitor project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html#cfn-iotsitewise-accesspolicy-accesspolicyresource-project)
     */
    public fun project(): Any? = unwrap(this).getProject()

    /**
     * A builder for [AccessPolicyResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      public fun portal(portal: IResolvable)

      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      public fun portal(portal: PortalProperty)

      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04ce2ff0f5f1fcb91a8a5320cbf19c81ae4c2319745f777cb2cf3acda573f5a")
      public fun portal(portal: PortalProperty.Builder.() -> Unit)

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      public fun project(project: IResolvable)

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      public fun project(project: ProjectProperty)

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3815225218a2895b45b4c213a61eaa5f7af0abcab4676b89a02eb8016b256d5")
      public fun project(project: ProjectProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty.builder()

      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      override fun portal(portal: IResolvable) {
        cdkBuilder.portal(portal.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      override fun portal(portal: PortalProperty) {
        cdkBuilder.portal(portal.let(PortalProperty.Companion::unwrap))
      }

      /**
       * @param portal Identifies an AWS IoT SiteWise Monitor portal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04ce2ff0f5f1fcb91a8a5320cbf19c81ae4c2319745f777cb2cf3acda573f5a")
      override fun portal(portal: PortalProperty.Builder.() -> Unit): Unit =
          portal(PortalProperty(portal))

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      override fun project(project: IResolvable) {
        cdkBuilder.project(project.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      override fun project(project: ProjectProperty) {
        cdkBuilder.project(project.let(ProjectProperty.Companion::unwrap))
      }

      /**
       * @param project Identifies a specific AWS IoT SiteWise Monitor project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3815225218a2895b45b4c213a61eaa5f7af0abcab4676b89a02eb8016b256d5")
      override fun project(project: ProjectProperty.Builder.() -> Unit): Unit =
          project(ProjectProperty(project))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty,
    ) : CdkObject(cdkObject), AccessPolicyResourceProperty {
      /**
       * Identifies an AWS IoT SiteWise Monitor portal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html#cfn-iotsitewise-accesspolicy-accesspolicyresource-portal)
       */
      override fun portal(): Any? = unwrap(this).getPortal()

      /**
       * Identifies a specific AWS IoT SiteWise Monitor project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html#cfn-iotsitewise-accesspolicy-accesspolicyresource-project)
       */
      override fun project(): Any? = unwrap(this).getProject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty):
          AccessPolicyResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessPolicyResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyResourceProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty
    }
  }

  /**
   * Contains information about an AWS Identity and Access Management role.
   *
   * For more information, see [IAM
   * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *IAM User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * IamRoleProperty iamRoleProperty = IamRoleProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamrole.html)
   */
  public interface IamRoleProperty {
    /**
     * The ARN of the IAM role.
     *
     * For more information, see [IAM
     * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamrole.html#cfn-iotsitewise-accesspolicy-iamrole-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [IamRoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the IAM role.
       * For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty.builder()

      /**
       * @param arn The ARN of the IAM role.
       * For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty,
    ) : CdkObject(cdkObject), IamRoleProperty {
      /**
       * The ARN of the IAM role.
       *
       * For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamrole.html#cfn-iotsitewise-accesspolicy-iamrole-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty):
          IamRoleProperty = CdkObjectWrappers.wrap(cdkObject) as? IamRoleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamRoleProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty
    }
  }

  /**
   * Contains information about an AWS Identity and Access Management user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * IamUserProperty iamUserProperty = IamUserProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamuser.html)
   */
  public interface IamUserProperty {
    /**
     * The ARN of the IAM user. For more information, see [IAM
     * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
     * User Guide* .
     *
     *
     * If you delete the IAM user, access policies that contain this identity include an empty `arn`
     * . You can delete the access policy for the IAM user that no longer exists.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamuser.html#cfn-iotsitewise-accesspolicy-iamuser-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [IamUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the IAM user. For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       *
       * If you delete the IAM user, access policies that contain this identity include an empty
       * `arn` . You can delete the access policy for the IAM user that no longer exists.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.builder()

      /**
       * @param arn The ARN of the IAM user. For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       *
       * If you delete the IAM user, access policies that contain this identity include an empty
       * `arn` . You can delete the access policy for the IAM user that no longer exists.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty,
    ) : CdkObject(cdkObject), IamUserProperty {
      /**
       * The ARN of the IAM user. For more information, see [IAM
       * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
       * User Guide* .
       *
       *
       * If you delete the IAM user, access policies that contain this identity include an empty
       * `arn` . You can delete the access policy for the IAM user that no longer exists.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamuser.html#cfn-iotsitewise-accesspolicy-iamuser-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty):
          IamUserProperty = CdkObjectWrappers.wrap(cdkObject) as? IamUserProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamUserProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty
    }
  }

  /**
   * Identifies an AWS IoT SiteWise Monitor portal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * PortalProperty portalProperty = PortalProperty.builder()
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-portal.html)
   */
  public interface PortalProperty {
    /**
     * The ID of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-portal.html#cfn-iotsitewise-accesspolicy-portal-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [PortalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the portal.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty.builder()

      /**
       * @param id The ID of the portal.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty,
    ) : CdkObject(cdkObject), PortalProperty {
      /**
       * The ID of the portal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-portal.html#cfn-iotsitewise-accesspolicy-portal-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty):
          PortalProperty = CdkObjectWrappers.wrap(cdkObject) as? PortalProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortalProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty
    }
  }

  /**
   * Identifies a specific AWS IoT SiteWise Monitor project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * ProjectProperty projectProperty = ProjectProperty.builder()
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-project.html)
   */
  public interface ProjectProperty {
    /**
     * The ID of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-project.html#cfn-iotsitewise-accesspolicy-project-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [ProjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the project.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty.builder()

      /**
       * @param id The ID of the project.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty,
    ) : CdkObject(cdkObject), ProjectProperty {
      /**
       * The ID of the project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-project.html#cfn-iotsitewise-accesspolicy-project-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty):
          ProjectProperty = CdkObjectWrappers.wrap(cdkObject) as? ProjectProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty
    }
  }

  /**
   * Contains information for a user identity in an access policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * UserProperty userProperty = UserProperty.builder()
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-user.html)
   */
  public interface UserProperty {
    /**
     * The IAM Identity Center ID of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-user.html#cfn-iotsitewise-accesspolicy-user-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [UserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The IAM Identity Center ID of the user.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty.builder()

      /**
       * @param id The IAM Identity Center ID of the user.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty,
    ) : CdkObject(cdkObject), UserProperty {
      /**
       * The IAM Identity Center ID of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-user.html#cfn-iotsitewise-accesspolicy-user-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty):
          UserProperty = CdkObjectWrappers.wrap(cdkObject) as? UserProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty
    }
  }
}
