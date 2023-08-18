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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnAssetProps

/**
 * Properties for defining a `CfnAsset`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CfnAssetProps cfnAssetProps = CfnAssetProps.builder()
 * .id("id")
 * .packagingGroupId("packagingGroupId")
 * .sourceArn("sourceArn")
 * .sourceRoleArn("sourceRoleArn")
 * // the properties below are optional
 * .egressEndpoints(List.of(EgressEndpointProperty.builder()
 * .packagingConfigurationId("packagingConfigurationId")
 * .url("url")
 * .build()))
 * .resourceId("resourceId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html)
 */
@CdkDslMarker
public class CfnAssetPropsDsl {
    private val cdkBuilder: CfnAssetProps.Builder = CfnAssetProps.builder()

    private val _egressEndpoints: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param egressEndpoints List of playback endpoints that are available for this asset. */
    public fun egressEndpoints(vararg egressEndpoints: Any) {
        _egressEndpoints.addAll(listOf(*egressEndpoints))
    }

    /** @param egressEndpoints List of playback endpoints that are available for this asset. */
    public fun egressEndpoints(egressEndpoints: Collection<Any>) {
        _egressEndpoints.addAll(egressEndpoints)
    }

    /** @param egressEndpoints List of playback endpoints that are available for this asset. */
    public fun egressEndpoints(egressEndpoints: IResolvable) {
        cdkBuilder.egressEndpoints(egressEndpoints)
    }

    /** @param id Unique identifier that you assign to the asset. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param packagingGroupId The ID of the packaging group associated with this asset. */
    public fun packagingGroupId(packagingGroupId: String) {
        cdkBuilder.packagingGroupId(packagingGroupId)
    }

    /**
     * @param resourceId Unique identifier for this asset, as it's configured in the key provider
     *   service.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param sourceArn The ARN for the source content in Amazon S3. */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage access
     *   to the Amazon S3 bucket where the source content is stored. Valid format:
     *   arn:aws:iam::{accountID}:role/{name}
     */
    public fun sourceRoleArn(sourceRoleArn: String) {
        cdkBuilder.sourceRoleArn(sourceRoleArn)
    }

    /** @param tags The tags to assign to the asset. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the asset. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssetProps {
        if (_egressEndpoints.isNotEmpty()) cdkBuilder.egressEndpoints(_egressEndpoints)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
