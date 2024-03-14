package io.cloudshiftdev.awscdk.services.iot

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

public open class CfnPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun policyName(): String? = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnPolicy.Builder =
        software.amazon.awscdk.services.iot.CfnPolicy.Builder.create(scope, id)

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnPolicy): CfnPolicy =
        CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.iot.CfnPolicy =
        wrapped.cdkObject
  }
}
