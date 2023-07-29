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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.constructs.Construct

/**
 * Creates a new instance profile. For information about instance profiles, see
 * [Using instance profiles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html)
 * .
 *
 * For information about the number of instance profiles you can create, see
 * [IAM object quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
 * in the *IAM User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * CfnInstanceProfile cfnInstanceProfile = CfnInstanceProfile.Builder.create(this,
 * "MyCfnInstanceProfile")
 * .roles(List.of("roles"))
 * // the properties below are optional
 * .instanceProfileName("instanceProfileName")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
@CdkDslMarker
public class CfnInstanceProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstanceProfile.Builder =
        CfnInstanceProfile.Builder.create(scope, id)

    private val _roles: MutableList<String> = mutableListOf()

    /**
     * The name of the instance profile to create.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
     *
     * @param instanceProfileName The name of the instance profile to create.
     */
    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * The path to the instance profile.
     *
     * For more information about paths, see
     * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and
     * end with forward slashes. In addition, it can contain any ASCII character from the ! (
     * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
     *
     * @param path The path to the instance profile.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     *
     * @param roles The name of the role to associate with the instance profile.
     */
    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     *
     * @param roles The name of the role to associate with the instance profile.
     */
    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    public fun build(): CfnInstanceProfile {
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        return cdkBuilder.build()
    }
}
