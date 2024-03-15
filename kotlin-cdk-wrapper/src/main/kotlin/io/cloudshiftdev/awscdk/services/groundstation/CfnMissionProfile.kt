@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMissionProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrRegion(): String = unwrap(this).getAttrRegion()

  public open fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  public open fun contactPostPassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPostPassDurationSeconds(`value`)
  }

  public open fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  public open fun contactPrePassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPrePassDurationSeconds(`value`)
  }

  public open fun dataflowEdges(): Any = unwrap(this).getDataflowEdges()

  public open fun dataflowEdges(`value`: IResolvable) {
    unwrap(this).setDataflowEdges(`value`.let(IResolvable::unwrap))
  }

  public open fun dataflowEdges(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataflowEdges(__idx_ac66f0)
  }

  public open fun dataflowEdges(vararg __idx_ac66f0: Any): Unit =
      dataflowEdges(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun minimumViableContactDurationSeconds(): Number =
      unwrap(this).getMinimumViableContactDurationSeconds()

  public open fun minimumViableContactDurationSeconds(`value`: Number) {
    unwrap(this).setMinimumViableContactDurationSeconds(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

  public open fun streamsKmsKey(`value`: IResolvable) {
    unwrap(this).setStreamsKmsKey(`value`.let(IResolvable::unwrap))
  }

  public open fun streamsKmsKey(`value`: StreamsKmsKeyProperty) {
    unwrap(this).setStreamsKmsKey(`value`.let(StreamsKmsKeyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f3863d9084b4f2b76f507b753b13a5b0fe4dedbd1bc86cfb909b0c063605f13")
  public open fun streamsKmsKey(`value`: StreamsKmsKeyProperty.Builder.() -> Unit): Unit =
      streamsKmsKey(StreamsKmsKeyProperty(`value`))

  public open fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

  public open fun streamsKmsRole(`value`: String) {
    unwrap(this).setStreamsKmsRole(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun trackingConfigArn(): String = unwrap(this).getTrackingConfigArn()

  public open fun trackingConfigArn(`value`: String) {
    unwrap(this).setTrackingConfigArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    public fun dataflowEdges(dataflowEdges: IResolvable)

    public fun dataflowEdges(dataflowEdges: List<Any>)

    public fun dataflowEdges(vararg dataflowEdges: Any)

    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number)

    public fun name(name: String)

    public fun streamsKmsKey(streamsKmsKey: IResolvable)

    public fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a09ec7ec13e230f3f45aa7de99c440ccde072210f485be7f3c016e1744c5370")
    public fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty.Builder.() -> Unit)

    public fun streamsKmsRole(streamsKmsRole: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trackingConfigArn(trackingConfigArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnMissionProfile.Builder
        = software.amazon.awscdk.services.groundstation.CfnMissionProfile.Builder.create(scope, id)

    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    override fun dataflowEdges(dataflowEdges: IResolvable) {
      cdkBuilder.dataflowEdges(dataflowEdges.let(IResolvable::unwrap))
    }

    override fun dataflowEdges(dataflowEdges: List<Any>) {
      cdkBuilder.dataflowEdges(dataflowEdges)
    }

    override fun dataflowEdges(vararg dataflowEdges: Any): Unit =
        dataflowEdges(dataflowEdges.toList())

    override fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
      cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun streamsKmsKey(streamsKmsKey: IResolvable) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(IResolvable::unwrap))
    }

    override fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(StreamsKmsKeyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a09ec7ec13e230f3f45aa7de99c440ccde072210f485be7f3c016e1744c5370")
    override fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty.Builder.() -> Unit): Unit =
        streamsKmsKey(StreamsKmsKeyProperty(streamsKmsKey))

    override fun streamsKmsRole(streamsKmsRole: String) {
      cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trackingConfigArn(trackingConfigArn: String) {
      cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): software.amazon.awscdk.services.groundstation.CfnMissionProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.groundstation.CfnMissionProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMissionProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMissionProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile):
        CfnMissionProfile = CfnMissionProfile(cdkObject)

    internal fun unwrap(wrapped: CfnMissionProfile):
        software.amazon.awscdk.services.groundstation.CfnMissionProfile = wrapped.cdkObject
  }

  public interface StreamsKmsKeyProperty {
    public fun kmsAliasArn(): String? = unwrap(this).getKmsAliasArn()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    @CdkDslMarker
    public interface Builder {
      public fun kmsAliasArn(kmsAliasArn: String)

      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty.builder()

      override fun kmsAliasArn(kmsAliasArn: String) {
        cdkBuilder.kmsAliasArn(kmsAliasArn)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty,
    ) : CdkObject(cdkObject), StreamsKmsKeyProperty {
      override fun kmsAliasArn(): String? = unwrap(this).getKmsAliasArn()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamsKmsKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty):
          StreamsKmsKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamsKmsKeyProperty):
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty
    }
  }

  public interface DataflowEdgeProperty {
    public fun destination(): String? = unwrap(this).getDestination()

    public fun source(): String? = unwrap(this).getSource()

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: String)

      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty,
    ) : CdkObject(cdkObject), DataflowEdgeProperty {
      override fun destination(): String? = unwrap(this).getDestination()

      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEdgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty):
          DataflowEdgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataflowEdgeProperty):
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty
    }
  }
}