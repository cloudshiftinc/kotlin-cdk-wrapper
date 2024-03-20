@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.BucketAccessControl
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Deploys the sourceArtifact to Amazon S3.
 *
 * Example:
 *
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
public open class S3DeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.S3DeployAction,
) : Action(cdkObject) {
  public constructor(props: S3DeployActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.S3DeployAction(props.let(S3DeployActionProps::unwrap))
  )

  public constructor(props: S3DeployActionProps.Builder.() -> Unit) :
      this(S3DeployActionProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.S3DeployAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The specified canned ACL to objects deployed to Amazon S3.
     *
     * This overwrites any existing ACL that was applied to the object.
     *
     * Default: - the original object ACL
     *
     * @param accessControl The specified canned ACL to objects deployed to Amazon S3. 
     */
    public fun accessControl(accessControl: BucketAccessControl)

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The Amazon S3 bucket that is the deploy target.
     *
     * @param bucket The Amazon S3 bucket that is the deploy target. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket. 
     */
    public fun cacheControl(cacheControl: List<CacheControl>)

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket. 
     */
    public fun cacheControl(vararg cacheControl: CacheControl)

    /**
     * The AWS KMS encryption key for the host bucket.
     *
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     *
     * Default: - none
     *
     * @param encryptionKey The AWS KMS encryption key for the host bucket. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Should the deploy action extract the artifact before deploying to Amazon S3.
     *
     * Default: true
     *
     * @param extract Should the deploy action extract the artifact before deploying to Amazon S3. 
     */
    public fun extract(extract: Boolean)

    /**
     * The input Artifact to deploy to Amazon S3.
     *
     * @param input The input Artifact to deploy to Amazon S3. 
     */
    public fun input(input: Artifact)

    /**
     * The key of the target object.
     *
     * This is required if extract is false.
     *
     * @param objectKey The key of the target object. 
     */
    public fun objectKey(objectKey: String)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction.Builder.create()

    /**
     * The specified canned ACL to objects deployed to Amazon S3.
     *
     * This overwrites any existing ACL that was applied to the object.
     *
     * Default: - the original object ACL
     *
     * @param accessControl The specified canned ACL to objects deployed to Amazon S3. 
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The Amazon S3 bucket that is the deploy target.
     *
     * @param bucket The Amazon S3 bucket that is the deploy target. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket. 
     */
    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     *
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket. 
     */
    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    /**
     * The AWS KMS encryption key for the host bucket.
     *
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     *
     * Default: - none
     *
     * @param encryptionKey The AWS KMS encryption key for the host bucket. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Should the deploy action extract the artifact before deploying to Amazon S3.
     *
     * Default: true
     *
     * @param extract Should the deploy action extract the artifact before deploying to Amazon S3. 
     */
    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    /**
     * The input Artifact to deploy to Amazon S3.
     *
     * @param input The input Artifact to deploy to Amazon S3. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    /**
     * The key of the target object.
     *
     * This is required if extract is false.
     *
     * @param objectKey The key of the target object. 
     */
    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3DeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DeployAction {
      val builderImpl = BuilderImpl()
      return S3DeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3DeployAction):
        S3DeployAction = S3DeployAction(cdkObject)

    internal fun unwrap(wrapped: S3DeployAction):
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction = wrapped.cdkObject
  }
}
