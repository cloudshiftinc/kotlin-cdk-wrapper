package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDirectoryRegistration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrDirectoryRegistrationArn(): String =
      unwrap(this).getAttrDirectoryRegistrationArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public interface Builder {
    public fun directoryId(directoryId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration.Builder.create(scope,
        id)

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryRegistration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryRegistration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration):
        CfnDirectoryRegistration = CfnDirectoryRegistration(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryRegistration):
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration = wrapped.cdkObject
  }
}
