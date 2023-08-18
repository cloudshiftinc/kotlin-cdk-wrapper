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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.Activity
import software.constructs.Construct

/**
 * Define a new Step Functions Activity.
 *
 * Example:
 * ```
 * Activity activity = new Activity(this, "Activity");
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .build();
 * activity.grant(role, "states:SendTaskSuccess");
 * ```
 */
@CdkDslMarker
public class ActivityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Activity.Builder = Activity.Builder.create(scope, id)

    /**
     * The name for this activity.
     *
     * Default: - If not supplied, a name is generated
     *
     * @param activityName The name for this activity.
     */
    public fun activityName(activityName: String) {
        cdkBuilder.activityName(activityName)
    }

    public fun build(): Activity = cdkBuilder.build()
}
