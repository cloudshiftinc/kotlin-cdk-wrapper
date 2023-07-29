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
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps

/**
 * Properties for defining a `CfnUserHierarchyGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnUserHierarchyGroupProps cfnUserHierarchyGroupProps = CfnUserHierarchyGroupProps.builder()
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
public class CfnUserHierarchyGroupPropsDsl {
    private val cdkBuilder: CfnUserHierarchyGroupProps.Builder =
        CfnUserHierarchyGroupProps.builder()

    /** @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the user hierarchy group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parentGroupArn The Amazon Resource Name (ARN) of the parent group. */
    public fun parentGroupArn(parentGroupArn: String) {
        cdkBuilder.parentGroupArn(parentGroupArn)
    }

    public fun build(): CfnUserHierarchyGroupProps = cdkBuilder.build()
}
