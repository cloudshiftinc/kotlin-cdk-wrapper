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

package io.cloudshiftdev.awscdkdsl.services.codecommit

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codecommit.Code
import software.amazon.awscdk.services.codecommit.Repository
import software.constructs.Construct

/**
 * Provides a CodeCommit Repository.
 *
 * Example:
 * ```
 * PipelineProject project;
 * Repository repository = Repository.Builder.create(this, "MyRepository")
 * .repositoryName("MyRepository")
 * .build();
 * PipelineProject project = new PipelineProject(this, "MyProject");
 * Artifact sourceOutput = new Artifact();
 * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
 * .actionName("CodeCommit")
 * .repository(repository)
 * .output(sourceOutput)
 * .build();
 * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .outputs(List.of(new Artifact())) // optional
 * .executeBatchBuild(true) // optional, defaults to false
 * .combineBatchBuildArtifacts(true)
 * .build();
 * Pipeline.Builder.create(this, "MyPipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class RepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Repository.Builder = Repository.Builder.create(scope, id)

    /**
     * The contents with which to initialize the repository after it has been created.
     *
     * Default: - No initialization (create empty repo)
     *
     * @param code The contents with which to initialize the repository after it has been created.
     */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /**
     * A description of the repository.
     *
     * Use the description to identify the purpose of the repository.
     *
     * Default: - No description.
     *
     * @param description A description of the repository.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Name of the repository.
     *
     * This property is required for all CodeCommit repositories.
     *
     * @param repositoryName Name of the repository.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): Repository = cdkBuilder.build()
}
