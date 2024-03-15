@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPullThroughCacheRuleProps {
  public fun credentialArn(): String? = unwrap(this).getCredentialArn()

  public fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

  public fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

  public fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()

  @CdkDslMarker
  public interface Builder {
    public fun credentialArn(credentialArn: String)

    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String)

    public fun upstreamRegistry(upstreamRegistry: String)

    public fun upstreamRegistryUrl(upstreamRegistryUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps.Builder
        = software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps.builder()

    override fun credentialArn(credentialArn: String) {
      cdkBuilder.credentialArn(credentialArn)
    }

    override fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
      cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    override fun upstreamRegistry(upstreamRegistry: String) {
      cdkBuilder.upstreamRegistry(upstreamRegistry)
    }

    override fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
      cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps,
  ) : CdkObject(cdkObject), CfnPullThroughCacheRuleProps {
    override fun credentialArn(): String? = unwrap(this).getCredentialArn()

    override fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

    override fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

    override fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPullThroughCacheRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps):
        CfnPullThroughCacheRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPullThroughCacheRuleProps):
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
  }
}
