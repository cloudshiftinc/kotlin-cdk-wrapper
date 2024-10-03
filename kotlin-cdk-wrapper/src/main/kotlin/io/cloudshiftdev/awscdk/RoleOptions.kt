@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for specifying a role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object assumeRoleAdditionalOptions;
 * RoleOptions roleOptions = RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build();
 * ```
 */
public interface RoleOptions {
  /**
   * Additional options to pass to STS when assuming the role for cloudformation deployments.
   *
   * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
   * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
   * * `TransitiveTagKeys` defaults to use all keys (if any) specified in `Tags`. E.g, all tags are
   * transitive by default.
   *
   * Default: - No additional options.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
   */
  public fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  /**
   * ARN of the role to assume.
   */
  public fun assumeRoleArn(): String

  /**
   * External ID to use when assuming the role.
   *
   * Default: - No external ID
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * A builder for [RoleOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role
     * for cloudformation deployments.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     * * `TransitiveTagKeys` defaults to use all keys (if any) specified in `Tags`. E.g, all tags
     * are transitive by default.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param assumeRoleArn ARN of the role to assume. 
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId External ID to use when assuming the role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RoleOptions.Builder =
        software.amazon.awscdk.RoleOptions.builder()

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role
     * for cloudformation deployments.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     * * `TransitiveTagKeys` defaults to use all keys (if any) specified in `Tags`. E.g, all tags
     * are transitive by default.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param assumeRoleArn ARN of the role to assume. 
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId External ID to use when assuming the role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun build(): software.amazon.awscdk.RoleOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.RoleOptions,
  ) : CdkObject(cdkObject),
      RoleOptions {
    /**
     * Additional options to pass to STS when assuming the role for cloudformation deployments.
     *
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     * * `TransitiveTagKeys` defaults to use all keys (if any) specified in `Tags`. E.g, all tags
     * are transitive by default.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    /**
     * ARN of the role to assume.
     */
    override fun assumeRoleArn(): String = unwrap(this).getAssumeRoleArn()

    /**
     * External ID to use when assuming the role.
     *
     * Default: - No external ID
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RoleOptions): RoleOptions =
        CdkObjectWrappers.wrap(cdkObject) as? RoleOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleOptions): software.amazon.awscdk.RoleOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.RoleOptions
  }
}
