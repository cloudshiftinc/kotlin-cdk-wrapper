package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkflow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

  public open fun defaultRunProperties(`value`: Any) {
    unwrap(this).setDefaultRunProperties(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

  public open fun maxConcurrentRuns(`value`: Number) {
    unwrap(this).setMaxConcurrentRuns(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun defaultRunProperties(defaultRunProperties: Any)

    public fun description(description: String)

    public fun maxConcurrentRuns(maxConcurrentRuns: Number)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnWorkflow.Builder =
        software.amazon.awscdk.services.glue.CfnWorkflow.Builder.create(scope, id)

    override fun defaultRunProperties(defaultRunProperties: Any) {
      cdkBuilder.defaultRunProperties(defaultRunProperties)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
      cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnWorkflow = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnWorkflow): CfnWorkflow =
        CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.glue.CfnWorkflow =
        wrapped.cdkObject
  }
}
