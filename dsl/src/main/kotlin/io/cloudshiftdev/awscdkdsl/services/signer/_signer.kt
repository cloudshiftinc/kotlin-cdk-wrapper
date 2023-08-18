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

package io.cloudshiftdev.awscdkdsl.services.signer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.amazon.awscdk.services.signer.CfnProfilePermissionProps
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.amazon.awscdk.services.signer.CfnSigningProfileProps
import software.amazon.awscdk.services.signer.SigningProfile
import software.amazon.awscdk.services.signer.SigningProfileAttributes
import software.amazon.awscdk.services.signer.SigningProfileProps
import software.constructs.Construct

public object signer {
    /**
     * Adds cross-account permissions to a signing profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
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
    public inline fun cfnProfilePermission(
        scope: Construct,
        id: String,
        block: CfnProfilePermissionDsl.() -> Unit = {},
    ): CfnProfilePermission {
        val builder = CfnProfilePermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProfilePermission`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
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
    public inline fun cfnProfilePermissionProps(
        block: CfnProfilePermissionPropsDsl.() -> Unit = {}
    ): CfnProfilePermissionProps {
        val builder = CfnProfilePermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a signing profile.
     *
     * A signing profile is a code-signing template that can be used to carry out a pre-defined
     * signing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
     * CfnSigningProfile cfnSigningProfile = CfnSigningProfile.Builder.create(this,
     * "MyCfnSigningProfile")
     * .platformId("platformId")
     * // the properties below are optional
     * .signatureValidityPeriod(SignatureValidityPeriodProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html)
     */
    public inline fun cfnSigningProfile(
        scope: Construct,
        id: String,
        block: CfnSigningProfileDsl.() -> Unit = {},
    ): CfnSigningProfile {
        val builder = CfnSigningProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSigningProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
     * CfnSigningProfileProps cfnSigningProfileProps = CfnSigningProfileProps.builder()
     * .platformId("platformId")
     * // the properties below are optional
     * .signatureValidityPeriod(SignatureValidityPeriodProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html)
     */
    public inline fun cfnSigningProfileProps(
        block: CfnSigningProfilePropsDsl.() -> Unit = {}
    ): CfnSigningProfileProps {
        val builder = CfnSigningProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The validity period for the signing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
     * SignatureValidityPeriodProperty signatureValidityPeriodProperty =
     * SignatureValidityPeriodProperty.builder()
     * .type("type")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html)
     */
    public inline fun cfnSigningProfileSignatureValidityPeriodProperty(
        block: CfnSigningProfileSignatureValidityPeriodPropertyDsl.() -> Unit = {}
    ): CfnSigningProfile.SignatureValidityPeriodProperty {
        val builder = CfnSigningProfileSignatureValidityPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a Signing Profile.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun signingProfile(
        scope: Construct,
        id: String,
        block: SigningProfileDsl.() -> Unit = {},
    ): SigningProfile {
        val builder = SigningProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to a Signing Profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfileAttributes signingProfileAttributes = SigningProfileAttributes.builder()
     * .signingProfileName("signingProfileName")
     * .signingProfileVersion("signingProfileVersion")
     * .build();
     * ```
     */
    public inline fun signingProfileAttributes(
        block: SigningProfileAttributesDsl.() -> Unit = {}
    ): SigningProfileAttributes {
        val builder = SigningProfileAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a Signing Profile object.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun signingProfileProps(
        block: SigningProfilePropsDsl.() -> Unit = {}
    ): SigningProfileProps {
        val builder = SigningProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
