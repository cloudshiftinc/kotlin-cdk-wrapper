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

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.signer.CfnProfilePermissionProps

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
@CdkDslMarker
public class CfnProfilePermissionPropsDsl {
    private val cdkBuilder: CfnProfilePermissionProps.Builder = CfnProfilePermissionProps.builder()

    /** @param action The AWS Signer action permitted as part of cross-account permissions. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param principal The AWS principal receiving cross-account permissions. This may be an IAM
     *   role or another AWS account ID.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /** @param profileName The human-readable name of the signing profile. */
    public fun profileName(profileName: String) {
        cdkBuilder.profileName(profileName)
    }

    /** @param profileVersion The version of the signing profile. */
    public fun profileVersion(profileVersion: String) {
        cdkBuilder.profileVersion(profileVersion)
    }

    /** @param statementId A unique identifier for the cross-account permission statement. */
    public fun statementId(statementId: String) {
        cdkBuilder.statementId(statementId)
    }

    public fun build(): CfnProfilePermissionProps = cdkBuilder.build()
}
