package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDestinationDetails(): IResolvable =
      unwrap(this).getAttrDestinationDetails().let(IResolvable::wrap)

  public open fun attrDestinationDetailsStatus(): String =
      unwrap(this).getAttrDestinationDetailsStatus()

  public open fun attrDestinationDetailsUri(): String = unwrap(this).getAttrDestinationDetailsUri()

  public open fun attrEventStreamArn(): String = unwrap(this).getAttrEventStreamArn()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun eventStreamName(): String = unwrap(this).getEventStreamName()

  public open fun eventStreamName(`value`: String) {
    unwrap(this).setEventStreamName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun uri(): String = unwrap(this).getUri()

  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  public interface Builder {
    public fun domainName(domainName: String)

    public fun eventStreamName(eventStreamName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uri(uri: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnEventStream.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnEventStream.Builder.create(scope, id)

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun eventStreamName(eventStreamName: String) {
      cdkBuilder.eventStreamName(eventStreamName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnEventStream =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream):
        CfnEventStream = CfnEventStream(cdkObject)

    internal fun unwrap(wrapped: CfnEventStream):
        software.amazon.awscdk.services.customerprofiles.CfnEventStream = wrapped.cdkObject
  }

  public interface DestinationDetailsProperty {
    public fun status(): String

    public fun uri(): String

    public interface Builder {
      public fun status(status: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty,
    ) : DestinationDetailsProperty {
      override fun status(): String = unwrap(this).getStatus()

      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty):
          DestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
