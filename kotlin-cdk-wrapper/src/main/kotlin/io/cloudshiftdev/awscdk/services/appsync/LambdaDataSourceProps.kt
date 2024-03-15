@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

public interface LambdaDataSourceProps : BackedDataSourceProps {
  public fun lambdaFunction(): IFunction

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun lambdaFunction(lambdaFunction: IFunction)

    public fun name(name: String)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.LambdaDataSourceProps.builder()

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSourceProps,
  ) : CdkObject(cdkObject), LambdaDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun lambdaFunction(): IFunction = unwrap(this).getLambdaFunction().let(IFunction::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSourceProps):
        LambdaDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDataSourceProps):
        software.amazon.awscdk.services.appsync.LambdaDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LambdaDataSourceProps
  }
}
