@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction
import software.amazon.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ElasticBeanstalkDeployActionDsl {
    private val cdkBuilder: ElasticBeanstalkDeployAction.Builder =
        ElasticBeanstalkDeployAction.Builder.create()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): ElasticBeanstalkDeployAction = cdkBuilder.build()
}
