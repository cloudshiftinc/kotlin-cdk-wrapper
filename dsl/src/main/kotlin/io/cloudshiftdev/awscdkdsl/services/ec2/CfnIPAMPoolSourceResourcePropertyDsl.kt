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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMPool

/**
 * The resource used to provision CIDRs to a resource planning pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SourceResourceProperty sourceResourceProperty = SourceResourceProperty.builder()
 * .resourceId("resourceId")
 * .resourceOwner("resourceOwner")
 * .resourceRegion("resourceRegion")
 * .resourceType("resourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html)
 */
@CdkDslMarker
public class CfnIPAMPoolSourceResourcePropertyDsl {
    private val cdkBuilder: CfnIPAMPool.SourceResourceProperty.Builder =
        CfnIPAMPool.SourceResourceProperty.builder()

    /** @param resourceId The source resource ID. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param resourceOwner The source resource owner. */
    public fun resourceOwner(resourceOwner: String) {
        cdkBuilder.resourceOwner(resourceOwner)
    }

    /** @param resourceRegion The source resource Region. */
    public fun resourceRegion(resourceRegion: String) {
        cdkBuilder.resourceRegion(resourceRegion)
    }

    /** @param resourceType The source resource type. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun build(): CfnIPAMPool.SourceResourceProperty = cdkBuilder.build()
}
