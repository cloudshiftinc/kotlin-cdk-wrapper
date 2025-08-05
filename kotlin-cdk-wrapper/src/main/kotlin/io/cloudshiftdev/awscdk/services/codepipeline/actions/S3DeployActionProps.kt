@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
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
 * Construction properties of the `S3DeployAction S3 deploy Action`.
 *
 * Example:
 *
 * ```
 * Artifact sourceArtifact;
 * Artifact outputArtifact;
 * CommandsAction commandsAction = CommandsAction.Builder.create()
 * .actionName("Commands")
 * .commands(List.of("export MY_OUTPUT=my-key"))
 * .input(sourceArtifact)
 * .output(outputArtifact)
 * .outputVariables(List.of("MY_OUTPUT", "CODEBUILD_BUILD_ID"))
 * .build();
 * // Deploy action
 * S3DeployAction deployAction = S3DeployAction.Builder.create()
 * .actionName("DeployAction")
 * .extract(true)
 * .input(outputArtifact)
 * .bucket(new Bucket(this, "DeployBucket"))
 * .objectKey(commandsAction.variable("MY_OUTPUT"))
 * .build();
 * ```
 */
public interface S3DeployActionProps : CommonAwsActionProps {
  /**
   * The specified canned ACL to objects deployed to Amazon S3.
   *
   * This overwrites any existing ACL that was applied to the object.
   *
   * Default: - the original object ACL
   */
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  /**
   * The Amazon S3 bucket that is the deploy target.
   */
  public fun bucket(): IBucket

  /**
   * The caching behavior for requests/responses for objects in the bucket.
   *
   * The final cache control property will be the result of joining all of the provided array
   * elements with a comma
   * (plus a space after the comma).
   *
   * Default: - none, decided by the HTTP client
   */
  public fun cacheControl(): List<CacheControl> =
      unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

  /**
   * The AWS KMS encryption key for the host bucket.
   *
   * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
   *
   * Default: - none
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Should the deploy action extract the artifact before deploying to Amazon S3.
   *
   * Default: true
   */
  public fun extract(): Boolean? = unwrap(this).getExtract()

  /**
   * The input Artifact to deploy to Amazon S3.
   */
  public fun input(): Artifact

  /**
   * The key of the target object.
   *
   * This is required if extract is false.
   */
  public fun objectKey(): String? = unwrap(this).getObjectKey()

  /**
   * A builder for [S3DeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControl The specified canned ACL to objects deployed to Amazon S3.
     * This overwrites any existing ACL that was applied to the object.
     */
    public fun accessControl(accessControl: BucketAccessControl)

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param bucket The Amazon S3 bucket that is the deploy target. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     */
    public fun cacheControl(cacheControl: List<CacheControl>)

    /**
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     */
    public fun cacheControl(vararg cacheControl: CacheControl)

    /**
     * @param encryptionKey The AWS KMS encryption key for the host bucket.
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param extract Should the deploy action extract the artifact before deploying to Amazon S3.
     */
    public fun extract(extract: Boolean)

    /**
     * @param input The input Artifact to deploy to Amazon S3. 
     */
    public fun input(input: Artifact)

    /**
     * @param objectKey The key of the target object.
     * This is required if extract is false.
     */
    public fun objectKey(objectKey: String)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.builder()

    /**
     * @param accessControl The specified canned ACL to objects deployed to Amazon S3.
     * This overwrites any existing ACL that was applied to the object.
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl.Companion::unwrap))
    }

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param bucket The Amazon S3 bucket that is the deploy target. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     */
    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl.Companion::unwrap))
    }

    /**
     * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     */
    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    /**
     * @param encryptionKey The AWS KMS encryption key for the host bucket.
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param extract Should the deploy action extract the artifact before deploying to Amazon S3.
     */
    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    /**
     * @param input The input Artifact to deploy to Amazon S3. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param objectKey The key of the target object.
     * This is required if extract is false.
     */
    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps,
  ) : CdkObject(cdkObject),
      S3DeployActionProps {
    /**
     * The specified canned ACL to objects deployed to Amazon S3.
     *
     * This overwrites any existing ACL that was applied to the object.
     *
     * Default: - the original object ACL
     */
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The Amazon S3 bucket that is the deploy target.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The caching behavior for requests/responses for objects in the bucket.
     *
     * The final cache control property will be the result of joining all of the provided array
     * elements with a comma
     * (plus a space after the comma).
     *
     * Default: - none, decided by the HTTP client
     */
    override fun cacheControl(): List<CacheControl> =
        unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

    /**
     * The AWS KMS encryption key for the host bucket.
     *
     * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
     *
     * Default: - none
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Should the deploy action extract the artifact before deploying to Amazon S3.
     *
     * Default: true
     */
    override fun extract(): Boolean? = unwrap(this).getExtract()

    /**
     * The input Artifact to deploy to Amazon S3.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The key of the target object.
     *
     * This is required if extract is false.
     */
    override fun objectKey(): String? = unwrap(this).getObjectKey()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps):
        S3DeployActionProps = CdkObjectWrappers.wrap(cdkObject) as? S3DeployActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps
  }
}
