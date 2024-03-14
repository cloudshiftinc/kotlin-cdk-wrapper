package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVehicle internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

  public open fun associationBehavior(`value`: String) {
    unwrap(this).setAssociationBehavior(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  public open fun decoderManifestArn(): String = unwrap(this).getDecoderManifestArn()

  public open fun decoderManifestArn(`value`: String) {
    unwrap(this).setDecoderManifestArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

  public open fun modelManifestArn(`value`: String) {
    unwrap(this).setModelManifestArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun associationBehavior(associationBehavior: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun decoderManifestArn(decoderManifestArn: String)

    public fun modelManifestArn(modelManifestArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle.Builder.create(scope, id)

    override fun associationBehavior(associationBehavior: String) {
      cdkBuilder.associationBehavior(associationBehavior)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun decoderManifestArn(decoderManifestArn: String) {
      cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicle = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVehicle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVehicle(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle):
        CfnVehicle = CfnVehicle(cdkObject)

    internal fun unwrap(wrapped: CfnVehicle):
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle = wrapped.cdkObject
  }
}
