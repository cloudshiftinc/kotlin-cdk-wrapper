package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWALWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()

  public open fun walWorkspaceName(`value`: String) {
    unwrap(this).setWalWorkspaceName(`value`)
  }

  public interface Builder {
    public fun tags(tags: List<CfnTag>) {
    }

    public fun walWorkspaceName(walWorkspaceName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnWALWorkspace.Builder =
        software.amazon.awscdk.services.emr.CfnWALWorkspace.Builder.create(scope, id)

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun walWorkspaceName(walWorkspaceName: String) {
      cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnWALWorkspace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWALWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWALWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspace):
        CfnWALWorkspace = CfnWALWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWALWorkspace):
        software.amazon.awscdk.services.emr.CfnWALWorkspace = wrapped.cdkObject
  }
}
