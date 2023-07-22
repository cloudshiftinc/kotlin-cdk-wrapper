@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CacheControl
import software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.IBucket

/**
 * Construction properties of the `S3DeployAction S3 deploy Action`.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.kms.*;
 * Artifact sourceOutput = new Artifact();
 * Bucket targetBucket = new Bucket(this, "MyBucket");
 * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
 * .description("sample key")
 * .build();
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * S3DeployAction deployAction = S3DeployAction.Builder.create()
 * .actionName("S3Deploy")
 * .bucket(targetBucket)
 * .input(sourceOutput)
 * .encryptionKey(key)
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class S3DeployActionPropsDsl {
  private val cdkBuilder: S3DeployActionProps.Builder = S3DeployActionProps.builder()

  private val _cacheControl: MutableList<CacheControl> = mutableListOf()

  /**
   * @param accessControl The specified canned ACL to objects deployed to Amazon S3.
   * This overwrites any existing ACL that was applied to the object.
   */
  public fun accessControl(accessControl: BucketAccessControl) {
    cdkBuilder.accessControl(accessControl)
  }

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param bucket The Amazon S3 bucket that is the deploy target. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
   * The final cache control property will be the result of joining all of the provided array
   * elements with a comma
   * (plus a space after the comma).
   */
  public fun cacheControl(vararg cacheControl: CacheControl) {
    _cacheControl.addAll(listOf(*cacheControl))
  }

  /**
   * @param cacheControl The caching behavior for requests/responses for objects in the bucket.
   * The final cache control property will be the result of joining all of the provided array
   * elements with a comma
   * (plus a space after the comma).
   */
  public fun cacheControl(cacheControl: Collection<CacheControl>) {
    _cacheControl.addAll(cacheControl)
  }

  /**
   * @param encryptionKey The AWS KMS encryption key for the host bucket.
   * The encryptionKey parameter encrypts uploaded artifacts with the provided AWS KMS key.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param extract Should the deploy action extract the artifact before deploying to Amazon S3.
   */
  public fun extract(extract: Boolean) {
    cdkBuilder.extract(extract)
  }

  /**
   * @param input The input Artifact to deploy to Amazon S3. 
   */
  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  /**
   * @param objectKey The key of the target object.
   * This is required if extract is false.
   */
  public fun objectKey(objectKey: String) {
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
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): S3DeployActionProps {
    if(_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
    return cdkBuilder.build()
  }
}
