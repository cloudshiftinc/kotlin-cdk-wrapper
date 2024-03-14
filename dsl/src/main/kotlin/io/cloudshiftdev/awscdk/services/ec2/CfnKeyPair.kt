package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKeyPair internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPair,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrKeyFingerprint(): String = unwrap(this).getAttrKeyFingerprint()

  public open fun attrKeyPairId(): String = unwrap(this).getAttrKeyPairId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyFormat(): String? = unwrap(this).getKeyFormat()

  public open fun keyFormat(`value`: String) {
    unwrap(this).setKeyFormat(`value`)
  }

  public open fun keyName(): String = unwrap(this).getKeyName()

  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  public open fun keyType(): String? = unwrap(this).getKeyType()

  public open fun keyType(`value`: String) {
    unwrap(this).setKeyType(`value`)
  }

  public open fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  public open fun publicKeyMaterial(`value`: String) {
    unwrap(this).setPublicKeyMaterial(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun keyFormat(keyFormat: String)

    public fun keyName(keyName: String)

    public fun keyType(keyType: String)

    public fun publicKeyMaterial(publicKeyMaterial: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnKeyPair.Builder =
        software.amazon.awscdk.services.ec2.CfnKeyPair.Builder.create(scope, id)

    override fun keyFormat(keyFormat: String) {
      cdkBuilder.keyFormat(keyFormat)
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnKeyPair = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyPair {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyPair(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPair): CfnKeyPair =
        CfnKeyPair(cdkObject)

    internal fun unwrap(wrapped: CfnKeyPair): software.amazon.awscdk.services.ec2.CfnKeyPair =
        wrapped.cdkObject
  }
}
