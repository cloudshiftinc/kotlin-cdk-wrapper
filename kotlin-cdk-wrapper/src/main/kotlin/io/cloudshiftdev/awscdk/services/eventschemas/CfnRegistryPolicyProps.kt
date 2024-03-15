@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnRegistryPolicyProps {
  public fun policy(): Any

  public fun registryName(): String

  public fun revisionId(): String? = unwrap(this).getRevisionId()

  @CdkDslMarker
  public interface Builder {
    public fun policy(policy: Any)

    public fun registryName(registryName: String)

    public fun revisionId(revisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.builder()

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    override fun revisionId(revisionId: String) {
      cdkBuilder.revisionId(revisionId)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps,
  ) : CdkObject(cdkObject), CfnRegistryPolicyProps {
    override fun policy(): Any = unwrap(this).getPolicy()

    override fun registryName(): String = unwrap(this).getRegistryName()

    override fun revisionId(): String? = unwrap(this).getRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps):
        CfnRegistryPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicyProps):
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
  }
}
