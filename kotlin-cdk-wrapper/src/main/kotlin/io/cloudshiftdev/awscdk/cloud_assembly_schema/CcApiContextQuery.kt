@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Query input for lookup up CloudFormation resources using CC API.
 *
 * The example below is required to successfully compile CDK (otherwise,
 * the CDK build will generate a synthetic example for the below, but it
 * doesn't have enough type information about the literal string union
 * to generate a validly compiling example).
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.CcApiContextQuery;
 * CcApiContextQuery x = CcApiContextQuery.builder()
 * .typeName("AWS::Some::Type")
 * .expectedMatchCount("exactly-one")
 * .propertiesToReturn(List.of("SomeProp"))
 * .account("11111111111")
 * .region("us-east-1")
 * .build();
 * ```
 */
public interface CcApiContextQuery : ContextLookupRoleOptions {
  /**
   * The value to return if the resource was not found and `ignoreErrorOnMissingContext` is true.
   *
   * If supplied, `dummyValue` should be an array of objects.
   *
   * `dummyValue` does not have to have elements, and it may have objects with
   * different properties than the properties in `propertiesToReturn`, but it
   * will be easiest for downstream code if the `dummyValue` conforms to
   * the expected response shape.
   *
   * Default: - No dummy value available
   */
  public fun dummyValue(): Any? = unwrap(this).getDummyValue()

  /**
   * Identifier of the resource to look up using `GetResource`.
   *
   * Specifying exactIdentifier will return exactly one result, or throw an error
   * unless `ignoreErrorOnMissingContext` is set.
   *
   * Default: - Either exactIdentifier or propertyMatch should be specified.
   */
  public fun exactIdentifier(): String? = unwrap(this).getExactIdentifier()

  /**
   * Expected count of results if `propertyMatch` is specified.
   *
   * If the expected result count does not match the actual count,
   * by default an error is produced and the result is not committed to cached
   * context, and the user can correct the situation and try again without
   * having to manually clear out the context key using `cdk context --remove`
   *
   * If the value of * `ignoreErrorOnMissingContext` is `true`, the value of
   * `expectedMatchCount` is `at-least-one | exactly-one` and the number
   * of found resources is 0, `dummyValue` is returned and committed to context
   * instead.
   *
   * Default: 'any'
   */
  public fun expectedMatchCount(): String? = unwrap(this).getExpectedMatchCount()

  /**
   * Ignore an error and return the `dummyValue` instead if the resource was not found.
   *
   * * In case of an `exactIdentifier` lookup, return the `dummyValue` if the resource with
   * that identifier was not found.
   * * In case of a `propertyMatch` lookup, return the `dummyValue` if `expectedMatchCount`
   * is `at-least-one | exactly-one` and the number of resources found was 0.
   *
   * if `ignoreErrorOnMissingContext` is set, `dummyValue` should be set and be an array.
   *
   * Default: false
   */
  public fun ignoreErrorOnMissingContext(): Boolean? = unwrap(this).getIgnoreErrorOnMissingContext()

  /**
   * This is a set of properties returned from CC API that we want to return from ContextQuery.
   *
   * If any properties listed here are absent from the target resource, an error will be thrown.
   *
   * The returned object will always include the key `Identifier` with the CC-API returned
   * field `Identifier`.
   *
   * <h2>Notes on property completeness</h2>
   *
   * CloudControl API's `ListResources` may return fewer properties than
   * `GetResource` would, depending on the resource implementation.
   *
   * The returned properties here are *currently* selected from the response
   * object that CloudControl API returns to the CDK CLI.
   *
   * However, if we find there is need to do so, we may decide to change this
   * behavior in the future: we might change it to perform an additional
   * `GetResource` call for resources matched by `propertyMatch`.
   */
  public fun propertiesToReturn(): List<String>

  /**
   * Returns any resources matching these properties, using `ListResources`.
   *
   * By default, specifying propertyMatch will successfully return 0 or more
   * results. To throw an error if the number of results is unexpected (and
   * prevent the query results from being committed to context), specify
   * `expectedMatchCount`.
   *
   * <h2>Notes on property completeness</h2>
   *
   * CloudControl API's `ListResources` may return fewer properties than
   * `GetResource` would, depending on the resource implementation.
   *
   * The resources that `propertyMatch` matches against will *only ever* be the
   * properties returned by the `ListResources` call.
   *
   * Default: - Either exactIdentifier or propertyMatch should be specified.
   */
  public fun propertyMatch(): Map<String, Any> = unwrap(this).getPropertyMatch() ?: emptyMap()

  /**
   * The CloudFormation resource type.
   *
   * See https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/supported-resources.html
   */
  public fun typeName(): String

  /**
   * A builder for [CcApiContextQuery]
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
     * @param dummyValue The value to return if the resource was not found and
     * `ignoreErrorOnMissingContext` is true.
     * If supplied, `dummyValue` should be an array of objects.
     *
     * `dummyValue` does not have to have elements, and it may have objects with
     * different properties than the properties in `propertiesToReturn`, but it
     * will be easiest for downstream code if the `dummyValue` conforms to
     * the expected response shape.
     */
    public fun dummyValue(dummyValue: Any)

    /**
     * @param exactIdentifier Identifier of the resource to look up using `GetResource`.
     * Specifying exactIdentifier will return exactly one result, or throw an error
     * unless `ignoreErrorOnMissingContext` is set.
     */
    public fun exactIdentifier(exactIdentifier: String)

    /**
     * @param expectedMatchCount Expected count of results if `propertyMatch` is specified.
     * If the expected result count does not match the actual count,
     * by default an error is produced and the result is not committed to cached
     * context, and the user can correct the situation and try again without
     * having to manually clear out the context key using `cdk context --remove`
     *
     * If the value of * `ignoreErrorOnMissingContext` is `true`, the value of
     * `expectedMatchCount` is `at-least-one | exactly-one` and the number
     * of found resources is 0, `dummyValue` is returned and committed to context
     * instead.
     */
    public fun expectedMatchCount(expectedMatchCount: String)

    /**
     * @param ignoreErrorOnMissingContext Ignore an error and return the `dummyValue` instead if the
     * resource was not found.
     * * In case of an `exactIdentifier` lookup, return the `dummyValue` if the resource with
     * that identifier was not found.
     * * In case of a `propertyMatch` lookup, return the `dummyValue` if `expectedMatchCount`
     * is `at-least-one | exactly-one` and the number of resources found was 0.
     *
     * if `ignoreErrorOnMissingContext` is set, `dummyValue` should be set and be an array.
     */
    public fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean)

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
     * @param propertiesToReturn This is a set of properties returned from CC API that we want to
     * return from ContextQuery. 
     * If any properties listed here are absent from the target resource, an error will be thrown.
     *
     * The returned object will always include the key `Identifier` with the CC-API returned
     * field `Identifier`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The returned properties here are *currently* selected from the response
     * object that CloudControl API returns to the CDK CLI.
     *
     * However, if we find there is need to do so, we may decide to change this
     * behavior in the future: we might change it to perform an additional
     * `GetResource` call for resources matched by `propertyMatch`.
     */
    public fun propertiesToReturn(propertiesToReturn: List<String>)

    /**
     * @param propertiesToReturn This is a set of properties returned from CC API that we want to
     * return from ContextQuery. 
     * If any properties listed here are absent from the target resource, an error will be thrown.
     *
     * The returned object will always include the key `Identifier` with the CC-API returned
     * field `Identifier`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The returned properties here are *currently* selected from the response
     * object that CloudControl API returns to the CDK CLI.
     *
     * However, if we find there is need to do so, we may decide to change this
     * behavior in the future: we might change it to perform an additional
     * `GetResource` call for resources matched by `propertyMatch`.
     */
    public fun propertiesToReturn(vararg propertiesToReturn: String)

    /**
     * @param propertyMatch Returns any resources matching these properties, using `ListResources`.
     * By default, specifying propertyMatch will successfully return 0 or more
     * results. To throw an error if the number of results is unexpected (and
     * prevent the query results from being committed to context), specify
     * `expectedMatchCount`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The resources that `propertyMatch` matches against will *only ever* be the
     * properties returned by the `ListResources` call.
     */
    public fun propertyMatch(propertyMatch: Map<String, Any>)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)

    /**
     * @param typeName The CloudFormation resource type. 
     * See https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/supported-resources.html
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery.Builder =
        software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery.builder()

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
     * @param dummyValue The value to return if the resource was not found and
     * `ignoreErrorOnMissingContext` is true.
     * If supplied, `dummyValue` should be an array of objects.
     *
     * `dummyValue` does not have to have elements, and it may have objects with
     * different properties than the properties in `propertiesToReturn`, but it
     * will be easiest for downstream code if the `dummyValue` conforms to
     * the expected response shape.
     */
    override fun dummyValue(dummyValue: Any) {
      cdkBuilder.dummyValue(dummyValue)
    }

    /**
     * @param exactIdentifier Identifier of the resource to look up using `GetResource`.
     * Specifying exactIdentifier will return exactly one result, or throw an error
     * unless `ignoreErrorOnMissingContext` is set.
     */
    override fun exactIdentifier(exactIdentifier: String) {
      cdkBuilder.exactIdentifier(exactIdentifier)
    }

    /**
     * @param expectedMatchCount Expected count of results if `propertyMatch` is specified.
     * If the expected result count does not match the actual count,
     * by default an error is produced and the result is not committed to cached
     * context, and the user can correct the situation and try again without
     * having to manually clear out the context key using `cdk context --remove`
     *
     * If the value of * `ignoreErrorOnMissingContext` is `true`, the value of
     * `expectedMatchCount` is `at-least-one | exactly-one` and the number
     * of found resources is 0, `dummyValue` is returned and committed to context
     * instead.
     */
    override fun expectedMatchCount(expectedMatchCount: String) {
      cdkBuilder.expectedMatchCount(expectedMatchCount)
    }

    /**
     * @param ignoreErrorOnMissingContext Ignore an error and return the `dummyValue` instead if the
     * resource was not found.
     * * In case of an `exactIdentifier` lookup, return the `dummyValue` if the resource with
     * that identifier was not found.
     * * In case of a `propertyMatch` lookup, return the `dummyValue` if `expectedMatchCount`
     * is `at-least-one | exactly-one` and the number of resources found was 0.
     *
     * if `ignoreErrorOnMissingContext` is set, `dummyValue` should be set and be an array.
     */
    override fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean) {
      cdkBuilder.ignoreErrorOnMissingContext(ignoreErrorOnMissingContext)
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
     * @param propertiesToReturn This is a set of properties returned from CC API that we want to
     * return from ContextQuery. 
     * If any properties listed here are absent from the target resource, an error will be thrown.
     *
     * The returned object will always include the key `Identifier` with the CC-API returned
     * field `Identifier`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The returned properties here are *currently* selected from the response
     * object that CloudControl API returns to the CDK CLI.
     *
     * However, if we find there is need to do so, we may decide to change this
     * behavior in the future: we might change it to perform an additional
     * `GetResource` call for resources matched by `propertyMatch`.
     */
    override fun propertiesToReturn(propertiesToReturn: List<String>) {
      cdkBuilder.propertiesToReturn(propertiesToReturn)
    }

    /**
     * @param propertiesToReturn This is a set of properties returned from CC API that we want to
     * return from ContextQuery. 
     * If any properties listed here are absent from the target resource, an error will be thrown.
     *
     * The returned object will always include the key `Identifier` with the CC-API returned
     * field `Identifier`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The returned properties here are *currently* selected from the response
     * object that CloudControl API returns to the CDK CLI.
     *
     * However, if we find there is need to do so, we may decide to change this
     * behavior in the future: we might change it to perform an additional
     * `GetResource` call for resources matched by `propertyMatch`.
     */
    override fun propertiesToReturn(vararg propertiesToReturn: String): Unit =
        propertiesToReturn(propertiesToReturn.toList())

    /**
     * @param propertyMatch Returns any resources matching these properties, using `ListResources`.
     * By default, specifying propertyMatch will successfully return 0 or more
     * results. To throw an error if the number of results is unexpected (and
     * prevent the query results from being committed to context), specify
     * `expectedMatchCount`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The resources that `propertyMatch` matches against will *only ever* be the
     * properties returned by the `ListResources` call.
     */
    override fun propertyMatch(propertyMatch: Map<String, Any>) {
      cdkBuilder.propertyMatch(propertyMatch.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param typeName The CloudFormation resource type. 
     * See https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/supported-resources.html
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery,
  ) : CdkObject(cdkObject),
      CcApiContextQuery {
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
     * The value to return if the resource was not found and `ignoreErrorOnMissingContext` is true.
     *
     * If supplied, `dummyValue` should be an array of objects.
     *
     * `dummyValue` does not have to have elements, and it may have objects with
     * different properties than the properties in `propertiesToReturn`, but it
     * will be easiest for downstream code if the `dummyValue` conforms to
     * the expected response shape.
     *
     * Default: - No dummy value available
     */
    override fun dummyValue(): Any? = unwrap(this).getDummyValue()

    /**
     * Identifier of the resource to look up using `GetResource`.
     *
     * Specifying exactIdentifier will return exactly one result, or throw an error
     * unless `ignoreErrorOnMissingContext` is set.
     *
     * Default: - Either exactIdentifier or propertyMatch should be specified.
     */
    override fun exactIdentifier(): String? = unwrap(this).getExactIdentifier()

    /**
     * Expected count of results if `propertyMatch` is specified.
     *
     * If the expected result count does not match the actual count,
     * by default an error is produced and the result is not committed to cached
     * context, and the user can correct the situation and try again without
     * having to manually clear out the context key using `cdk context --remove`
     *
     * If the value of * `ignoreErrorOnMissingContext` is `true`, the value of
     * `expectedMatchCount` is `at-least-one | exactly-one` and the number
     * of found resources is 0, `dummyValue` is returned and committed to context
     * instead.
     *
     * Default: 'any'
     */
    override fun expectedMatchCount(): String? = unwrap(this).getExpectedMatchCount()

    /**
     * Ignore an error and return the `dummyValue` instead if the resource was not found.
     *
     * * In case of an `exactIdentifier` lookup, return the `dummyValue` if the resource with
     * that identifier was not found.
     * * In case of a `propertyMatch` lookup, return the `dummyValue` if `expectedMatchCount`
     * is `at-least-one | exactly-one` and the number of resources found was 0.
     *
     * if `ignoreErrorOnMissingContext` is set, `dummyValue` should be set and be an array.
     *
     * Default: false
     */
    override fun ignoreErrorOnMissingContext(): Boolean? =
        unwrap(this).getIgnoreErrorOnMissingContext()

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
     * This is a set of properties returned from CC API that we want to return from ContextQuery.
     *
     * If any properties listed here are absent from the target resource, an error will be thrown.
     *
     * The returned object will always include the key `Identifier` with the CC-API returned
     * field `Identifier`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The returned properties here are *currently* selected from the response
     * object that CloudControl API returns to the CDK CLI.
     *
     * However, if we find there is need to do so, we may decide to change this
     * behavior in the future: we might change it to perform an additional
     * `GetResource` call for resources matched by `propertyMatch`.
     */
    override fun propertiesToReturn(): List<String> = unwrap(this).getPropertiesToReturn()

    /**
     * Returns any resources matching these properties, using `ListResources`.
     *
     * By default, specifying propertyMatch will successfully return 0 or more
     * results. To throw an error if the number of results is unexpected (and
     * prevent the query results from being committed to context), specify
     * `expectedMatchCount`.
     *
     * <h2>Notes on property completeness</h2>
     *
     * CloudControl API's `ListResources` may return fewer properties than
     * `GetResource` would, depending on the resource implementation.
     *
     * The resources that `propertyMatch` matches against will *only ever* be the
     * properties returned by the `ListResources` call.
     *
     * Default: - Either exactIdentifier or propertyMatch should be specified.
     */
    override fun propertyMatch(): Map<String, Any> = unwrap(this).getPropertyMatch() ?: emptyMap()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * The CloudFormation resource type.
     *
     * See https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/supported-resources.html
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CcApiContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery):
        CcApiContextQuery = CdkObjectWrappers.wrap(cdkObject) as? CcApiContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CcApiContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.CcApiContextQuery
  }
}
