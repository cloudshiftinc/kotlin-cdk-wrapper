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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnComponentProps

/**
 * Properties for defining a `CfnComponent`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * CfnComponentProps cfnComponentProps = CfnComponentProps.builder()
 * .name("name")
 * .platform("platform")
 * .version("version")
 * // the properties below are optional
 * .changeDescription("changeDescription")
 * .data("data")
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .supportedOsVersions(List.of("supportedOsVersions"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
 */
@CdkDslMarker
public class CfnComponentPropsDsl {
    private val cdkBuilder: CfnComponentProps.Builder = CfnComponentProps.builder()

    private val _supportedOsVersions: MutableList<String> = mutableListOf()

    /**
     * @param changeDescription The change description of the component. Describes what change has
     *   been made in this version, or what makes this version different from other versions of the
     *   component.
     */
    public fun changeDescription(changeDescription: String) {
        cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * @param data Component `data` contains inline YAML document content for the component.
     *   Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     *   However, you cannot specify both properties.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /** @param description Describes the contents of the component. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param kmsKeyId The ID of the KMS key that is used to encrypt this component. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param name The name of the component. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param platform The operating system platform of the component. */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component. If
     *   the OS information is available, a prefix match is performed against the base image OS
     *   version during image recipe creation.
     */
    public fun supportedOsVersions(vararg supportedOsVersions: String) {
        _supportedOsVersions.addAll(listOf(*supportedOsVersions))
    }

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component. If
     *   the OS information is available, a prefix match is performed against the base image OS
     *   version during image recipe creation.
     */
    public fun supportedOsVersions(supportedOsVersions: Collection<String>) {
        _supportedOsVersions.addAll(supportedOsVersions)
    }

    /** @param tags The tags that apply to the component. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param uri The `uri` of a YAML component document file. This must be an S3 URL (
     *   `s3://bucket/key` ), and the requester must have permission to access the S3 bucket it
     *   points to. If you use Amazon S3, you can specify component content up to your service
     *   quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    /** @param version The component version. For example, `1.0.0` . */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnComponentProps {
        if (_supportedOsVersions.isNotEmpty()) cdkBuilder.supportedOsVersions(_supportedOsVersions)
        return cdkBuilder.build()
    }
}
