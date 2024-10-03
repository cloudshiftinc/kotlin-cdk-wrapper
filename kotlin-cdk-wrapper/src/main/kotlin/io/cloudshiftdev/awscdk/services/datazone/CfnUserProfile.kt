@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

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
 * The user type of the user for which the user profile is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
 * .domainIdentifier("domainIdentifier")
 * .userIdentifier("userIdentifier")
 * // the properties below are optional
 * .status("status")
 * .userType("userType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html)
 */
public open class CfnUserProfile(
  cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnUserProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProfileProps(props)
  )

  /**
   *
   */
  public open fun attrDetails(): IResolvable = unwrap(this).getAttrDetails().let(IResolvable::wrap)

  /**
   * The identifier of a Amazon DataZone domain in which a user profile exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The ID of the user profile.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The type of the user profile.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The identifier of a Amazon DataZone domain in which a user profile exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of a Amazon DataZone domain in which a user profile exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
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
   * The status of the user profile.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the user profile.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * The identifier of the user for which the user profile is created.
   */
  public open fun userIdentifier(): String = unwrap(this).getUserIdentifier()

  /**
   * The identifier of the user for which the user profile is created.
   */
  public open fun userIdentifier(`value`: String) {
    unwrap(this).setUserIdentifier(`value`)
  }

  /**
   * The user type of the user for which the user profile is created.
   */
  public open fun userType(): String? = unwrap(this).getUserType()

  /**
   * The user type of the user for which the user profile is created.
   */
  public open fun userType(`value`: String) {
    unwrap(this).setUserType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnUserProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of a Amazon DataZone domain in which a user profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain in which a user profile
     * exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The status of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-status)
     * @param status The status of the user profile. 
     */
    public fun status(status: String)

    /**
     * The identifier of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-useridentifier)
     * @param userIdentifier The identifier of the user for which the user profile is created. 
     */
    public fun userIdentifier(userIdentifier: String)

    /**
     * The user type of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-usertype)
     * @param userType The user type of the user for which the user profile is created. 
     */
    public fun userType(userType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnUserProfile.Builder =
        software.amazon.awscdk.services.datazone.CfnUserProfile.Builder.create(scope, id)

    /**
     * The identifier of a Amazon DataZone domain in which a user profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain in which a user profile
     * exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The status of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-status)
     * @param status The status of the user profile. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The identifier of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-useridentifier)
     * @param userIdentifier The identifier of the user for which the user profile is created. 
     */
    override fun userIdentifier(userIdentifier: String) {
      cdkBuilder.userIdentifier(userIdentifier)
    }

    /**
     * The user type of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-usertype)
     * @param userType The user type of the user for which the user profile is created. 
     */
    override fun userType(userType: String) {
      cdkBuilder.userType(userType)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnUserProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnUserProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile):
        CfnUserProfile = CfnUserProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfile):
        software.amazon.awscdk.services.datazone.CfnUserProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnUserProfile
  }

  /**
   * The details of an IAM user profile in Amazon DataZone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * IamUserProfileDetailsProperty iamUserProfileDetailsProperty =
   * IamUserProfileDetailsProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-iamuserprofiledetails.html)
   */
  public interface IamUserProfileDetailsProperty {
    /**
     * The ARN of an IAM user profile in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-iamuserprofiledetails.html#cfn-datazone-userprofile-iamuserprofiledetails-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [IamUserProfileDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of an IAM user profile in Amazon DataZone.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty.builder()

      /**
       * @param arn The ARN of an IAM user profile in Amazon DataZone.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty,
    ) : CdkObject(cdkObject),
        IamUserProfileDetailsProperty {
      /**
       * The ARN of an IAM user profile in Amazon DataZone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-iamuserprofiledetails.html#cfn-datazone-userprofile-iamuserprofiledetails-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamUserProfileDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty):
          IamUserProfileDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamUserProfileDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamUserProfileDetailsProperty):
          software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnUserProfile.IamUserProfileDetailsProperty
    }
  }

  /**
   * The single sign-on details of the user profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SsoUserProfileDetailsProperty ssoUserProfileDetailsProperty =
   * SsoUserProfileDetailsProperty.builder()
   * .firstName("firstName")
   * .lastName("lastName")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html)
   */
  public interface SsoUserProfileDetailsProperty {
    /**
     * The first name included in the single sign-on details of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-firstname)
     */
    public fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The last name included in the single sign-on details of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-lastname)
     */
    public fun lastName(): String? = unwrap(this).getLastName()

    /**
     * The username included in the single sign-on details of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [SsoUserProfileDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firstName The first name included in the single sign-on details of the user profile.
       */
      public fun firstName(firstName: String)

      /**
       * @param lastName The last name included in the single sign-on details of the user profile.
       */
      public fun lastName(lastName: String)

      /**
       * @param username The username included in the single sign-on details of the user profile.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty.builder()

      /**
       * @param firstName The first name included in the single sign-on details of the user profile.
       */
      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      /**
       * @param lastName The last name included in the single sign-on details of the user profile.
       */
      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      /**
       * @param username The username included in the single sign-on details of the user profile.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty,
    ) : CdkObject(cdkObject),
        SsoUserProfileDetailsProperty {
      /**
       * The first name included in the single sign-on details of the user profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-firstname)
       */
      override fun firstName(): String? = unwrap(this).getFirstName()

      /**
       * The last name included in the single sign-on details of the user profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-lastname)
       */
      override fun lastName(): String? = unwrap(this).getLastName()

      /**
       * The username included in the single sign-on details of the user profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-ssouserprofiledetails.html#cfn-datazone-userprofile-ssouserprofiledetails-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SsoUserProfileDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty):
          SsoUserProfileDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SsoUserProfileDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsoUserProfileDetailsProperty):
          software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnUserProfile.SsoUserProfileDetailsProperty
    }
  }

  /**
   * The details of the user profile in Amazon DataZone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * UserProfileDetailsProperty userProfileDetailsProperty = UserProfileDetailsProperty.builder()
   * .iam(IamUserProfileDetailsProperty.builder()
   * .arn("arn")
   * .build())
   * .sso(SsoUserProfileDetailsProperty.builder()
   * .firstName("firstName")
   * .lastName("lastName")
   * .username("username")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-userprofiledetails.html)
   */
  public interface UserProfileDetailsProperty {
    /**
     * The IAM details included in the user profile details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-userprofiledetails.html#cfn-datazone-userprofile-userprofiledetails-iam)
     */
    public fun iam(): Any? = unwrap(this).getIam()

    /**
     * The single sign-on details included in the user profile details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-userprofiledetails.html#cfn-datazone-userprofile-userprofiledetails-sso)
     */
    public fun sso(): Any? = unwrap(this).getSso()

    /**
     * A builder for [UserProfileDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iam The IAM details included in the user profile details.
       */
      public fun iam(iam: IResolvable)

      /**
       * @param iam The IAM details included in the user profile details.
       */
      public fun iam(iam: IamUserProfileDetailsProperty)

      /**
       * @param iam The IAM details included in the user profile details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df7eac159b70372dc1f7a3d35a8765996a25b859040d908e380e3fcd640c6d93")
      public fun iam(iam: IamUserProfileDetailsProperty.Builder.() -> Unit)

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      public fun sso(sso: IResolvable)

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      public fun sso(sso: SsoUserProfileDetailsProperty)

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d17e15464cc5d973431be5e17079126c7c79a8febfb90d7cfd8161a2a05b0451")
      public fun sso(sso: SsoUserProfileDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty.builder()

      /**
       * @param iam The IAM details included in the user profile details.
       */
      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iam The IAM details included in the user profile details.
       */
      override fun iam(iam: IamUserProfileDetailsProperty) {
        cdkBuilder.iam(iam.let(IamUserProfileDetailsProperty.Companion::unwrap))
      }

      /**
       * @param iam The IAM details included in the user profile details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df7eac159b70372dc1f7a3d35a8765996a25b859040d908e380e3fcd640c6d93")
      override fun iam(iam: IamUserProfileDetailsProperty.Builder.() -> Unit): Unit =
          iam(IamUserProfileDetailsProperty(iam))

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      override fun sso(sso: IResolvable) {
        cdkBuilder.sso(sso.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      override fun sso(sso: SsoUserProfileDetailsProperty) {
        cdkBuilder.sso(sso.let(SsoUserProfileDetailsProperty.Companion::unwrap))
      }

      /**
       * @param sso The single sign-on details included in the user profile details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d17e15464cc5d973431be5e17079126c7c79a8febfb90d7cfd8161a2a05b0451")
      override fun sso(sso: SsoUserProfileDetailsProperty.Builder.() -> Unit): Unit =
          sso(SsoUserProfileDetailsProperty(sso))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty,
    ) : CdkObject(cdkObject),
        UserProfileDetailsProperty {
      /**
       * The IAM details included in the user profile details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-userprofiledetails.html#cfn-datazone-userprofile-userprofiledetails-iam)
       */
      override fun iam(): Any? = unwrap(this).getIam()

      /**
       * The single sign-on details included in the user profile details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-userprofile-userprofiledetails.html#cfn-datazone-userprofile-userprofiledetails-sso)
       */
      override fun sso(): Any? = unwrap(this).getSso()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserProfileDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty):
          UserProfileDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UserProfileDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProfileDetailsProperty):
          software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnUserProfile.UserProfileDetailsProperty
    }
  }
}
