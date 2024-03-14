package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSource,
) : BackedDataSource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.LambdaDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    public fun description(description: String)

    /**
     * The Lambda function to call to interact with this data source.
     *
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     */
    public fun lambdaFunction(lambdaFunction: IFunction)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaDataSource.Builder =
        software.amazon.awscdk.services.appsync.LambdaDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Lambda function to call to interact with this data source.
     *
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     */
    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSource):
        LambdaDataSource = LambdaDataSource(cdkObject)

    internal fun unwrap(wrapped: LambdaDataSource):
        software.amazon.awscdk.services.appsync.LambdaDataSource = wrapped.cdkObject
  }
}
