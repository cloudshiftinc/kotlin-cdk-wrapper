package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnCustomEntityType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityType,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

  public open fun contextWords(`value`: List<String>) {
    unwrap(this).setContextWords(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun regexString(): String? = unwrap(this).getRegexString()

  public open fun regexString(`value`: String) {
    unwrap(this).setRegexString(`value`)
  }

  public open fun tags(): Any? = unwrap(this).getTags()

  public open fun tags(`value`: Any) {
    unwrap(this).setTags(`value`)
  }

  public interface Builder {
    public fun contextWords(contextWords: List<String>)

    public fun name(name: String)

    public fun regexString(regexString: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCustomEntityType.Builder =
        software.amazon.awscdk.services.glue.CfnCustomEntityType.Builder.create(scope, id)

    override fun contextWords(contextWords: List<String>) {
      cdkBuilder.contextWords(contextWords)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regexString(regexString: String) {
      cdkBuilder.regexString(regexString)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnCustomEntityType =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomEntityType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomEntityType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityType):
        CfnCustomEntityType = CfnCustomEntityType(cdkObject)

    internal fun unwrap(wrapped: CfnCustomEntityType):
        software.amazon.awscdk.services.glue.CfnCustomEntityType = wrapped.cdkObject
  }
}
