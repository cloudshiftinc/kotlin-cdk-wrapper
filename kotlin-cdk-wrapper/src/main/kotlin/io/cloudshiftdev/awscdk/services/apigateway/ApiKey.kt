@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApiKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.ApiKey,
) : Resource(cdkObject), IApiKey {
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyName(apiKeyName: String)

    public fun customerId(customerId: String)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun generateDistinctId(generateDistinctId: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    public fun stages(stages: List<IStage>)

    public fun stages(vararg stages: IStage)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKey.Builder =
        software.amazon.awscdk.services.apigateway.ApiKey.Builder.create(scope, id)

    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

    override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKey = cdkBuilder.build()
  }

  public companion object {
    public fun fromApiKeyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      apiKeyId: String,
    ): IApiKey =
        software.amazon.awscdk.services.apigateway.ApiKey.fromApiKeyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, apiKeyId).let(IApiKey::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKey): ApiKey =
        ApiKey(cdkObject)

    internal fun unwrap(wrapped: ApiKey): software.amazon.awscdk.services.apigateway.ApiKey =
        wrapped.cdkObject
  }
}
