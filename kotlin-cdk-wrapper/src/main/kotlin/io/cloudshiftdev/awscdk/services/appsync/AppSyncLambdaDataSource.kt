@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync datasource backed by a Lambda function.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function lambdaDs;
 * EventApi api = EventApi.Builder.create(this, "EventApiLambda")
 * .apiName("LambdaEventApi")
 * .build();
 * AppSyncLambdaDataSource dataSource = api.addLambdaDataSource("lambdads", lambdaDs);
 * ```
 */
public open class AppSyncLambdaDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncLambdaDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncLambdaDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncLambdaDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncLambdaDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncLambdaDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
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
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource.Builder
        = software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
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
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction.Companion::unwrap))
    }

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncLambdaDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncLambdaDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource):
        AppSyncLambdaDataSource = AppSyncLambdaDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncLambdaDataSource):
        software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource
  }
}
