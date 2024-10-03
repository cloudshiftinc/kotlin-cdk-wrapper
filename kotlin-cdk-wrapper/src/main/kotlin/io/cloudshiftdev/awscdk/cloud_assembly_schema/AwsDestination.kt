@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Destination for assets that need to be uploaded to AWS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * AwsDestination awsDestination = AwsDestination.builder()
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
public interface AwsDestination {
  /**
   * Additional options to pass to STS when assuming the role.
   *
   * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
   * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
   *
   * Default: - No additional options.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
   */
  public fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  /**
   * The role that needs to be assumed while publishing this asset.
   *
   * Default: - No role will be assumed
   */
  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * The ExternalId that needs to be supplied while assuming this role.
   *
   * Default: - No ExternalId will be supplied
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * The region where this asset will need to be published.
   *
   * Default: - Current region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [AwsDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param region The region where this asset will need to be published.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.AwsDestination.Builder =
        software.amazon.awscdk.cloud_assembly_schema.AwsDestination.builder()

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param region The region where this asset will need to be published.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.AwsDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.AwsDestination,
  ) : CdkObject(cdkObject),
      AwsDestination {
    /**
     * Additional options to pass to STS when assuming the role.
     *
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    /**
     * The role that needs to be assumed while publishing this asset.
     *
     * Default: - No role will be assumed
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * The region where this asset will need to be published.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.AwsDestination):
        AwsDestination = CdkObjectWrappers.wrap(cdkObject) as? AwsDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsDestination):
        software.amazon.awscdk.cloud_assembly_schema.AwsDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.AwsDestination
  }
}
