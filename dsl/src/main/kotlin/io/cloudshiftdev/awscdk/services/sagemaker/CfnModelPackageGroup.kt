package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModelPackageGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrModelPackageGroupArn(): String = unwrap(this).getAttrModelPackageGroupArn()

  public open fun attrModelPackageGroupStatus(): String =
      unwrap(this).getAttrModelPackageGroupStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelPackageGroupDescription(): String? =
      unwrap(this).getModelPackageGroupDescription()

  public open fun modelPackageGroupDescription(`value`: String) {
    unwrap(this).setModelPackageGroupDescription(`value`)
  }

  public open fun modelPackageGroupName(): String = unwrap(this).getModelPackageGroupName()

  public open fun modelPackageGroupName(`value`: String) {
    unwrap(this).setModelPackageGroupName(`value`)
  }

  public open fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

  public open fun modelPackageGroupPolicy(`value`: Any) {
    unwrap(this).setModelPackageGroupPolicy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun modelPackageGroupDescription(modelPackageGroupDescription: String)

    public fun modelPackageGroupName(modelPackageGroupName: String)

    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.Builder.create(scope, id)

    override fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
      cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
    }

    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    override fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
      cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelPackageGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelPackageGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup):
        CfnModelPackageGroup = CfnModelPackageGroup(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackageGroup):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup = wrapped.cdkObject
  }
}
