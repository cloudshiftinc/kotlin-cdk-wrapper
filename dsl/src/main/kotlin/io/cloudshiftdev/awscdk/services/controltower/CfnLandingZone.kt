package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLandingZone internal constructor(
  private val cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZone,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDriftStatus(): String = unwrap(this).getAttrDriftStatus()

  public open fun attrLandingZoneIdentifier(): String = unwrap(this).getAttrLandingZoneIdentifier()

  public open fun attrLatestAvailableVersion(): String =
      unwrap(this).getAttrLatestAvailableVersion()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun manifest(): Any = unwrap(this).getManifest()

  public open fun manifest(`value`: Any) {
    unwrap(this).setManifest(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun manifest(manifest: Any) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun version(version: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnLandingZone.Builder =
        software.amazon.awscdk.services.controltower.CfnLandingZone.Builder.create(scope, id)

    public override fun manifest(manifest: Any) {
      cdkBuilder.manifest(manifest)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnLandingZone =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLandingZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLandingZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZone):
        CfnLandingZone = CfnLandingZone(cdkObject)

    internal fun unwrap(wrapped: CfnLandingZone):
        software.amazon.awscdk.services.controltower.CfnLandingZone = wrapped.cdkObject
  }
}
