@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnAuthorizerProps {
  public fun authorizerFunctionArn(): String

  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

  public fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

  public fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerFunctionArn(authorizerFunctionArn: String)

    public fun authorizerName(authorizerName: String)

    public fun enableCachingForHttp(enableCachingForHttp: Boolean)

    public fun enableCachingForHttp(enableCachingForHttp: IResolvable)

    public fun signingDisabled(signingDisabled: Boolean)

    public fun signingDisabled(signingDisabled: IResolvable)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tokenKeyName(tokenKeyName: String)

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable)

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAuthorizerProps.Builder =
        software.amazon.awscdk.services.iot.CfnAuthorizerProps.builder()

    override fun authorizerFunctionArn(authorizerFunctionArn: String) {
      cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun enableCachingForHttp(enableCachingForHttp: Boolean) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    override fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp.let(IResolvable::unwrap))
    }

    override fun signingDisabled(signingDisabled: Boolean) {
      cdkBuilder.signingDisabled(signingDisabled)
    }

    override fun signingDisabled(signingDisabled: IResolvable) {
      cdkBuilder.signingDisabled(signingDisabled.let(IResolvable::unwrap))
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tokenKeyName(tokenKeyName: String) {
      cdkBuilder.tokenKeyName(tokenKeyName)
    }

    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys.let(IResolvable::unwrap))
    }

    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAuthorizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizerProps,
  ) : CdkObject(cdkObject), CfnAuthorizerProps {
    override fun authorizerFunctionArn(): String = unwrap(this).getAuthorizerFunctionArn()

    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

    override fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

    override fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizerProps):
        CfnAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.iot.CfnAuthorizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnAuthorizerProps
  }
}
