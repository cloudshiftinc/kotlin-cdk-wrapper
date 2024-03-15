@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun datasetName(): String

  public fun name(): String

  public fun recipeName(): String

  public fun roleArn(): String

  public fun sample(): Any? = unwrap(this).getSample()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun datasetName(datasetName: String)

    public fun name(name: String)

    public fun recipeName(recipeName: String)

    public fun roleArn(roleArn: String)

    public fun sample(sample: IResolvable)

    public fun sample(sample: CfnProject.SampleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ddcbb306a3f411bd3d7f9e8e326b92b4003886f727115b5e262991874dd32a")
    public fun sample(sample: CfnProject.SampleProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnProjectProps.Builder =
        software.amazon.awscdk.services.databrew.CfnProjectProps.builder()

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

    override fun sample(sample: CfnProject.SampleProperty) {
      cdkBuilder.sample(sample.let(CfnProject.SampleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ddcbb306a3f411bd3d7f9e8e326b92b4003886f727115b5e262991874dd32a")
    override fun sample(sample: CfnProject.SampleProperty.Builder.() -> Unit): Unit =
        sample(CfnProject.SampleProperty(sample))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun datasetName(): String = unwrap(this).getDatasetName()

    override fun name(): String = unwrap(this).getName()

    override fun recipeName(): String = unwrap(this).getRecipeName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun sample(): Any? = unwrap(this).getSample()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.databrew.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnProjectProps
  }
}
