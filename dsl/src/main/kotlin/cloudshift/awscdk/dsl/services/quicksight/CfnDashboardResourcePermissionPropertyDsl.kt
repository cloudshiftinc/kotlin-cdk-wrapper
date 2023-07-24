@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Permission for the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ResourcePermissionProperty resourcePermissionProperty = ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * // the properties below are optional
 * .resource("resource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-resourcepermission.html)
 */
@CdkDslMarker
public class CfnDashboardResourcePermissionPropertyDsl {
    private val cdkBuilder: CfnDashboard.ResourcePermissionProperty.Builder =
        CfnDashboard.ResourcePermissionProperty.builder()

    private val _actions: MutableList<String> = mutableListOf()

    /**
     * @param actions The IAM action to grant or revoke permissions on.
     */
    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * @param actions The IAM action to grant or revoke permissions on.
     */
    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    /**
     * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
     * following:.
     * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This
     * is common.)
     * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
     * dashboard, template, or theme. (This is common.)
     * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN. Use
     * this option only to share resources (templates) across AWS accounts . (This is less common.)
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * @param resource the value to be set.
     */
    public fun resource(resource: String) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnDashboard.ResourcePermissionProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
