@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The authorization config in case the HTTP endpoint requires authorization.
 *
 * Example:
 *
 * ```
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
 * .build();
 * HttpDataSource httpDs = api.addHttpDataSource("ds", "https://states.amazonaws.com",
 * HttpDataSourceOptions.builder()
 * .name("httpDsWithStepF")
 * .description("from appsync to StepFunctions Workflow")
 * .authorizationConfig(AwsIamConfig.builder()
 * .signingRegion("us-east-1")
 * .signingServiceName("states")
 * .build())
 * .build());
 * httpDs.createResolver("MutationCallStepFunctionResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("callStepFunction")
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build());
 * ```
 */
public interface AwsIamConfig {
  /**
   * The signing region for AWS IAM authorization.
   */
  public fun signingRegion(): String

  /**
   * The signing service name for AWS IAM authorization.
   */
  public fun signingServiceName(): String

  /**
   * A builder for [AwsIamConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param signingRegion The signing region for AWS IAM authorization. 
     */
    public fun signingRegion(signingRegion: String)

    /**
     * @param signingServiceName The signing service name for AWS IAM authorization. 
     */
    public fun signingServiceName(signingServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AwsIamConfig.Builder =
        software.amazon.awscdk.services.appsync.AwsIamConfig.builder()

    /**
     * @param signingRegion The signing region for AWS IAM authorization. 
     */
    override fun signingRegion(signingRegion: String) {
      cdkBuilder.signingRegion(signingRegion)
    }

    /**
     * @param signingServiceName The signing service name for AWS IAM authorization. 
     */
    override fun signingServiceName(signingServiceName: String) {
      cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AwsIamConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig,
  ) : CdkObject(cdkObject),
      AwsIamConfig {
    /**
     * The signing region for AWS IAM authorization.
     */
    override fun signingRegion(): String = unwrap(this).getSigningRegion()

    /**
     * The signing service name for AWS IAM authorization.
     */
    override fun signingServiceName(): String = unwrap(this).getSigningServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig): AwsIamConfig
        = CdkObjectWrappers.wrap(cdkObject) as? AwsIamConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIamConfig): software.amazon.awscdk.services.appsync.AwsIamConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AwsIamConfig
  }
}
