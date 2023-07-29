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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroup
import software.constructs.Construct

/**
 * Specifies a new user hierarchy group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnUserHierarchyGroup cfnUserHierarchyGroup = CfnUserHierarchyGroup.Builder.create(this,
 * "MyCfnUserHierarchyGroup")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .parentGroupArn("parentGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html)
 */
@CdkDslMarker
public class CfnUserHierarchyGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserHierarchyGroup.Builder =
        CfnUserHierarchyGroup.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the user hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-instancearn)
     *
     * @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the user hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-name)
     *
     * @param name The name of the user hierarchy group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the parent group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-parentgrouparn)
     *
     * @param parentGroupArn The Amazon Resource Name (ARN) of the parent group.
     */
    public fun parentGroupArn(parentGroupArn: String) {
        cdkBuilder.parentGroupArn(parentGroupArn)
    }

    public fun build(): CfnUserHierarchyGroup = cdkBuilder.build()
}
