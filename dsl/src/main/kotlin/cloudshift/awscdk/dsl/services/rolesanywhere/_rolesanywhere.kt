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

package cloudshift.awscdk.dsl.services.rolesanywhere

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnCRL
import software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
import software.amazon.awscdk.services.rolesanywhere.CfnProfile
import software.amazon.awscdk.services.rolesanywhere.CfnProfileProps
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
import software.constructs.Construct

public object rolesanywhere {
    /**
     * Creates a Crl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnCRL cfnCRL = CfnCRL.Builder.create(this, "MyCfnCRL")
     * .crlData("crlData")
     * .name("name")
     * // the properties below are optional
     * .enabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trustAnchorArn("trustAnchorArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html)
     */
    public inline fun cfnCRL(
        scope: Construct,
        id: String,
        block: CfnCRLDsl.() -> Unit = {},
    ): CfnCRL {
        val builder = CfnCRLDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCRL`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnCRLProps cfnCRLProps = CfnCRLProps.builder()
     * .crlData("crlData")
     * .name("name")
     * // the properties below are optional
     * .enabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trustAnchorArn("trustAnchorArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html)
     */
    public inline fun cfnCRLProps(block: CfnCRLPropsDsl.() -> Unit = {}): CfnCRLProps {
        val builder = CfnCRLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnProfile cfnProfile = CfnProfile.Builder.create(this, "MyCfnProfile")
     * .name("name")
     * .roleArns(List.of("roleArns"))
     * // the properties below are optional
     * .durationSeconds(123)
     * .enabled(false)
     * .managedPolicyArns(List.of("managedPolicyArns"))
     * .requireInstanceProperties(false)
     * .sessionPolicy("sessionPolicy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html)
     */
    public inline fun cfnProfile(
        scope: Construct,
        id: String,
        block: CfnProfileDsl.() -> Unit = {},
    ): CfnProfile {
        val builder = CfnProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
     * .name("name")
     * .roleArns(List.of("roleArns"))
     * // the properties below are optional
     * .durationSeconds(123)
     * .enabled(false)
     * .managedPolicyArns(List.of("managedPolicyArns"))
     * .requireInstanceProperties(false)
     * .sessionPolicy("sessionPolicy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html)
     */
    public inline fun cfnProfileProps(block: CfnProfilePropsDsl.() -> Unit = {}): CfnProfileProps {
        val builder = CfnProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a TrustAnchor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnTrustAnchor cfnTrustAnchor = CfnTrustAnchor.Builder.create(this, "MyCfnTrustAnchor")
     * .name("name")
     * .source(SourceProperty.builder()
     * .sourceData(SourceDataProperty.builder()
     * .acmPcaArn("acmPcaArn")
     * .x509CertificateData("x509CertificateData")
     * .build())
     * .sourceType("sourceType")
     * .build())
     * // the properties below are optional
     * .enabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html)
     */
    public inline fun cfnTrustAnchor(
        scope: Construct,
        id: String,
        block: CfnTrustAnchorDsl.() -> Unit = {},
    ): CfnTrustAnchor {
        val builder = CfnTrustAnchorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrustAnchor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * CfnTrustAnchorProps cfnTrustAnchorProps = CfnTrustAnchorProps.builder()
     * .name("name")
     * .source(SourceProperty.builder()
     * .sourceData(SourceDataProperty.builder()
     * .acmPcaArn("acmPcaArn")
     * .x509CertificateData("x509CertificateData")
     * .build())
     * .sourceType("sourceType")
     * .build())
     * // the properties below are optional
     * .enabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html)
     */
    public inline fun cfnTrustAnchorProps(
        block: CfnTrustAnchorPropsDsl.() -> Unit = {}
    ): CfnTrustAnchorProps {
        val builder = CfnTrustAnchorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A union object representing the data field of the TrustAnchor depending on its type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * SourceDataProperty sourceDataProperty = SourceDataProperty.builder()
     * .acmPcaArn("acmPcaArn")
     * .x509CertificateData("x509CertificateData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html)
     */
    public inline fun cfnTrustAnchorSourceDataProperty(
        block: CfnTrustAnchorSourceDataPropertyDsl.() -> Unit = {}
    ): CfnTrustAnchor.SourceDataProperty {
        val builder = CfnTrustAnchorSourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Object representing the TrustAnchor type and its related certificate data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rolesanywhere.*;
     * SourceProperty sourceProperty = SourceProperty.builder()
     * .sourceData(SourceDataProperty.builder()
     * .acmPcaArn("acmPcaArn")
     * .x509CertificateData("x509CertificateData")
     * .build())
     * .sourceType("sourceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html)
     */
    public inline fun cfnTrustAnchorSourceProperty(
        block: CfnTrustAnchorSourcePropertyDsl.() -> Unit = {}
    ): CfnTrustAnchor.SourceProperty {
        val builder = CfnTrustAnchorSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
