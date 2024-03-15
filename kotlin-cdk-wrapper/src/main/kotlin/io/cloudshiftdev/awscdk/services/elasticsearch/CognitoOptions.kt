@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface CognitoOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun identityPoolId(): String

  @Deprecated(message = "deprecated in CDK")
  public fun role(): IRole

  @Deprecated(message = "deprecated in CDK")
  public fun userPoolId(): String

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun identityPoolId(identityPoolId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun role(role: IRole)

    @Deprecated(message = "deprecated in CDK")
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CognitoOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.CognitoOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CognitoOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.CognitoOptions,
  ) : CdkObject(cdkObject), CognitoOptions {
    @Deprecated(message = "deprecated in CDK")
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    @Deprecated(message = "deprecated in CDK")
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CognitoOptions):
        CognitoOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoOptions):
        software.amazon.awscdk.services.elasticsearch.CognitoOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CognitoOptions
  }
}
