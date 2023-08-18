@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.alexa.ask

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.amazon.awscdk.alexa.ask.CfnSkillProps
import software.constructs.Construct

public object ask {
    /**
     * The `Alexa::ASK::Skill` resource creates an Alexa skill that enables customers to access new
     * abilities.
     *
     * For more information about developing a skill, see the .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.alexa.ask.*;
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
    public inline fun cfnSkill(
        scope: Construct,
        id: String,
        block: CfnSkillDsl.() -> Unit = {},
    ): CfnSkill {
        val builder = CfnSkillDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AuthenticationConfiguration` property type specifies the Login with Amazon (LWA)
     * configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon security profiles created through the are supported for
     * authentication. A client ID, client secret, and refresh token are required. You can generate
     * a client ID and client secret by creating a new on the Amazon Developer Portal or you can
     * retrieve them from an existing profile. You can then retrieve the refresh token using the
     * Alexa Skills Kit CLI. For instructions, see in the .
     *
     * `AuthenticationConfiguration` is a property of the `Alexa::ASK::Skill` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.alexa.ask.*;
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
    public inline fun cfnSkillAuthenticationConfigurationProperty(
        block: CfnSkillAuthenticationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSkill.AuthenticationConfigurationProperty {
        val builder = CfnSkillAuthenticationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Overrides` property type provides overrides to the skill package to apply when creating
     * or updating the skill.
     *
     * Values provided here do not modify the contents of the original skill package. Currently,
     * only overriding values inside of the skill manifest component of the package is supported.
     *
     * `Overrides` is a property of the `Alexa::ASK::Skill SkillPackage` property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.alexa.ask.*;
     * Object manifest;
     * OverridesProperty overridesProperty = OverridesProperty.builder()
     * .manifest(manifest)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html)
     */
    public inline fun cfnSkillOverridesProperty(
        block: CfnSkillOverridesPropertyDsl.() -> Unit = {}
    ): CfnSkill.OverridesProperty {
        val builder = CfnSkillOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSkill`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.alexa.ask.*;
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
    public inline fun cfnSkillProps(block: CfnSkillPropsDsl.() -> Unit = {}): CfnSkillProps {
        val builder = CfnSkillPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SkillPackage` property type contains configuration details for the skill package that
     * contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update
     * the skill. More details about the skill package format are located in the .
     *
     * `SkillPackage` is a property of the `Alexa::ASK::Skill` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.alexa.ask.*;
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
    public inline fun cfnSkillSkillPackageProperty(
        block: CfnSkillSkillPackagePropertyDsl.() -> Unit = {}
    ): CfnSkill.SkillPackageProperty {
        val builder = CfnSkillSkillPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
