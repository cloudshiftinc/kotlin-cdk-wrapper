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
import software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps

/**
 * Properties for defining a `CfnSnapshotBlockPublicAccess`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSnapshotBlockPublicAccessProps cfnSnapshotBlockPublicAccessProps =
 * CfnSnapshotBlockPublicAccessProps.builder()
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-snapshotblockpublicaccess.html)
 */
@CdkDslMarker
public class CfnSnapshotBlockPublicAccessPropsDsl {
    private val cdkBuilder: CfnSnapshotBlockPublicAccessProps.Builder =
        CfnSnapshotBlockPublicAccessProps.builder()

    /**
     * @param state The mode in which to enable block public access for snapshots for the Region.
     *   Specify one of the following values:
     * * `block-all-sharing` - Prevents all public sharing of snapshots in the Region. Users in the
     *   account will no longer be able to request new public sharing. Additionally, snapshots that
     *   are already publicly shared are treated as private and they are no longer publicly
     *   available.
     *
     * If you enable block public access for snapshots in `block-all-sharing` mode, it does not
     * change the permissions for snapshots that are already publicly shared. Instead, it prevents
     * these snapshots from be publicly visible and publicly accessible. Therefore, the attributes
     * for these snapshots still indicate that they are publicly shared, even though they are not
     * publicly available.
     * * `block-new-sharing` - Prevents only new public sharing of snapshots in the Region. Users in
     *   the account will no longer be able to request new public sharing. However, snapshots that
     *   are already publicly shared, remain publicly available.
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnSnapshotBlockPublicAccessProps = cdkBuilder.build()
}
