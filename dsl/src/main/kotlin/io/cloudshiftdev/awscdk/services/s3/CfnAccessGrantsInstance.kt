package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessGrantsInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAccessGrantsInstanceArn(): String =
      unwrap(this).getAttrAccessGrantsInstanceArn()

  public open fun attrAccessGrantsInstanceId(): String =
      unwrap(this).getAttrAccessGrantsInstanceId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun identityCenterArn(): String? = unwrap(this).getIdentityCenterArn()

  public open fun identityCenterArn(`value`: String) {
    unwrap(this).setIdentityCenterArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun identityCenterArn(identityCenterArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantsInstance.Builder.create(scope, id)

    override fun identityCenterArn(identityCenterArn: String) {
      cdkBuilder.identityCenterArn(identityCenterArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrantsInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrantsInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance):
        CfnAccessGrantsInstance = CfnAccessGrantsInstance(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsInstance):
        software.amazon.awscdk.services.s3.CfnAccessGrantsInstance = wrapped.cdkObject
  }
}
