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

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties of `EcrSourceAction`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecr.*;
 * Repository ecrRepository;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact sourceOutput = new Artifact();
 * EcrSourceAction sourceAction = EcrSourceAction.Builder.create()
 * .actionName("ECR")
 * .repository(ecrRepository)
 * .imageTag("some-tag") // optional, default: 'latest'
 * .output(sourceOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class EcrSourceActionPropsDsl {
    private val cdkBuilder: EcrSourceActionProps.Builder = EcrSourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param imageTag The image tag that will be checked for changes. It is not possible to trigger
     *   on changes to more than one tag.
     */
    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    /** @param output the value to be set. */
    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    /** @param repository The repository that will be watched for changes. */
    public fun repository(repository: IRepository) {
        cdkBuilder.repository(repository)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): EcrSourceActionProps = cdkBuilder.build()
}
