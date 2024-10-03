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
 * Query to SSM Parameter Context Provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * SSMParameterContextQuery sSMParameterContextQuery = SSMParameterContextQuery.builder()
 * .account("account")
 * .parameterName("parameterName")
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .build();
 * ```
 */
public interface SSMParameterContextQuery : ContextLookupRoleOptions {
  /**
   * Parameter name to query.
   */
  public fun parameterName(): String

  /**
   * A builder for [SSMParameterContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    /**
     * @param parameterName Parameter name to query. 
     */
    public fun parameterName(parameterName: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery.Builder =
        software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    /**
     * @param parameterName Parameter name to query. 
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery,
  ) : CdkObject(cdkObject),
      SSMParameterContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * Additional options to pass to STS when assuming the lookup role.
     *
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    /**
     * Parameter name to query.
     */
    override fun parameterName(): String = unwrap(this).getParameterName()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SSMParameterContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery):
        SSMParameterContextQuery = CdkObjectWrappers.wrap(cdkObject) as? SSMParameterContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SSMParameterContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloud_assembly_schema.SSMParameterContextQuery
  }
}
