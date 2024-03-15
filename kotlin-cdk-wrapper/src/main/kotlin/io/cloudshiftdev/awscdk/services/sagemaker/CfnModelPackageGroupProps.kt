@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnModelPackageGroupProps {
  public fun modelPackageGroupDescription(): String? =
      unwrap(this).getModelPackageGroupDescription()

  public fun modelPackageGroupName(): String

  public fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun modelPackageGroupDescription(modelPackageGroupDescription: String)

    public fun modelPackageGroupName(modelPackageGroupName: String)

    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps.builder()

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

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps,
  ) : CdkObject(cdkObject), CfnModelPackageGroupProps {
    override fun modelPackageGroupDescription(): String? =
        unwrap(this).getModelPackageGroupDescription()

    override fun modelPackageGroupName(): String = unwrap(this).getModelPackageGroupName()

    override fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelPackageGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps):
        CfnModelPackageGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackageGroupProps):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
  }
}
