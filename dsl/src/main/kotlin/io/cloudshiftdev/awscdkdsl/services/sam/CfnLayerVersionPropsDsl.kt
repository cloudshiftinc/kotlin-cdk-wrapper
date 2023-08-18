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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps

/**
 * Properties for defining a `CfnLayerVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CfnLayerVersionProps cfnLayerVersionProps = CfnLayerVersionProps.builder()
 * .compatibleRuntimes(List.of("compatibleRuntimes"))
 * .contentUri("contentUri")
 * .description("description")
 * .layerName("layerName")
 * .licenseInfo("licenseInfo")
 * .retentionPolicy("retentionPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html)
 */
@CdkDslMarker
public class CfnLayerVersionPropsDsl {
    private val cdkBuilder: CfnLayerVersionProps.Builder = CfnLayerVersionProps.builder()

    private val _compatibleRuntimes: MutableList<String> = mutableListOf()

    /** @param compatibleRuntimes the value to be set. */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    /** @param compatibleRuntimes the value to be set. */
    public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    /** @param contentUri the value to be set. */
    public fun contentUri(contentUri: String) {
        cdkBuilder.contentUri(contentUri)
    }

    /** @param contentUri the value to be set. */
    public fun contentUri(contentUri: IResolvable) {
        cdkBuilder.contentUri(contentUri)
    }

    /** @param contentUri the value to be set. */
    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
        cdkBuilder.contentUri(contentUri)
    }

    /** @param description the value to be set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param layerName the value to be set. */
    public fun layerName(layerName: String) {
        cdkBuilder.layerName(layerName)
    }

    /** @param licenseInfo the value to be set. */
    public fun licenseInfo(licenseInfo: String) {
        cdkBuilder.licenseInfo(licenseInfo)
    }

    /** @param retentionPolicy the value to be set. */
    public fun retentionPolicy(retentionPolicy: String) {
        cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): CfnLayerVersionProps {
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
