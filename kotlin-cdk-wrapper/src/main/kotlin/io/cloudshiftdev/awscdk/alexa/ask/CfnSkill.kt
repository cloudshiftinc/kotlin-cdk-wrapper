@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.alexa.ask

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
 * The `Alexa::ASK::Skill` resource creates an Alexa skill that enables customers to access new
 * abilities.
 *
 * For more information about developing a skill, see the  .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.alexa.ask.*;
 * Object manifest;
 * CfnSkill cfnSkill = CfnSkill.Builder.create(this, "MyCfnSkill")
 * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .refreshToken("refreshToken")
 * .build())
 * .skillPackage(SkillPackageProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * // the properties below are optional
 * .overrides(OverridesProperty.builder()
 * .manifest(manifest)
 * .build())
 * .s3BucketRole("s3BucketRole")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build())
 * .vendorId("vendorId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html)
 */
public open class CfnSkill(
  cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSkillProps,
  ) :
      this(software.amazon.awscdk.alexa.ask.CfnSkill(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSkillProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSkillProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSkillProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
   */
  public open fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

  /**
   * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
   */
  public open fun authenticationConfiguration(`value`: IResolvable) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
   */
  public open fun authenticationConfiguration(`value`: AuthenticationConfigurationProperty) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(AuthenticationConfigurationProperty.Companion::unwrap))
  }

  /**
   * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88004043ed86646dc18b8e3a53b1ae882edfeac1a686f59f6653eac81dd7ff26")
  public open
      fun authenticationConfiguration(`value`: AuthenticationConfigurationProperty.Builder.() -> Unit):
      Unit = authenticationConfiguration(AuthenticationConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Configuration for the skill package that contains the components of the Alexa skill.
   */
  public open fun skillPackage(): Any = unwrap(this).getSkillPackage()

  /**
   * Configuration for the skill package that contains the components of the Alexa skill.
   */
  public open fun skillPackage(`value`: IResolvable) {
    unwrap(this).setSkillPackage(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration for the skill package that contains the components of the Alexa skill.
   */
  public open fun skillPackage(`value`: SkillPackageProperty) {
    unwrap(this).setSkillPackage(`value`.let(SkillPackageProperty.Companion::unwrap))
  }

  /**
   * Configuration for the skill package that contains the components of the Alexa skill.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c93828306ad2c9b3d8c39bf3596a81dcaa729ec089ffad6363a76ed2b2c37ddf")
  public open fun skillPackage(`value`: SkillPackageProperty.Builder.() -> Unit): Unit =
      skillPackage(SkillPackageProperty(`value`))

  /**
   * The vendor ID associated with the Amazon developer account that will host the skill.
   */
  public open fun vendorId(): String = unwrap(this).getVendorId()

  /**
   * The vendor ID associated with the Amazon developer account that will host the skill.
   */
  public open fun vendorId(`value`: String) {
    unwrap(this).setVendorId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.alexa.ask.CfnSkill].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    public
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty)

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37fcab36fae7d2b86f1f3810bf7474706e1cfd136bb24323f15e8c78bd597311")
    public
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit)

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    public fun skillPackage(skillPackage: IResolvable)

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    public fun skillPackage(skillPackage: SkillPackageProperty)

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27243d70f0bca05762c9ee33da5908e19d239fc2644517eff6d81ae2bca2f3e5")
    public fun skillPackage(skillPackage: SkillPackageProperty.Builder.() -> Unit)

    /**
     * The vendor ID associated with the Amazon developer account that will host the skill.
     *
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid)
     * @param vendorId The vendor ID associated with the Amazon developer account that will host the
     * skill. 
     */
    public fun vendorId(vendorId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.Builder =
        software.amazon.awscdk.alexa.ask.CfnSkill.Builder.create(scope, id)

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    override
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty.Companion::unwrap))
    }

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37fcab36fae7d2b86f1f3810bf7474706e1cfd136bb24323f15e8c78bd597311")
    override
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    override fun skillPackage(skillPackage: IResolvable) {
      cdkBuilder.skillPackage(skillPackage.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    override fun skillPackage(skillPackage: SkillPackageProperty) {
      cdkBuilder.skillPackage(skillPackage.let(SkillPackageProperty.Companion::unwrap))
    }

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27243d70f0bca05762c9ee33da5908e19d239fc2644517eff6d81ae2bca2f3e5")
    override fun skillPackage(skillPackage: SkillPackageProperty.Builder.() -> Unit): Unit =
        skillPackage(SkillPackageProperty(skillPackage))

    /**
     * The vendor ID associated with the Amazon developer account that will host the skill.
     *
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid)
     * @param vendorId The vendor ID associated with the Amazon developer account that will host the
     * skill. 
     */
    override fun vendorId(vendorId: String) {
      cdkBuilder.vendorId(vendorId)
    }

    public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.alexa.ask.CfnSkill.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSkill {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSkill(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill): CfnSkill =
        CfnSkill(cdkObject)

    internal fun unwrap(wrapped: CfnSkill): software.amazon.awscdk.alexa.ask.CfnSkill =
        wrapped.cdkObject as software.amazon.awscdk.alexa.ask.CfnSkill
  }

  /**
   * The `AuthenticationConfiguration` property type specifies the Login with Amazon (LWA)
   * configuration used to authenticate with the Alexa service.
   *
   * Only Login with Amazon security profiles created through the  are supported for authentication.
   * A client ID, client secret, and refresh token are required. You can generate a client ID and
   * client secret by creating a new  on the Amazon Developer Portal or you can retrieve them from an
   * existing profile. You can then retrieve the refresh token using the Alexa Skills Kit CLI. For
   * instructions, see  in the  .
   *
   * `AuthenticationConfiguration` is a property of the `Alexa::ASK::Skill` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.alexa.ask.*;
   * AuthenticationConfigurationProperty authenticationConfigurationProperty =
   * AuthenticationConfigurationProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html)
   */
  public interface AuthenticationConfigurationProperty {
    /**
     * Client ID from Login with Amazon (LWA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-clientid)
     */
    public fun clientId(): String

    /**
     * Client secret from Login with Amazon (LWA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * Refresh token from Login with Amazon (LWA).
     *
     * This token is secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-refreshtoken)
     */
    public fun refreshToken(): String

    /**
     * A builder for [AuthenticationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientId Client ID from Login with Amazon (LWA). 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret Client secret from Login with Amazon (LWA). 
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param refreshToken Refresh token from Login with Amazon (LWA). 
       * This token is secret.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder =
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.builder()

      /**
       * @param clientId Client ID from Login with Amazon (LWA). 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret Client secret from Login with Amazon (LWA). 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param refreshToken Refresh token from Login with Amazon (LWA). 
       * This token is secret.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject), AuthenticationConfigurationProperty {
      /**
       * Client ID from Login with Amazon (LWA).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * Client secret from Login with Amazon (LWA).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()

      /**
       * Refresh token from Login with Amazon (LWA).
       *
       * This token is secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html#cfn-ask-skill-authenticationconfiguration-refreshtoken)
       */
      override fun refreshToken(): String = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthenticationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty
    }
  }

  /**
   * The `Overrides` property type provides overrides to the skill package to apply when creating or
   * updating the skill.
   *
   * Values provided here do not modify the contents of the original skill package. Currently, only
   * overriding values inside of the skill manifest component of the package is supported.
   *
   * `Overrides` is a property of the `Alexa::ASK::Skill SkillPackage` property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.alexa.ask.*;
   * Object manifest;
   * OverridesProperty overridesProperty = OverridesProperty.builder()
   * .manifest(manifest)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html)
   */
  public interface OverridesProperty {
    /**
     * Overrides to apply to the skill manifest inside of the skill package.
     *
     * The skill manifest contains metadata about the skill. For more information, see  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest)
     */
    public fun manifest(): Any? = unwrap(this).getManifest()

    /**
     * A builder for [OverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param manifest Overrides to apply to the skill manifest inside of the skill package.
       * The skill manifest contains metadata about the skill. For more information, see  .
       */
      public fun manifest(manifest: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder =
          software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.builder()

      /**
       * @param manifest Overrides to apply to the skill manifest inside of the skill package.
       * The skill manifest contains metadata about the skill. For more information, see  .
       */
      override fun manifest(manifest: Any) {
        cdkBuilder.manifest(manifest)
      }

      public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty,
    ) : CdkObject(cdkObject), OverridesProperty {
      /**
       * Overrides to apply to the skill manifest inside of the skill package.
       *
       * The skill manifest contains metadata about the skill. For more information, see  .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest)
       */
      override fun manifest(): Any? = unwrap(this).getManifest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty):
          OverridesProperty = CdkObjectWrappers.wrap(cdkObject) as? OverridesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverridesProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty
    }
  }

  /**
   * The `SkillPackage` property type contains configuration details for the skill package that
   * contains the components of the Alexa skill.
   *
   * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
   * skill. More details about the skill package format are located in the  .
   *
   * `SkillPackage` is a property of the `Alexa::ASK::Skill` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.alexa.ask.*;
   * Object manifest;
   * SkillPackageProperty skillPackageProperty = SkillPackageProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * // the properties below are optional
   * .overrides(OverridesProperty.builder()
   * .manifest(manifest)
   * .build())
   * .s3BucketRole("s3BucketRole")
   * .s3ObjectVersion("s3ObjectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html)
   */
  public interface SkillPackageProperty {
    /**
     * Overrides to the skill package to apply when creating or updating the skill.
     *
     * Values provided here do not modify the contents of the original skill package. Currently,
     * only overriding values inside of the skill manifest component of the package is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * The name of the Amazon S3 bucket where the .zip file that contains the skill package is
     * stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * ARN of the IAM role that grants the Alexa service ( `alexa-appkit.amazon.com` ) permission to
     * access the bucket and retrieve the skill package. This property is optional. If you do not
     * provide it, the bucket must be publicly accessible or configured with a policy that allows this
     * access. Otherwise, AWS CloudFormation cannot create the skill.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3bucketrole)
     */
    public fun s3BucketRole(): String? = unwrap(this).getS3BucketRole()

    /**
     * The location and name of the skill package .zip file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3key)
     */
    public fun s3Key(): String

    /**
     * If you have S3 versioning enabled, the version ID of the skill package.zip file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * A builder for [SkillPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      public fun overrides(overrides: OverridesProperty)

      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d27def801a2afcb02efa20e1f4e48fe9a7fbf15c11da0ace5af7d3771bedbcc")
      public fun overrides(overrides: OverridesProperty.Builder.() -> Unit)

      /**
       * @param s3Bucket The name of the Amazon S3 bucket where the .zip file that contains the
       * skill package is stored. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3BucketRole ARN of the IAM role that grants the Alexa service (
       * `alexa-appkit.amazon.com` ) permission to access the bucket and retrieve the skill package.
       * This property is optional. If you do not provide it, the bucket must be publicly accessible or
       * configured with a policy that allows this access. Otherwise, AWS CloudFormation cannot create
       * the skill.
       */
      public fun s3BucketRole(s3BucketRole: String)

      /**
       * @param s3Key The location and name of the skill package .zip file. 
       */
      public fun s3Key(s3Key: String)

      /**
       * @param s3ObjectVersion If you have S3 versioning enabled, the version ID of the skill
       * package.zip file.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder
          = software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.builder()

      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      override fun overrides(overrides: OverridesProperty) {
        cdkBuilder.overrides(overrides.let(OverridesProperty.Companion::unwrap))
      }

      /**
       * @param overrides Overrides to the skill package to apply when creating or updating the
       * skill.
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d27def801a2afcb02efa20e1f4e48fe9a7fbf15c11da0ace5af7d3771bedbcc")
      override fun overrides(overrides: OverridesProperty.Builder.() -> Unit): Unit =
          overrides(OverridesProperty(overrides))

      /**
       * @param s3Bucket The name of the Amazon S3 bucket where the .zip file that contains the
       * skill package is stored. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3BucketRole ARN of the IAM role that grants the Alexa service (
       * `alexa-appkit.amazon.com` ) permission to access the bucket and retrieve the skill package.
       * This property is optional. If you do not provide it, the bucket must be publicly accessible or
       * configured with a policy that allows this access. Otherwise, AWS CloudFormation cannot create
       * the skill.
       */
      override fun s3BucketRole(s3BucketRole: String) {
        cdkBuilder.s3BucketRole(s3BucketRole)
      }

      /**
       * @param s3Key The location and name of the skill package .zip file. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      /**
       * @param s3ObjectVersion If you have S3 versioning enabled, the version ID of the skill
       * package.zip file.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty,
    ) : CdkObject(cdkObject), SkillPackageProperty {
      /**
       * Overrides to the skill package to apply when creating or updating the skill.
       *
       * Values provided here do not modify the contents of the original skill package. Currently,
       * only overriding values inside of the skill manifest component of the package is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()

      /**
       * The name of the Amazon S3 bucket where the .zip file that contains the skill package is
       * stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * ARN of the IAM role that grants the Alexa service ( `alexa-appkit.amazon.com` ) permission
       * to access the bucket and retrieve the skill package. This property is optional. If you do not
       * provide it, the bucket must be publicly accessible or configured with a policy that allows
       * this access. Otherwise, AWS CloudFormation cannot create the skill.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3bucketrole)
       */
      override fun s3BucketRole(): String? = unwrap(this).getS3BucketRole()

      /**
       * The location and name of the skill package .zip file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()

      /**
       * If you have S3 versioning enabled, the version ID of the skill package.zip file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html#cfn-ask-skill-skillpackage-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkillPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty):
          SkillPackageProperty = CdkObjectWrappers.wrap(cdkObject) as? SkillPackageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkillPackageProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty
    }
  }
}
