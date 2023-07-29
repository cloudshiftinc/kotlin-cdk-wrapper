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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.constructs.Construct

/**
 * Creates a trust anchor to establish trust between IAM Roles Anywhere and your certificate
 * authority (CA).
 *
 * You can define a trust anchor as a reference to an AWS Private Certificate Authority ( AWS
 * Private CA ) or by uploading a CA certificate. Your AWS workloads can authenticate with the trust
 * anchor using certificates issued by the CA in exchange for temporary AWS credentials.
 *
 * *Required permissions:* `rolesanywhere:CreateTrustAnchor` .
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
@CdkDslMarker
public class CfnTrustAnchorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrustAnchor.Builder = CfnTrustAnchor.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     *
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     *
     * @param enabled Indicates whether the trust anchor is enabled.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The name of the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-name)
     *
     * @param name The name of the trust anchor.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     *
     * @param source The trust anchor type and its related certificate data.
     */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     *
     * @param source The trust anchor type and its related certificate data.
     */
    public fun source(source: CfnTrustAnchor.SourceProperty) {
        cdkBuilder.source(source)
    }

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     *
     * @param tags The tags to attach to the trust anchor.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     *
     * @param tags The tags to attach to the trust anchor.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustAnchor {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
