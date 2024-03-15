@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

public interface LambdaAuthorizerConfig {
  public fun handler(): IFunction

  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  public fun validationRegex(): String? = unwrap(this).getValidationRegex()

  @CdkDslMarker
  public interface Builder {
    public fun handler(handler: IFunction)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    public fun validationRegex(validationRegex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig.Builder =
        software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig.builder()

    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig,
  ) : CdkObject(cdkObject), LambdaAuthorizerConfig {
    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    override fun validationRegex(): String? = unwrap(this).getValidationRegex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig):
        LambdaAuthorizerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaAuthorizerConfig):
        software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
  }
}
