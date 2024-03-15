@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPullThroughCacheRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun credentialArn(): String? = unwrap(this).getCredentialArn()

  public open fun credentialArn(`value`: String) {
    unwrap(this).setCredentialArn(`value`)
  }

  public open fun ecrRepositoryPrefix(): String? = unwrap(this).getEcrRepositoryPrefix()

  public open fun ecrRepositoryPrefix(`value`: String) {
    unwrap(this).setEcrRepositoryPrefix(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun upstreamRegistry(): String? = unwrap(this).getUpstreamRegistry()

  public open fun upstreamRegistry(`value`: String) {
    unwrap(this).setUpstreamRegistry(`value`)
  }

  public open fun upstreamRegistryUrl(): String? = unwrap(this).getUpstreamRegistryUrl()

  public open fun upstreamRegistryUrl(`value`: String) {
    unwrap(this).setUpstreamRegistryUrl(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun credentialArn(credentialArn: String)

    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String)

    public fun upstreamRegistry(upstreamRegistry: String)

    public fun upstreamRegistryUrl(upstreamRegistryUrl: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.Builder =
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPullThroughCacheRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPullThroughCacheRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule):
        CfnPullThroughCacheRule = CfnPullThroughCacheRule(cdkObject)

    internal fun unwrap(wrapped: CfnPullThroughCacheRule):
        software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule = wrapped.cdkObject
  }
}
