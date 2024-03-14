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

public open class CfnAccessGrantsLocation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAccessGrantsLocationArn(): String =
      unwrap(this).getAttrAccessGrantsLocationArn()

  public open fun attrAccessGrantsLocationId(): String =
      unwrap(this).getAttrAccessGrantsLocationId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun locationScope(): String? = unwrap(this).getLocationScope()

  public open fun locationScope(`value`: String) {
    unwrap(this).setLocationScope(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun iamRoleArn(iamRoleArn: String)

    public fun locationScope(locationScope: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocation.Builder.create(scope, id)

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun locationScope(locationScope: String) {
      cdkBuilder.locationScope(locationScope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsLocation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrantsLocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrantsLocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation):
        CfnAccessGrantsLocation = CfnAccessGrantsLocation(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsLocation):
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocation = wrapped.cdkObject
  }
}
