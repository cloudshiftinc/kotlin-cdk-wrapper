@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnServiceTemplateProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public fun name(): String? = unwrap(this).getName()

  public fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun encryptionKey(encryptionKey: String)

    public fun name(name: String)

    public fun pipelineProvisioning(pipelineProvisioning: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.proton.CfnServiceTemplateProps.Builder =
        software.amazon.awscdk.services.proton.CfnServiceTemplateProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pipelineProvisioning(pipelineProvisioning: String) {
      cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnServiceTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplateProps,
  ) : CdkObject(cdkObject), CfnServiceTemplateProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    override fun name(): String? = unwrap(this).getName()

    override fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplateProps):
        CfnServiceTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceTemplateProps):
        software.amazon.awscdk.services.proton.CfnServiceTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.proton.CfnServiceTemplateProps
  }
}
