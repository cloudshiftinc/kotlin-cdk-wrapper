@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options to the UsagePlan.addApiKey() method.
 *
 * Example:
 *
 * ```
 * UsagePlan usageplan;
 * ApiKey apiKey;
 * usageplan.addApiKey(apiKey, AddApiKeyOptions.builder()
 * .overrideLogicalId("...")
 * .build());
 * ```
 */
public interface AddApiKeyOptions {
  /**
   * Override the CloudFormation logical id of the AWS::ApiGateway::UsagePlanKey resource.
   *
   * Default: - autogenerated by the CDK
   */
  public fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()

  /**
   * A builder for [AddApiKeyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param overrideLogicalId Override the CloudFormation logical id of the
     * AWS::ApiGateway::UsagePlanKey resource.
     */
    public fun overrideLogicalId(overrideLogicalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AddApiKeyOptions.Builder =
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions.builder()

    /**
     * @param overrideLogicalId Override the CloudFormation logical id of the
     * AWS::ApiGateway::UsagePlanKey resource.
     */
    override fun overrideLogicalId(overrideLogicalId: String) {
      cdkBuilder.overrideLogicalId(overrideLogicalId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AddApiKeyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions,
  ) : CdkObject(cdkObject),
      AddApiKeyOptions {
    /**
     * Override the CloudFormation logical id of the AWS::ApiGateway::UsagePlanKey resource.
     *
     * Default: - autogenerated by the CDK
     */
    override fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApiKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions):
        AddApiKeyOptions = CdkObjectWrappers.wrap(cdkObject) as? AddApiKeyOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApiKeyOptions):
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.AddApiKeyOptions
  }
}
