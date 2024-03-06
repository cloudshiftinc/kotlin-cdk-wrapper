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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A structure that contains the configuration of a shareable link to the dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LinkSharingConfigurationProperty linkSharingConfigurationProperty =
 * LinkSharingConfigurationProperty.builder()
 * .permissions(List.of(ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * // the properties below are optional
 * .resource("resource")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-linksharingconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardLinkSharingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.LinkSharingConfigurationProperty.Builder =
        CfnDashboard.LinkSharingConfigurationProperty.builder()

    private val _permissions: MutableList<Any> = mutableListOf()

    /** @param permissions A structure that contains the permissions of a shareable link. */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /** @param permissions A structure that contains the permissions of a shareable link. */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /** @param permissions A structure that contains the permissions of a shareable link. */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    public fun build(): CfnDashboard.LinkSharingConfigurationProperty {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
