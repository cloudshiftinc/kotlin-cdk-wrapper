@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.constructs.Construct
import kotlin.String

/**
 * Adds cross-account permissions to a signing profile.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnProfilePermissionDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnProfilePermission.Builder = CfnProfilePermission.Builder.create(
        scope,
        id
    )

    /**
     * The AWS Signer action permitted as part of cross-account permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-action)
     * @param action The AWS Signer action permitted as part of cross-account permissions.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * The AWS principal receiving cross-account permissions.
     *
     * This may be an IAM role or another AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-principal)
     * @param principal The AWS principal receiving cross-account permissions.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * The human-readable name of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profilename)
     * @param profileName The human-readable name of the signing profile.
     */
    public fun profileName(profileName: String) {
        cdkBuilder.profileName(profileName)
    }

    /**
     * The version of the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-profileversion)
     * @param profileVersion The version of the signing profile.
     */
    public fun profileVersion(profileVersion: String) {
        cdkBuilder.profileVersion(profileVersion)
    }

    /**
     * A unique identifier for the cross-account permission statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-profilepermission.html#cfn-signer-profilepermission-statementid)
     * @param statementId A unique identifier for the cross-account permission statement.
     */
    public fun statementId(statementId: String) {
        cdkBuilder.statementId(statementId)
    }

    public fun build(): CfnProfilePermission = cdkBuilder.build()
}
