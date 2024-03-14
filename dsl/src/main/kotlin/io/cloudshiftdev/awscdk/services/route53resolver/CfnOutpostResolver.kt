package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOutpostResolver internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolver,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceCount(): Number? = unwrap(this).getInstanceCount()

  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outpostArn(): String = unwrap(this).getOutpostArn()

  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  public open fun preferredInstanceType(): String = unwrap(this).getPreferredInstanceType()

  public open fun preferredInstanceType(`value`: String) {
    unwrap(this).setPreferredInstanceType(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun instanceCount(instanceCount: Number)

    public fun name(name: String)

    public fun outpostArn(outpostArn: String)

    public fun preferredInstanceType(preferredInstanceType: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver.Builder =
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver.Builder.create(scope, id)

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnOutpostResolver =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOutpostResolver {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOutpostResolver(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolver):
        CfnOutpostResolver = CfnOutpostResolver(cdkObject)

    internal fun unwrap(wrapped: CfnOutpostResolver):
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver = wrapped.cdkObject
  }
}
