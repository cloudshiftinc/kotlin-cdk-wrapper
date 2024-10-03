@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.alexa.ask

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSkill`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.alexa.ask.*;
 * Object manifest;
 * CfnSkillProps cfnSkillProps = CfnSkillProps.builder()
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
public interface CfnSkillProps {
  /**
   * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
   *
   * Only Login with Amazon clients created through the  are supported. The client ID, client
   * secret, and refresh token are required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
   */
  public fun authenticationConfiguration(): Any

  /**
   * Configuration for the skill package that contains the components of the Alexa skill.
   *
   * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
   * skill. For more information about the skill package format, see the  .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
   */
  public fun skillPackage(): Any

  /**
   * The vendor ID associated with the Amazon developer account that will host the skill.
   *
   * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
   * the developer account associated with this vendor ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid)
   */
  public fun vendorId(): String

  /**
   * A builder for [CfnSkillProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty)

    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9bb8ab40eb8ab6bb8edfdc2a715b761b8195775c10d064a1bdb07cabf1ec34")
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    public fun skillPackage(skillPackage: IResolvable)

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty)

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c74f2bb7339be9d6c7dd6f6a2ba406cbe87985f1183cc662deee0e921b76f2c")
    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty.Builder.() -> Unit)

    /**
     * @param vendorId The vendor ID associated with the Amazon developer account that will host the
     * skill. 
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     */
    public fun vendorId(vendorId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder =
        software.amazon.awscdk.alexa.ask.CfnSkillProps.builder()

    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(CfnSkill.AuthenticationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service. 
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9bb8ab40eb8ab6bb8edfdc2a715b761b8195775c10d064a1bdb07cabf1ec34")
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(CfnSkill.AuthenticationConfigurationProperty(authenticationConfiguration))

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    override fun skillPackage(skillPackage: IResolvable) {
      cdkBuilder.skillPackage(skillPackage.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    override fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
      cdkBuilder.skillPackage(skillPackage.let(CfnSkill.SkillPackageProperty.Companion::unwrap))
    }

    /**
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill. 
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c74f2bb7339be9d6c7dd6f6a2ba406cbe87985f1183cc662deee0e921b76f2c")
    override fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty.Builder.() -> Unit): Unit
        = skillPackage(CfnSkill.SkillPackageProperty(skillPackage))

    /**
     * @param vendorId The vendor ID associated with the Amazon developer account that will host the
     * skill. 
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     */
    override fun vendorId(vendorId: String) {
      cdkBuilder.vendorId(vendorId)
    }

    public fun build(): software.amazon.awscdk.alexa.ask.CfnSkillProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.alexa.ask.CfnSkillProps,
  ) : CdkObject(cdkObject),
      CfnSkillProps {
    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     */
    override fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     */
    override fun skillPackage(): Any = unwrap(this).getSkillPackage()

    /**
     * The vendor ID associated with the Amazon developer account that will host the skill.
     *
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid)
     */
    override fun vendorId(): String = unwrap(this).getVendorId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSkillProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkillProps): CfnSkillProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnSkillProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSkillProps): software.amazon.awscdk.alexa.ask.CfnSkillProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkillProps
  }
}
