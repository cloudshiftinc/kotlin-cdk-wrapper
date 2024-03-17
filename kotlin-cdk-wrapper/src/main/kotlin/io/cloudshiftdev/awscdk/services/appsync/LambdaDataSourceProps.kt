@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

/**
 * Properties for an AppSync Lambda datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function function_;
 * GraphqlApi graphqlApi;
 * Role role;
 * LambdaDataSourceProps lambdaDataSourceProps = LambdaDataSourceProps.builder()
 * .api(graphqlApi)
 * .lambdaFunction(function_)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface LambdaDataSourceProps : BackedDataSourceProps {
  /**
   * The Lambda function to call to interact with this data source.
   */
  public fun lambdaFunction(): IFunction

  /**
   * A builder for [LambdaDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     */
    public fun lambdaFunction(lambdaFunction: IFunction)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.LambdaDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     */
    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSourceProps,
  ) : CdkObject(cdkObject), LambdaDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Lambda function to call to interact with this data source.
     */
    override fun lambdaFunction(): IFunction = unwrap(this).getLambdaFunction().let(IFunction::wrap)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSourceProps):
        LambdaDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? LambdaDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDataSourceProps):
        software.amazon.awscdk.services.appsync.LambdaDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LambdaDataSourceProps
  }
}
