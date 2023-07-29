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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `BootstrapActionConfig` is a property of `AWS::EMR::Cluster` that can be used to run bootstrap
 * actions on EMR clusters.
 *
 * You can use a bootstrap action to install software and configure EC2 instances for all cluster
 * nodes before EMR installs and configures open-source big data applications on cluster instances.
 * For more information, see
 * [Create Bootstrap Actions to Install Additional Software](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-plan-bootstrap.html)
 * in the *Amazon EMR Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * BootstrapActionConfigProperty bootstrapActionConfigProperty =
 * BootstrapActionConfigProperty.builder()
 * .name("name")
 * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html)
 */
@CdkDslMarker
public class CfnClusterBootstrapActionConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.BootstrapActionConfigProperty.Builder =
        CfnCluster.BootstrapActionConfigProperty.builder()

    /** @param name The name of the bootstrap action. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param scriptBootstrapAction The script run by the bootstrap action. */
    public fun scriptBootstrapAction(scriptBootstrapAction: IResolvable) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
    }

    /** @param scriptBootstrapAction The script run by the bootstrap action. */
    public fun scriptBootstrapAction(
        scriptBootstrapAction: CfnCluster.ScriptBootstrapActionConfigProperty
    ) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
    }

    public fun build(): CfnCluster.BootstrapActionConfigProperty = cdkBuilder.build()
}
