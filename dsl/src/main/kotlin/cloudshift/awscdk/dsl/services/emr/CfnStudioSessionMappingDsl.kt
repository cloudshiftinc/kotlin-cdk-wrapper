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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.constructs.Construct

/**
 * The `AWS::EMR::StudioSessionMapping` resource is an Amazon EMR resource type that maps a user or
 * group to the Amazon EMR Studio specified by `StudioId` , and applies a session policy that
 * defines Studio permissions for that user or group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CfnStudioSessionMapping cfnStudioSessionMapping = CfnStudioSessionMapping.Builder.create(this,
 * "MyCfnStudioSessionMapping")
 * .identityName("identityName")
 * .identityType("identityType")
 * .sessionPolicyArn("sessionPolicyArn")
 * .studioId("studioId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html)
 */
@CdkDslMarker
public class CfnStudioSessionMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStudioSessionMapping.Builder =
        CfnStudioSessionMapping.Builder.create(scope, id)

    /**
     * The name of the user or group.
     *
     * For more information, see
     * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
     * and
     * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
     * in the *IAM Identity Center Identity Store API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identityname)
     *
     * @param identityName The name of the user or group.
     */
    public fun identityName(identityName: String) {
        cdkBuilder.identityName(identityName)
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identitytype)
     *
     * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a user
     *   or a group.
     */
    public fun identityType(identityType: String) {
        cdkBuilder.identityType(identityType)
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
     * group.
     *
     * Session policies refine Studio user permissions without the need to use multiple IAM user
     * roles. For more information, see
     * [Create an EMR Studio user role with session policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html)
     * in the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-sessionpolicyarn)
     *
     * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be
     *   applied to the user or group.
     */
    public fun sessionPolicyArn(sessionPolicyArn: String) {
        cdkBuilder.sessionPolicyArn(sessionPolicyArn)
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-studioid)
     *
     * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped.
     */
    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    public fun build(): CfnStudioSessionMapping = cdkBuilder.build()
}
