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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps

/**
 * Properties for defining a `CfnSecurityConfiguration`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.emr.*;
 * CfnSecurityConfiguration cfnSecurityConfiguration = CfnSecurityConfiguration.Builder.create(this,
 * "EmrSecurityConfiguration")
 * .name("AddStepRuntimeRoleSecConfig")
 * .securityConfiguration(JSON.parse("\n    {\n      \"AuthorizationConfiguration\": {\n
 * \"IAMConfiguration\": {\n              \"EnableApplicationScopedIAMRole\": true,\n
 * \"ApplicationScopedIAMRoleConfiguration\":\n                  {\n
 * \"PropagateSourceIdentity\": true\n                  }\n          },\n
 * \"LakeFormationConfiguration\": {\n              \"AuthorizedSessionTagValue\": \"Amazon EMR\"\n
 *      }\n      }\n    }"))
 * .build();
 * EmrCreateCluster task = EmrCreateCluster.Builder.create(this, "Create Cluster")
 * .instances(InstancesConfigProperty.builder().build())
 * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
 * .securityConfiguration(cfnSecurityConfiguration.getName())
 * .build();
 * Role executionRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ArnPrincipal(task.getClusterRole().getRoleArn()))
 * .build();
 * executionRole.assumeRolePolicy.addStatements(
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(task.getClusterRole()))
 * .actions(List.of("sts:SetSourceIdentity"))
 * .build(),
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(task.getClusterRole()))
 * .actions(List.of("sts:TagSession"))
 * .conditions(Map.of(
 * "StringEquals", Map.of(
 * "aws:RequestTag/LakeFormationAuthorizedCaller", "Amazon EMR")))
 * .build());
 * EmrAddStep.Builder.create(this, "Task")
 * .clusterId("ClusterId")
 * .executionRoleArn(executionRole.getRoleArn())
 * .name("StepName")
 * .jar("Jar")
 * .actionOnFailure(ActionOnFailure.CONTINUE)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationPropsDsl {
    private val cdkBuilder: CfnSecurityConfigurationProps.Builder =
        CfnSecurityConfigurationProps.builder()

    /** @param name The name of the security configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param securityConfiguration The security configuration details in JSON format. */
    public fun securityConfiguration(securityConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(securityConfiguration)
        cdkBuilder.securityConfiguration(builder.map)
    }

    /** @param securityConfiguration The security configuration details in JSON format. */
    public fun securityConfiguration(securityConfiguration: Any) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): CfnSecurityConfigurationProps = cdkBuilder.build()
}
