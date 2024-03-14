package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun datasetName(): String = unwrap(this).getDatasetName()

  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recipeName(): String = unwrap(this).getRecipeName()

  public open fun recipeName(`value`: String) {
    unwrap(this).setRecipeName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun sample(): Any? = unwrap(this).getSample()

  public open fun sample(`value`: IResolvable) {
    unwrap(this).setSample(`value`.let(IResolvable::unwrap))
  }

  public open fun sample(`value`: SampleProperty) {
    unwrap(this).setSample(`value`.let(SampleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76013231adedb9c8516d2a2367dedb7ca8b9effd85a2f3c9d94bc63d05375634")
  public open fun sample(`value`: SampleProperty.Builder.() -> Unit): Unit =
      sample(SampleProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun datasetName(datasetName: String)

    public fun name(name: String)

    public fun recipeName(recipeName: String)

    public fun roleArn(roleArn: String)

    public fun sample(sample: IResolvable)

    public fun sample(sample: SampleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3d5139527d6c03889a0fefa8ee2540297e40f654309f3677204b85a64024a2d")
    public fun sample(sample: SampleProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnProject.Builder =
        software.amazon.awscdk.services.databrew.CfnProject.Builder.create(scope, id)

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recipeName(recipeName: String) {
      cdkBuilder.recipeName(recipeName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun sample(sample: IResolvable) {
      cdkBuilder.sample(sample.let(IResolvable::unwrap))
    }

    override fun sample(sample: SampleProperty) {
      cdkBuilder.sample(sample.let(SampleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3d5139527d6c03889a0fefa8ee2540297e40f654309f3677204b85a64024a2d")
    override fun sample(sample: SampleProperty.Builder.() -> Unit): Unit =
        sample(SampleProperty(sample))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.databrew.CfnProject =
        wrapped.cdkObject
  }

  public interface SampleProperty {
    public fun size(): Number? = unwrap(this).getSize()

    public fun type(): String

    public interface Builder {
      public fun size(size: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.builder()

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnProject.SampleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnProject.SampleProperty,
    ) : SampleProperty {
      override fun size(): Number? = unwrap(this).getSize()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SampleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnProject.SampleProperty):
          SampleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleProperty):
          software.amazon.awscdk.services.databrew.CfnProject.SampleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
