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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CacheControl
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.IBucket

/**
 * Deploys the sourceArtifact to Amazon S3.
 *
 * Example:
 * ```
 * S3SourceAction sourceAction;
 * Artifact sourceOutput;
 * Bucket deployBucket;
 * Pipeline.Builder.create(this, "Pipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * S3DeployAction.Builder.create()
 * .actionName("DeployAction")
 * // can reference the variables
 * .objectKey(String.format("%s.txt", sourceAction.getVariables().getVersionId()))
 * .input(sourceOutput)
 * .bucket(deployBucket)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class S3DeployActionDsl {
    private val cdkBuilder: S3DeployAction.Builder = S3DeployAction.Builder.create()

    private val _cacheControl: MutableList<CacheControl> = mutableListOf()

    /**
     * The specified canned ACL to objects deployed to Amazon S3.
     *
     * This overwrites any existing ACL that was applied to the object.
     *
     * Default: - the original object ACL
     *
     * @param accessControl The specified canned ACL to objects deployed to Amazon S3.
     */
    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * The Amazon S3 bucket that is the deploy target.
     *
     * @param bucket The Amazon S3 bucket that is the deploy target.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     */
    public fun cacheControl(vararg cacheControl: CacheControl) {
        _cacheControl.addAll(listOf(*cacheControl))
    }

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     */
    public fun cacheControl(cacheControl: Collection<CacheControl>) {
        _cacheControl.addAll(cacheControl)
    }

    /**
     * The AWS KMS encryption key for the host bucket.
     *
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     *
     * Default: - none
     *
     * @param encryptionKey The AWS KMS encryption key for the host bucket.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Should the deploy action extract the artifact before deploying to Amazon S3.
     *
     * Default: true
     *
     * @param extract Should the deploy action extract the artifact before deploying to Amazon S3.
     */
    public fun extract(extract: Boolean) {
        cdkBuilder.extract(extract)
    }

    /**
     * The input Artifact to deploy to Amazon S3.
     *
     * @param input The input Artifact to deploy to Amazon S3.
     */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * The key of the target object.
     *
     * This is required if extract is false.
     *
     * @param objectKey The key of the target object.
     */
    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): S3DeployAction {
        if (_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
        return cdkBuilder.build()
    }
}
