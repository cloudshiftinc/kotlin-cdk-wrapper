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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.CustomizeRolesOptions

/**
 * Options for customizing IAM role creation.
 *
 * Example:
 * ```
 * App app;
 * Stack stack = new Stack(app, "MyStack");
 * Role.customizeRoles(this, CustomizeRolesOptions.builder()
 * .usePrecreatedRoles(Map.of(
 * "MyStack/MyLambda/ServiceRole", "my-role-name"))
 * .build());
 * ```
 */
@CdkDslMarker
public class CustomizeRolesOptionsDsl {
    private val cdkBuilder: CustomizeRolesOptions.Builder = CustomizeRolesOptions.builder()

    /**
     * @param preventSynthesis Whether or not to synthesize the resource into the CFN template. Set
     *   this to `false` if you still want to create the resources *and* you also want to create the
     *   policy report.
     */
    public fun preventSynthesis(preventSynthesis: Boolean) {
        cdkBuilder.preventSynthesis(preventSynthesis)
    }

    /**
     * @param usePrecreatedRoles A list of precreated IAM roles to substitute for roles that CDK is
     *   creating. The constructPath can be either a relative or absolute path from the scope that
     *   `customizeRoles` is used on to the role being created.
     */
    public fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>) {
        cdkBuilder.usePrecreatedRoles(usePrecreatedRoles)
    }

    public fun build(): CustomizeRolesOptions = cdkBuilder.build()
}
