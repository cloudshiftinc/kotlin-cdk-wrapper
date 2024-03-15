@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AliasProps : AliasOptions {
  public fun aliasName(): String

  public fun version(): IVersion

  @CdkDslMarker
  public interface Builder {
    public fun additionalVersions(additionalVersions: List<VersionWeight>)

    public fun additionalVersions(vararg additionalVersions: VersionWeight)

    public fun aliasName(aliasName: String)

    public fun description(description: String)

    public fun maxEventAge(maxEventAge: Duration)

    public fun onFailure(onFailure: IDestination)

    public fun onSuccess(onSuccess: IDestination)

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    public fun retryAttempts(retryAttempts: Number)

    public fun version(version: IVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AliasProps.Builder =
        software.amazon.awscdk.services.lambda.AliasProps.builder()

    override fun additionalVersions(additionalVersions: List<VersionWeight>) {
      cdkBuilder.additionalVersions(additionalVersions.map(VersionWeight::unwrap))
    }

    override fun additionalVersions(vararg additionalVersions: VersionWeight): Unit =
        additionalVersions(additionalVersions.toList())

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
      cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.AliasProps,
  ) : CdkObject(cdkObject), AliasProps {
    override fun additionalVersions(): List<VersionWeight> =
        unwrap(this).getAdditionalVersions()?.map(VersionWeight::wrap) ?: emptyList()

    override fun aliasName(): String = unwrap(this).getAliasName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    override fun provisionedConcurrentExecutions(): Number? =
        unwrap(this).getProvisionedConcurrentExecutions()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AliasProps): AliasProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasProps): software.amazon.awscdk.services.lambda.AliasProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AliasProps
  }
}
