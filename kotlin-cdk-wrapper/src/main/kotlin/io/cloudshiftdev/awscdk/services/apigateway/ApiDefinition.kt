@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an OpenAPI definition asset.
 *
 * Example:
 *
 * ```
 * AssetApiDefinition myApiDefinition = ApiDefinition.fromAsset("path-to-file.json");
 * SpecRestApi specRestApi = SpecRestApi.Builder.create(this, "my-specrest-api")
 * .deploy(false)
 * .apiDefinition(myApiDefinition)
 * .build();
 * // Use `stageName` to deploy to an existing stage
 * Deployment deployment = Deployment.Builder.create(this, "my-deployment")
 * .api(specRestApi)
 * .stageName("dev")
 * .retainDeployments(true)
 * .build();
 * // Trigger a new deployment on OpenAPI definition updates
 * deployment.addToLogicalId(myApiDefinition);
 * ```
 */
public abstract class ApiDefinition(
  cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition,
) : CdkObject(cdkObject) {
  /**
   * Called when the specification is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param scope The binding scope. 
   */
  public open fun bind(scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(ApiDefinitionConfig::wrap)

  /**
   * Called after the CFN RestApi resource has been created to allow the Api Definition to bind to
   * it.
   *
   * Specifically it's required to allow assets to add
   * metadata for tooling like SAM CLI to be able to find their origins.
   *
   * @param _scope 
   * @param _restApi 
   */
  public open fun bindAfterCreate(scope: Construct, restApi: IRestApi) {
    unwrap(this).bindAfterCreate(scope.let(Construct.Companion::unwrap),
        restApi.let(IRestApi.Companion::unwrap))
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition,
  ) : ApiDefinition(cdkObject)

  public companion object {
    public fun fromAsset(`file`: String): AssetApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromAsset(`file`).let(AssetApiDefinition::wrap)

    public fun fromAsset(`file`: String, options: AssetOptions): AssetApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromAsset(`file`,
        options.let(AssetOptions.Companion::unwrap)).let(AssetApiDefinition::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fb7424fb7a8091c53e571077a35ba78a28ea3dcadc70091587f610eea2f9998")
    public fun fromAsset(`file`: String, options: AssetOptions.Builder.() -> Unit):
        AssetApiDefinition = fromAsset(`file`, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): S3ApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromBucket(bucket.let(IBucket.Companion::unwrap),
        key).let(S3ApiDefinition::wrap)

    public fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3ApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromBucket(bucket.let(IBucket.Companion::unwrap),
        key, objectVersion).let(S3ApiDefinition::wrap)

    public fun fromInline(definition: Any): InlineApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromInline(definition).let(InlineApiDefinition::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition):
        ApiDefinition = CdkObjectWrappers.wrap(cdkObject) as? ApiDefinition ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinition):
        software.amazon.awscdk.services.apigateway.ApiDefinition = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.ApiDefinition
  }
}
