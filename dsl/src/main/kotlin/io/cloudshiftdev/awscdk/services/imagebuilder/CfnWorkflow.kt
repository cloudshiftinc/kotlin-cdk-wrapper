package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkflow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

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

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun uri(): String? = unwrap(this).getUri()

  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun changeDescription(changeDescription: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)

    public fun uri(uri: String)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnWorkflow.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnWorkflow.Builder.create(scope, id)

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

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflow):
        CfnWorkflow = CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow):
        software.amazon.awscdk.services.imagebuilder.CfnWorkflow = wrapped.cdkObject
  }
}
