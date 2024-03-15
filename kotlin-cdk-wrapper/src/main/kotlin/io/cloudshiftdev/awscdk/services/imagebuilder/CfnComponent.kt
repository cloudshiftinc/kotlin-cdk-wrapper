@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnComponent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrEncrypted(): IResolvable =
      unwrap(this).getAttrEncrypted().let(IResolvable::wrap)

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun changeDescription(): String? = unwrap(this).getChangeDescription()

  public open fun changeDescription(`value`: String) {
    unwrap(this).setChangeDescription(`value`)
  }

  public open fun `data`(): String? = unwrap(this).getData()

  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun platform(): String = unwrap(this).getPlatform()

  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  public open fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
      emptyList()

  public open fun supportedOsVersions(`value`: List<String>) {
    unwrap(this).setSupportedOsVersions(`value`)
  }

  public open fun supportedOsVersions(vararg `value`: String): Unit =
      supportedOsVersions(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun uri(): String? = unwrap(this).getUri()

  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun changeDescription(changeDescription: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun supportedOsVersions(supportedOsVersions: List<String>)

    public fun supportedOsVersions(vararg supportedOsVersions: String)

    public fun tags(tags: Map<String, String>)

    public fun uri(uri: String)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnComponent.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnComponent.Builder.create(scope, id)

    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun supportedOsVersions(supportedOsVersions: List<String>) {
      cdkBuilder.supportedOsVersions(supportedOsVersions)
    }

    override fun supportedOsVersions(vararg supportedOsVersions: String): Unit =
        supportedOsVersions(supportedOsVersions.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnComponent =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnComponent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponent):
        CfnComponent = CfnComponent(cdkObject)

    internal fun unwrap(wrapped: CfnComponent):
        software.amazon.awscdk.services.imagebuilder.CfnComponent = wrapped.cdkObject
  }
}
